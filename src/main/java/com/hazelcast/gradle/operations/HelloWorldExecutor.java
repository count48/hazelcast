package com.hazelcast.gradle.operations;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.monitor.LocalExecutorStats;

public class HelloWorldExecutor {

	public static void main( String[] args ) throws Exception
	{

		// Prepare Hazelcast cluster
		HazelcastInstance hazelcastInstance = buildCluster(1);

		try
		{

			IExecutorService executorService = hazelcastInstance.getExecutorService("default");
			DroolsRunnable runnable = () -> {System.out.println(
					"\n$$$$$$$$$$$\n"+"Hello World"+ "\n$$$$$$$$$$$\\n");};
			executorService.executeOnAllMembers(runnable);
			LocalExecutorStats localExecutorStats = executorService.getLocalExecutorStats();
			long pendingTaskCount = localExecutorStats.getPendingTaskCount();
			while( pendingTaskCount > 0 )
			{
				continue;
			}

		}
		finally
		{
			// Shutdown cluster
			//hazelcastInstance.shutdown();
		}
	}

	private static Runnable wrap( Java8Runnable runnable )
	{

		return new Java8RunnableAdapter(runnable);
	}

	private static HazelcastInstance buildCluster( int memberCount )
	{
		HazelcastInstance hazelcastClient = Reader.getHazelcastClient();
		return hazelcastClient;
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