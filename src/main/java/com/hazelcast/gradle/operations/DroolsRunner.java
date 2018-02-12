package com.hazelcast.gradle.operations;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.core.IList;
import com.hazelcast.gradle.pojo.Cards;
import com.hazelcast.gradle.pojo.Incmsg_Auth;
import com.hazelcast.monitor.LocalExecutorStats;
import org.kie.api.KieServices;
import org.kie.api.KieServices.Factory;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message.Level;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.io.StringReader;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;

public class DroolsRunner {
	private static String DELIMITER = "\n";

	public DroolsRunner() {
	}

	public static void main(String[] args) throws Exception
	{
		HazelcastInstance hazelcastInstance = null;
		if( args.length == 0 )
			hazelcastInstance = Reader.getHazelcastClient();
		else
			hazelcastInstance = Reader.buildCluster(1);
		IExecutorService executorService = hazelcastInstance.getExecutorService("rule_runner");


		/*Extracting Rule from Hazelcast*/
		ConcurrentMap<String, String> map = hazelcastInstance.getMap("rules");

		StringBuilder testRuleString = new StringBuilder();
		Iterator var4 = map.keySet().iterator();

		while( var4.hasNext() )
		{
			String key = (String) var4.next();
			testRuleString.append((String) map.get(key));
			testRuleString.append(DELIMITER);
		}
		/* Rule Extraction from Hazelcast complete*/
		/* Extracting Data From Hazelcast */
		Incmsg_Auth incmsg_auth = (Incmsg_Auth) hazelcastInstance.getQueue("incmsg_auth").peek();
		Cards cards = (Cards) hazelcastInstance.getQueue("cards").peek();
		/* Extracted Data From Hazelcast */

		DroolsRunnable runnable = () -> {
			//System.out.println("$$$$$$$$$$$$ Starting KIE $$%$$$$$$$$$$$");
			KieServices kieServices = null;

			try
			{
				kieServices = Factory.get();
			}
			catch( Exception var13 )
			{
				var13.printStackTrace();
			}
			finally
			{
				//System.out.println("$$$$$$$$$$$$ Checkpoint7: Exception $$$$$$$$$$$$$");
			}

			//System.out.println("$$$$$$$$$$$$ Checkpoint0: resource loaded $$$$$$$$$$$$$");

			KieFileSystem kfs = kieServices.newKieFileSystem();
			kfs.write("src/main/resources/temp-rule.drl", kieServices.getResources().newReaderResource(new StringReader(testRuleString.toString())));
			//System.out.println("$$$$$$$$$$$$ Checkpoint1: Rule loaded $$$$$$$$$$$$$");
			KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
			//System.out.println("$$$$$$$$$$$$ Checkpoint2: KIE completed building $$$$$$$$$$$$$");
			Results results = kieBuilder.getResults();
			if( results.hasMessages(new Level[] { Level.ERROR }) )
			{
				System.out.println(results.getMessages());
				throw new IllegalStateException("### errors ###");
			}
			else
			{
				KieContainer kieContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
				// System.out.println("$$$$$$$$$$$$ Checkpoint3: KIE container created $$$$$$$$$$$$$");
				KieSession kieSession = kieContainer.newKieSession();
				kieSession.insert(incmsg_auth);
				kieSession.insert(cards);
				//System.out.println("$$$$$$$$$$$$ Checkpoint4: KIE session created $$$$$$$$$$$$$");
				int i = kieSession.fireAllRules();
				System.out.println("##########\nNo of Rule(s) which got fired: " + i + "\n##########");
				kieSession.dispose();
				//System.out.println("$$$$$$$$$$$$ Checkpoint5: KIE session disposed $$$$$$$$$$$$$");
			}
		};
		executorService.executeOnAllMembers(runnable);

		//System.out.println("$$$$$$$$$$$$ Checkpoint6: Exit $$$$$$$$$$$$$");

		//hazelcastInstance.shutdown();
	}

	private static Runnable wrap(Java8Runnable runnable) {
		return new Java8RunnableAdapter(runnable);
	}


}
