package com.hazelcast.gradle.operations;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IList;
import com.hazelcast.core.IMap;
import com.hazelcast.core.IQueue;
import com.hazelcast.gradle.pojo.Cards;
import com.hazelcast.gradle.pojo.Incmsg_Auth;
import java.net.MalformedURLException;

public class DataUploader {

	public static void main( String[] args ) throws MalformedURLException
	{
//		ClientConfig clientConfig = new ClientConfig();
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("172.16.23.6:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		IQueue<Cards> cardsIQueue = client.getQueue("cards");
		IQueue<Incmsg_Auth> incmsgAuths = client.getQueue("incmsg_auth");


		Incmsg_Auth incmsg_auth=new Incmsg_Auth();
		incmsg_auth.setMSG_TRXN_TYPE(4);
		incmsg_auth.setMSG_TRXN_MODE(3);
		Cards cards = new Cards();
		cards.setCARD_NO("bbb");
		cards.setCACC_NO(10);
		incmsgAuths.add(incmsg_auth);
		cardsIQueue.add(cards);
		client.shutdown();
	}

}
