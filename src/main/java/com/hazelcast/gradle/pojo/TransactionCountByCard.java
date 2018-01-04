package com.hazelcast.gradle.pojo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TransactionCountByCard implements Serializable {

	private int count;
	private String cardNumber;
	private LocalDateTime localDate;

	public TransactionCountByCard()
	{
	}

	public TransactionCountByCard( int count, String cardNumber, LocalDateTime localDate )
	{
		this.count = count;
		this.cardNumber = cardNumber;
		this.localDate = localDate;
	}

	public LocalDateTime getLocalDate()
	{
		return localDate;
	}

	public int getCount()
	{
		return count;
	}

	public String getCardNumber()
	{
		return cardNumber;
	}

	@Override
	public String toString()
	{
		return "TransactionCountByCard{" + "count=" + count + ", cardNumber='" + cardNumber + '\'' + ", localDate="
				+ localDate + '}';
	}
}
