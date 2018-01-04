package com.hazelcast.gradle.operations;

import com.hazelcast.config.Config;
import com.hazelcast.config.NetworkConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;

import java.util.Arrays;

public class ExecutorServiceExample {

	public static void main( String[] args ) throws Exception
	{

		// Prepare Hazelcast cluster
		HazelcastInstance hazelcastInstance = buildCluster(1);

		try
		{

			IExecutorService executorService = hazelcastInstance.getExecutorService("default");
			Runnable runnable = wrap(
					( hz ) -> System.out.println("\n$$$$$$$$$$$\nHello from Node: " + hz.getCluster().getLocalMember().getUuid()+"\n$$$$$$$$$$$\\n"));
			executorService.executeOnAllMembers(runnable);

		}
		finally
		{
			// Shutdown cluster
			Hazelcast.shutdownAll();
		}
	}

	private static Runnable wrap( Java8Runnable runnable )
	{




		return new Java8RunnableAdapter(runnable);
	}

	private static HazelcastInstance buildCluster( int memberCount )
	{
		HazelcastInstance hazelcastClient = Reader.getHazelcastClient();
		return  hazelcastClient;
		/*Config config = new Config();
		NetworkConfig networkConfig = config.getNetworkConfig();
		networkConfig.getJoin().getMulticastConfig().setEnabled(false);
		networkConfig.getJoin().getTcpIpConfig().setEnabled(true);
		networkConfig.getJoin().getTcpIpConfig().setMembers(Arrays.asList(new String[] { "127.0.0.1" }));
		Maps
		HazelcastInstance[] hazelcastInstances = new HazelcastInstance[memberCount];
		for( int i = 0; i < memberCount; i++ )
		{
			hazelcastInstances[i] = Hazelcast.newHazelcastInstance(config);
		}
		return hazelcastInstances[0];*/
	}
}