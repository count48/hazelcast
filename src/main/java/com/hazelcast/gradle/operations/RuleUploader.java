package com.hazelcast.gradle.operations;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import java.net.MalformedURLException;

public class RuleUploader {

	public static void main( String[] args ) throws MalformedURLException
	{
//		ClientConfig clientConfig = new ClientConfig();
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("172.16.23.6:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		IMap<String, String> map = client.getMap("rules");

		String testRuleString = "import com.hazelcast.gradle.pojo.Cards;\n"
				+ "rule \"Data Cards \"\n" + "salience 0\n" + "  when\n"
				+ "   $total : Number() from accumulate(\n" + "        Cards( $cards : CARD_NO),\n"
				+ "         count($cards) )        \n" + "then\n"
				+ "  System.out.println(\"(salience 0)Count=\"+ $total);\n" + "end";

		String testRuleString1 = "import com.hazelcast.gradle.pojo.Cards;\n"
				+ "rule \"Data Cards1 \"\n" + "salience 0\n" + "  when\n"
				+ "   $total : Number() from accumulate(\n" + "        Cards( $cards : CARD_NO),\n"
				+ "         count($cards) )        \n" + "then\n"
				+ "  System.out.println(\"(salience 0)Count=\"+ $total);\n" + "end";


		String testRuleTRXN_TYPE = "import com.hazelcast.gradle.pojo.Incmsg_Auth;\n"
				+ "rule \"MSG_TRXN_TYPE \"\n" + "salience 2\n" + "  when\n"
				+ "  $icsmg:Incmsg_Auth(MSG_TRXN_TYPE==4);\n" + "then\n"
				+ " System.out.println(\"MSG_TRXN_TYPE =\"+$icsmg.getMSG_TRXN_TYPE());\n" + "end";

		String testRuleMSG_TRXN_MODE = "import com.hazelcast.gradle.pojo.Incmsg_Auth;\n"
				+ "rule \"MSG_TRXN_MODE \"\n" + "salience 1\n" + "  when\n"
				+ "  $icsmg:Incmsg_Auth(MSG_TRXN_MODE==3);\n" + "then\n"
				+ " System.out.println(\"TRXN_MODE=\"+$icsmg.getMSG_TRXN_MODE());\n" + "end";



		//map.remove("rule4");
		//map.remove("rule5");

		map.putIfAbsent("rule4", testRuleTRXN_TYPE);
		map.putIfAbsent("rule5", testRuleMSG_TRXN_MODE);
		map.putIfAbsent("rule6", testRuleString);
		client.shutdown();
	}

}
