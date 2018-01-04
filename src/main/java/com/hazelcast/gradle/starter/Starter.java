package com.hazelcast.gradle.starter;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

/**
 * TODO
 *
 * @author Viktor Gamov on 10/5/15.
 * Twitter: @gamussa
 * @since 0.0.1
 */
public class Starter {
	public static HazelcastInstance hazelcastInstance;

	public static void main( String[] args )
	{
		hazelcastInstance = Hazelcast.newHazelcastInstance();
	}
}
