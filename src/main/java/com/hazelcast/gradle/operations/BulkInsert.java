package com.hazelcast.gradle.operations;

import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import com.hazelcast.core.ISet;
import com.hazelcast.gradle.pojo.TransactionCountByCard;
import com.hazelcast.query.SqlPredicate;
import java.io.File;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class BulkInsert {

	private static final char DEFAULT_SEPARATOR = ',';
	private static final char DEFAULT_QUOTE = '"';
	public static void main( String[] args )
	{
		HazelcastInstance hazelcastClient = Reader.getHazelcastClient();
		IMap<String, TransactionCountByCard> transactionCountByCardMap = hazelcastClient.getMap("transactionCountByCard");
		try
		{
			Set<TransactionCountByCard> transactionCountByCards = readStates();
			transactionCountByCards.forEach((t) ->{
				transactionCountByCardMap.put(t.getCardNumber(),t);
			});

		}
		catch( Exception e )
		{
			e.printStackTrace();
			System.exit(1);
		}
		finally
		{
			System.out.println("end");
			hazelcastClient.shutdown();
		}

		/*
		IMap<String, TransactionCountByCard> transactionCountByCards = hazelcastClient.getMap("transaction_count_by_card");
		List<TransactionCountByCard> transactionCountByCardSet;
		transactionCountByCardSet = (List<TransactionCountByCard>) transactionCountByCards.values(new SqlPredicate("count >100"));
		System.out.println("Result ["+transactionCountByCardSet.size()+"] Rows : ");
		for( TransactionCountByCard transactionCountByCard : transactionCountByCardSet )
		{
			System.out.println(transactionCountByCard);
		}
		hazelcastClient.shutdown();
*/
	}

	private static Set<TransactionCountByCard> readStates() throws Exception {
		String csvFile = "/home/ravi/export.csv";
		Scanner scanner = new Scanner(new File(csvFile));
		Set<TransactionCountByCard> transactionCountByCards = new HashSet<TransactionCountByCard>();
		while (scanner.hasNext()) {
			try
			{
				transactionCountByCards.add(parseLine(scanner.nextLine()));
			}
			catch( java.time.DateTimeException e )
			{
				//skipping invalid data
			}
		}
		scanner.close();
		return transactionCountByCards;

	}
	public static TransactionCountByCard parseLine(String cvsLine) {
		String[] split = cvsLine.split(",");
		return new TransactionCountByCard(Integer.parseInt(split[0]),split[1],stringToLocalDate(split[2]));
	}

	private static LocalDateTime stringToLocalDate( String s )
	{
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss.SSSSSSSSS a");

		return LocalDateTime.parse(s,df);
	}

}