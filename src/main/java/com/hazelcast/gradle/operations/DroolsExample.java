package com.hazelcast.gradle.operations;

import com.hazelcast.config.Config;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.core.Member;
import com.hazelcast.gradle.pojo.Cards;
import com.hazelcast.instance.MemberImpl;
import com.hazelcast.nio.Address;
import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.Message;
import org.kie.api.builder.Results;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.io.StringReader;
import java.util.Arrays;

public class DroolsExample {

	public static void main( String[] args ) throws Exception
	{

		// Prepare Hazelcast cluster
		HazelcastInstance hazelcastInstance = buildCluster(1);

		try
		{

			IExecutorService executorService = hazelcastInstance.getExecutorService("default2");
			DroolsRunnable runnable = () -> {
				System.out.println("$$$$$$$$$$$$ Starting KIE $$%$$$$$$$$$$$");




				KieServices kieServices = null;
				try
				{
					kieServices = KieServices.Factory.get();
				}
				catch( Exception e )
				{
					e.printStackTrace();
				}
				finally
				{
					System.out.println("$$$$$$$$$$$$ Checkpoint7: Exception $$$$$$$$$$$$$");
				}

				System.out.println("$$$$$$$$$$$$ Checkpoint0: resource loaded $$$$$$$$$$$$$");

				KieFileSystem kfs = kieServices.newKieFileSystem();
				String testRuleString = "import com.hazelcast.gradle.pojo.Cards;\n"
						+ "rule \"Data Cards \"\n" + "salience 0\n" + "  when\n"
						+ "   $total : Number() from accumulate(\n" + "        Cards( $cards : CARD_NO),\n"
						+ "         count($cards) )        \n" + "then\n"
						+ "  System.out.println(\"(salience 0)Count=\"+ $total);\n" + "end";

				kfs.write("src/main/resources/temp-rule.drl",

						kieServices.getResources().newReaderResource(new StringReader(testRuleString)));
				System.out.println("$$$$$$$$$$$$ Checkpoint1: Rule loaded $$$$$$$$$$$$$");

				KieBuilder kieBuilder = kieServices.newKieBuilder(kfs).buildAll();
				System.out.println("$$$$$$$$$$$$ Checkpoint2: KIE completed building $$$$$$$$$$$$$");
				// check there have been no errors for rule setup

				Results results = kieBuilder.getResults();

				if( results.hasMessages(Message.Level.ERROR) )
				{

					System.out.println(results.getMessages());

					throw new IllegalStateException("### errors ###");

				}

				KieContainer kieContainer = kieServices.newKieContainer(kieBuilder.getKieModule().getReleaseId());
				System.out.println("$$$$$$$$$$$$ Checkpoint3: KIE container created $$$$$$$$$$$$$");

				KieSession kieSession = kieContainer.newKieSession();


				// insert facts and fire rules

				Cards cards = new Cards();
				cards.setCARD_NO("bbb");
				cards.setCACC_NO(10);
				kieSession.insert(cards);
				System.out.println("$$$$$$$$$$$$ Checkpoint4: KIE session created $$$$$$$$$$$$$");
				int i = -1;
				i= kieSession.fireAllRules();

				System.out.println("##########\nResult : " + i+"\n##########");

				kieSession.dispose();

				System.out.println("$$$$$$$$$$$$ Checkpoint5: KIE session disposed $$$$$$$$$$$$$");

			};


			executorService.executeOnAllMembers(runnable);

		}
		finally
		{
			// Shutdown cluster
			//hazelcastInstance.shutdown();
		}
		System.out.println("$$$$$$$$$$$$ Checkpoint6: Exit $$$$$$$$$$$$$");
	}

	private static Runnable wrap( Java8Runnable runnable )
	{

		return new Java8RunnableAdapter(runnable);
	}

	private static HazelcastInstance buildCluster( int memberCount )
	{
	HazelcastInstance hazelcastClient = Reader.getHazelcastClient();
		return hazelcastClient;
	/*	Config config = new Config();
		NetworkConfig networkConfig = config.getNetworkConfig();
		networkConfig.getJoin().getMulticastConfig().setEnabled(false);
		networkConfig.getJoin().getTcpIpConfig().setEnabled(true);
		networkConfig.getJoin().getTcpIpConfig().setMembers(Arrays.asList(new String[] { "127.0.0.1" }));
		HazelcastInstance[] hazelcastInstances = new HazelcastInstance[memberCount];
		for( int i = 0; i < memberCount; i++ )
		{
			hazelcastInstances[i] = Hazelcast.newHazelcastInstance(config);
		}
		return hazelcastInstances[0];*/
	}
}