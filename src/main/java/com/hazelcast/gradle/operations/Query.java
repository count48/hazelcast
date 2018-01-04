package com.hazelcast.gradle.operations;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.gradle.pojo.TransactionCountByCard;
import com.hazelcast.query.SqlPredicate;
import java.util.List;
import java.util.Set;

public class Query {

	public static void main( String[] args )
	{
		HazelcastInstance hazelcastClient = Reader.getHazelcastClient();
		IMap<String, TransactionCountByCard> transactionCountByCards = hazelcastClient.getMap("transaction_count_by_card");
		List<TransactionCountByCard> transactionCountByCardSet;
		transactionCountByCardSet = (List<TransactionCountByCard>) transactionCountByCards.values(new SqlPredicate("count >100"));
		System.out.println("Result ["+transactionCountByCardSet.size()+"] Rows : ");
		for( TransactionCountByCard transactionCountByCard : transactionCountByCardSet )
		{
			System.out.println(transactionCountByCard);
		}
		hazelcastClient.shutdown();

	}

}