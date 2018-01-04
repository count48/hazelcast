package com.hazelcast.gradle.operations;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.client.impl.HazelcastClientInstanceImpl;
import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class Writer {

	public static void main( String[] args ) throws MalformedURLException
	{
//		ClientConfig clientConfig = new ClientConfig();
		ClientConfig clientConfig = new ClientConfig();
		clientConfig.addAddress("172.16.23.6:5701");
		HazelcastInstance client = HazelcastClient.newHazelcastClient(clientConfig);
		IMap<String, String> map = client.getMap("my-distributed-map");

		map.put("key", "value");
		map.get("key");
		IMap<String, Integer> mapSeq = client.getMap("my-distributed-seq");
		mapSeq.put("seq",1);

		//Concurrent Map methods
		map.putIfAbsent("somekey", "somevalue");
		map.replace("key", "value", "valueNow");
		client.shutdown();
	}

}
