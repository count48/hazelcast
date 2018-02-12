package com.hazelcast.gradle.pojo;

import java.io.Serializable;
import java.util.Date;

public class Cards implements Serializable{
	int MULTIINST_ID;
	int SERIAL_NO;
	int CACC_NO;
	String CARD_NO;
	int PRIMARY_CARD;
	Date EXPIRY_DATE;
	char EXPIRY_DATE_STATUS;
	Date PREVIOUS_EXPIRY_DATE;
	Date CREATE_DATE;
	Date BLOCKED_DATE;
	String ST_GEN;
	String ST_FINANCIAL;
	String ST_AUTH;
	String ST_EMBOSSING;
	int VIRTUAL;
	char ST_ACS_ENROL;
	public int getMULTIINST_ID() {
		return MULTIINST_ID;
	}
	public void setMULTIINST_ID(int mULTIINST_ID)
	{
		MULTIINST_ID = mULTIINST_ID;
	}

	public int getSERIAL_NO()
	{
		return SERIAL_NO;
	}
	public void setSERIAL_NO(int sERIAL_NO) {
		SERIAL_NO = sERIAL_NO;
	}
	public int getCACC_NO() {
		return CACC_NO;
	}
	public void setCACC_NO(int cACC_NO) {
		CACC_NO = cACC_NO;
	}
	public String getCARD_NO() {
		return CARD_NO;
	}
	public void setCARD_NO(String cARD_NO) {
		CARD_NO = cARD_NO;
	}
	public int getPRIMARY_CARD() {
		return PRIMARY_CARD;
	}
	public void setPRIMARY_CARD(int pRIMARY_CARD) {
		PRIMARY_CARD = pRIMARY_CARD;
	}
	public Date getEXPIRY_DATE() {
		return EXPIRY_DATE;
	}
	public void setEXPIRY_DATE(Date eXPIRY_DATE) {
		EXPIRY_DATE = eXPIRY_DATE;
	}
	public char getEXPIRY_DATE_STATUS() {
		return EXPIRY_DATE_STATUS;
	}
	public void setEXPIRY_DATE_STATUS(char eXPIRY_DATE_STATUS) {
		EXPIRY_DATE_STATUS = eXPIRY_DATE_STATUS;
	}
	public Date getPREVIOUS_EXPIRY_DATE() {
		return PREVIOUS_EXPIRY_DATE;
	}
	public void setPREVIOUS_EXPIRY_DATE(Date pREVIOUS_EXPIRY_DATE) {
		PREVIOUS_EXPIRY_DATE = pREVIOUS_EXPIRY_DATE;
	}
	public Date getCREATE_DATE() {
		return CREATE_DATE;
	}
	public void setCREATE_DATE(Date cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}
	public Date getBLOCKED_DATE() {
		return BLOCKED_DATE;
	}
	public void setBLOCKED_DATE(Date bLOCKED_DATE) {
		BLOCKED_DATE = bLOCKED_DATE;
	}
	public String getST_GEN() {
		return ST_GEN;
	}
	public void setST_GEN(String sT_GEN) {
		ST_GEN = sT_GEN;
	}
	public String getST_FINANCIAL() {
		return ST_FINANCIAL;
	}
	public void setST_FINANCIAL(String sT_FINANCIAL) {
		ST_FINANCIAL = sT_FINANCIAL;
	}
	public String getST_AUTH() {
		return ST_AUTH;
	}
	public void setST_AUTH(String sT_AUTH) {
		ST_AUTH = sT_AUTH;
	}
	public String getST_EMBOSSING() {
		return ST_EMBOSSING;
	}
	public void setST_EMBOSSING(String sT_EMBOSSING) {
		ST_EMBOSSING = sT_EMBOSSING;
	}
	public int getVIRTUAL() {
		return VIRTUAL;
	}
	public void setVIRTUAL(int vIRTUAL) {
		VIRTUAL = vIRTUAL;
	}
	public char getST_ACS_ENROL() {
		return ST_ACS_ENROL;
	}
	public void setST_ACS_ENROL(char sT_ACS_ENROL) {
		ST_ACS_ENROL = sT_ACS_ENROL;
	}

}