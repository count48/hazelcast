package com.hazelcast.gradle.operations;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import java.net.MalformedURLException;
import java.util.concurrent.ConcurrentMap;

public class Reader {

	public static void main( String[] args ) throws MalformedURLException
	{
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("172.16.23.6:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		ConcurrentMap<String, String> map = client.getMap("my-distributed-map-dev");

		String value = map.get("key");
		System.out.println("Value of in map for key " + value);
		IMap<String, Integer> mapSeq = client.getMap("my-distributed-seq");
		final Integer seq = mapSeq.get("seq");
		System.out.println("Read sequence " + seq);
		mapSeq.replace("seq", seq, seq+1);

		client.shutdown();
	}
	public static HazelcastInstance getHazelcastClient(){
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("172.16.23.6:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		return client;
	}

}
