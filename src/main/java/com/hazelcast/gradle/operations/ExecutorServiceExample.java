package com.hazelcast.gradle.operations;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;
import com.hazelcast.monitor.LocalExecutorStats;

public class ExecutorServiceExample {

	public static void main( String[] args ) throws Exception
	{

		// Prepare Hazelcast cluster
		HazelcastInstance hazelcastInstance = Reader.getHazelcastClient();

		try
		{

			IExecutorService executorService = hazelcastInstance.getExecutorService("default");
			Runnable runnable = wrap(( hz ) -> System.out.println(
					"\n$$$$$$$$$$$\nResponse from Node: " + hz.getCluster().getLocalMember().getUuid()
							+ "\n$$$$$$$$$$$\\n"));
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


}