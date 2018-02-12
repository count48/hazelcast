package com.hazelcast.gradle.pojo;


import java.io.Serializable;
import java.util.Date;

public class Incmsg_Auth implements Serializable{
	int MULTIINST_ID;
	public String getI125_SUPP_INFO1() {
		return I125_SUPP_INFO1;
	}
	public void setI125_SUPP_INFO1(String i125_SUPP_INFO1) {
		I125_SUPP_INFO1 = i125_SUPP_INFO1;
	}
	long AUTH_SERIAL_NO;
	Date LTIMESTAMP;
	String SOURCE;
	String MSG_FORMAT;
	long OTB_AMT_CNTR;
	long OTB_AMT_CARD;
	int MSG_TRXN_TYPE;
	int MSG_TRXN_MODE;
	int MSG_TRXN_SPECIFICS;
	long MSG_CLASS;
	long MSG_TYPE;
	long TRXN_TYPE;
	long TRXN_ENTRY_MODE;
	String I000_MSG_TYPE;
	String I002_NUMBER;
	String I003_PROC_CODE;
	long I004_AMT_TRXN;
	long I005_AMT_SETTLE;
	long I006_AMT_BILL;
	String I007_TRANS_DT;
	String I011_TRACE_NO;
	String I012_LCL_TIME;
	String I013_LCL_DATE;
	String I014_EXP_DATE;
	String I018_MER_TYPE;
	String I019_ACQ_COUNTRY;
	String I021_FWD_COUNTRY;
	String I022_POS_ENTRY;
	String I032_ACQ_ID;
	String I035_TRACK2;
	String I037_RET_REF_NO;
	String I038_AUTH_ID;
	String I039_RESP_CODE;
	String I041_POS_ID;
	String I042_MER_ID;
	String I043A_MER_NAME;
	String I043A_MER_CITY;
	String I043A_MER_COUNTRY;
	String I049_CUR_TRXN;
	String I050_CUR_SETTLE;
	String I051_CUR_BILL;
	char FRAUD;
	String I053_SEC_CNTRL;
	String I054_ADDTNL_AMT;
	String I055_ICC_DATA;
	String I056_ORG_DATA;
	String I058_AUTH_AGENT;
	String I059_POS_GEO_DATA;
	String I060_POS_CAP;
	long I061V1_OTH_AMT_TXN;
	long I061V2_OTH_AMT_BIL;
	long I061V3_REP_AMT_BIL;
	String I061M_POS_DATA;
	char I062V1_AUTH_CHAR;
	String I062V2_TRANS_ID;
	String I062V3_VALIDAT_CD;
	char I062V4_MRKT_DATA;
	String I062V5_DURATION;
	char I062V6_PRSTG_PROP;
	String I063_BANKNET_DATA;
	String I063V1_NETWORK_ID;
	String I063V2_TIME_LIMIT;
	String I063V3_MIS_CAS_RD;
	String I063V4_STIP_RS;
	String I063V5_PMC_ID;
	String I068_RCV_CNTRY;
	String I072_MSG_NUM_LST;
	String I090_ORIG_DATA;
	String I093_RSP_IND;
	String I094_SVC_IND;
	long I095_ACT_TRAN_AMT;
	String I100_RCV_INST;
	String I101_FILE_NAME;
	String I102_ACCT_ID1;
	String I103_ACCT_ID2;
	String I104_TRAN_DESC;
	String I118_INTRA_COUNTRY;
	String I120_ORIG_MSG_TYP;
	String I123_ADR_VER;
	String I124_GOODS_CODE;
	String I125_SUPP_INFO1;
	String I126V6_CH_CSERIAL;
	String I126V7_ME_CSERIAL;
	String I126V8_TRXN_ID;
	String I126V9_STAIN;
	String I126V10_CVV2;
	String I126V18_AGENT_UNIQ_ACC_RSLT;
	String I126V20_ADD_AUTH_METHOD;
	String I126V21_ADD_AUTH_RSN_CD;
	String I130_TERM_CAPA;
	String I131_TVR;
	String I132_UNPREDICT;
	String I133_TERM_SERIAL;
	String I134_VISA_DISCR;
	int I135A_PREAUTHTRACE;
	int I135B_PURCHTRACE;
	int I135C_CRYPTTRACE;
	int I135D_KEYVERSION;
	String I136_CRYPTOGRAM;
	String I137_ATC;
	String I138_APL;
	String I139_1_ARPC;
	String I139_2_ARPC_RESCD;
	long I142_SCRIPTSEND;
	String I143_SCRIPT_RES;
	String I144_CRYP_TR;
	String I145_TRM_CNTRY;
	String I146_TRM_DATE;
	String I147_CRYPT_AMT;
	String I148_CRYPT_CURR;
	String I149_CRYPT_CSBK;
	int AUTH_RC;

	public int getMULTIINST_ID() {
		return MULTIINST_ID;
	}
	public void setMULTIINST_ID(int mULTIINST_ID) {
		MULTIINST_ID = mULTIINST_ID;
	}
	public long getAUTH_SERIAL_NO() {
		return AUTH_SERIAL_NO;
	}
	public void setAUTH_SERIAL_NO(long aUTH_SERIAL_NO) {
		AUTH_SERIAL_NO = aUTH_SERIAL_NO;
	}
	public Date getLTIMESTAMP() {
		return LTIMESTAMP;
	}
	public void setLTIMESTAMP(Date lTIMESTAMP) {
		LTIMESTAMP = lTIMESTAMP;
	}
	public String getSOURCE() {
		return SOURCE;
	}
	public void setSOURCE(String sOURCE) {
		SOURCE = sOURCE;
	}
	public String getMSG_FORMAT() {
		return MSG_FORMAT;
	}
	public void setMSG_FORMAT(String mSG_FORMAT) {
		MSG_FORMAT = mSG_FORMAT;
	}
	public long getOTB_AMT_CNTR() {
		return OTB_AMT_CNTR;
	}
	public void setOTB_AMT_CNTR(long oTB_AMT_CNTR) {
		OTB_AMT_CNTR = oTB_AMT_CNTR;
	}
	public long getOTB_AMT_CARD() {
		return OTB_AMT_CARD;
	}
	public void setOTB_AMT_CARD(long oTB_AMT_CARD) {
		OTB_AMT_CARD = oTB_AMT_CARD;
	}
	public int getMSG_TRXN_TYPE() {
		return MSG_TRXN_TYPE;
	}
	public void setMSG_TRXN_TYPE(int mSG_TRXN_TYPE) {
		MSG_TRXN_TYPE = mSG_TRXN_TYPE;
	}
	public int getMSG_TRXN_MODE() {
		return MSG_TRXN_MODE;
	}
	public void setMSG_TRXN_MODE(int mSG_TRXN_MODE) {
		MSG_TRXN_MODE = mSG_TRXN_MODE;
	}
	public int getMSG_TRXN_SPECIFICS() {
		return MSG_TRXN_SPECIFICS;
	}
	public void setMSG_TRXN_SPECIFICS(int mSG_TRXN_SPECIFICS) {
		MSG_TRXN_SPECIFICS = mSG_TRXN_SPECIFICS;
	}
	public long getMSG_CLASS() {
		return MSG_CLASS;
	}
	public void setMSG_CLASS(long mSG_CLASS) {
		MSG_CLASS = mSG_CLASS;
	}
	public long getMSG_TYPE() {
		return MSG_TYPE;
	}
	public void setMSG_TYPE(long mSG_TYPE) {
		MSG_TYPE = mSG_TYPE;
	}
	public long getTRXN_TYPE() {
		return TRXN_TYPE;
	}
	public void setTRXN_TYPE(long tRXN_TYPE) {
		TRXN_TYPE = tRXN_TYPE;
	}
	public long getTRXN_ENTRY_MODE() {
		return TRXN_ENTRY_MODE;
	}
	public void setTRXN_ENTRY_MODE(long tRXN_ENTRY_MODE) {
		TRXN_ENTRY_MODE = tRXN_ENTRY_MODE;
	}
	public String getI000_MSG_TYPE() {
		return I000_MSG_TYPE;
	}
	public void setI000_MSG_TYPE(String i000_MSG_TYPE) {
		I000_MSG_TYPE = i000_MSG_TYPE;
	}
	public String getI002_NUMBER() {
		return I002_NUMBER;
	}
	public void setI002_NUMBER(String i002_NUMBER) {
		I002_NUMBER = i002_NUMBER;
	}
	public String getI003_PROC_CODE() {
		return I003_PROC_CODE;
	}
	public void setI003_PROC_CODE(String i003_PROC_CODE) {
		I003_PROC_CODE = i003_PROC_CODE;
	}
	public long getI004_AMT_TRXN() {
		return I004_AMT_TRXN;
	}
	public void setI004_AMT_TRXN(long i004_AMT_TRXN) {
		I004_AMT_TRXN = i004_AMT_TRXN;
	}
	public long getI005_AMT_SETTLE() {
		return I005_AMT_SETTLE;
	}
	public void setI005_AMT_SETTLE(long i005_AMT_SETTLE) {
		I005_AMT_SETTLE = i005_AMT_SETTLE;
	}
	public long getI006_AMT_BILL() {
		return I006_AMT_BILL;
	}
	public void setI006_AMT_BILL(long i006_AMT_BILL) {
		I006_AMT_BILL = i006_AMT_BILL;
	}
	public String getI007_TRANS_DT() {
		return I007_TRANS_DT;
	}
	public void setI007_TRANS_DT(String i007_TRANS_DT) {
		I007_TRANS_DT = i007_TRANS_DT;
	}
	public String getI011_TRACE_NO() {
		return I011_TRACE_NO;
	}
	public void setI011_TRACE_NO(String i011_TRACE_NO) {
		I011_TRACE_NO = i011_TRACE_NO;
	}
	public String getI012_LCL_TIME() {
		return I012_LCL_TIME;
	}
	public void setI012_LCL_TIME(String i012_LCL_TIME) {
		I012_LCL_TIME = i012_LCL_TIME;
	}
	public String getI013_LCL_DATE() {
		return I013_LCL_DATE;
	}
	public void setI013_LCL_DATE(String i013_LCL_DATE) {
		I013_LCL_DATE = i013_LCL_DATE;
	}
	public String getI014_EXP_DATE() {
		return I014_EXP_DATE;
	}
	public void setI014_EXP_DATE(String i014_EXP_DATE) {
		I014_EXP_DATE = i014_EXP_DATE;
	}
	public String getI018_MER_TYPE() {
		return I018_MER_TYPE;
	}
	public void setI018_MER_TYPE(String i018_MER_TYPE) {
		I018_MER_TYPE = i018_MER_TYPE;
	}
	public String getI019_ACQ_COUNTRY() {
		return I019_ACQ_COUNTRY;
	}
	public void setI019_ACQ_COUNTRY(String i019_ACQ_COUNTRY) {
		I019_ACQ_COUNTRY = i019_ACQ_COUNTRY;
	}
	public String getI021_FWD_COUNTRY() {
		return I021_FWD_COUNTRY;
	}
	public void setI021_FWD_COUNTRY(String i021_FWD_COUNTRY) {
		I021_FWD_COUNTRY = i021_FWD_COUNTRY;
	}
	public String getI022_POS_ENTRY() {
		return I022_POS_ENTRY;
	}
	public void setI022_POS_ENTRY(String i022_POS_ENTRY) {
		I022_POS_ENTRY = i022_POS_ENTRY;
	}
	public String getI032_ACQ_ID() {
		return I032_ACQ_ID;
	}
	public void setI032_ACQ_ID(String i032_ACQ_ID) {
		I032_ACQ_ID = i032_ACQ_ID;
	}
	public String getI035_TRACK2() {
		return I035_TRACK2;
	}
	public void setI035_TRACK2(String i035_TRACK2) {
		I035_TRACK2 = i035_TRACK2;
	}
	public String getI037_RET_REF_NO() {
		return I037_RET_REF_NO;
	}
	public void setI037_RET_REF_NO(String i037_RET_REF_NO) {
		I037_RET_REF_NO = i037_RET_REF_NO;
	}
	public String getI038_AUTH_ID() {
		return I038_AUTH_ID;
	}
	public void setI038_AUTH_ID(String i038_AUTH_ID) {
		I038_AUTH_ID = i038_AUTH_ID;
	}
	public String getI039_RESP_CODE() {
		return I039_RESP_CODE;
	}
	public void setI039_RESP_CODE(String i039_RESP_CODE) {
		I039_RESP_CODE = i039_RESP_CODE;
	}
	public String getI041_POS_ID() {
		return I041_POS_ID;
	}
	public void setI041_POS_ID(String i041_POS_ID) {
		I041_POS_ID = i041_POS_ID;
	}
	public String getI042_MER_ID() {
		return I042_MER_ID;
	}
	public void setI042_MER_ID(String i042_MER_ID) {
		I042_MER_ID = i042_MER_ID;
	}
	public String getI043A_MER_NAME() {
		return I043A_MER_NAME;
	}
	public void setI043A_MER_NAME(String i043a_MER_NAME) {
		I043A_MER_NAME = i043a_MER_NAME;
	}
	public String getI043A_MER_CITY() {
		return I043A_MER_CITY;
	}
	public void setI043A_MER_CITY(String i043a_MER_CITY) {
		I043A_MER_CITY = i043a_MER_CITY;
	}
	public String getI043A_MER_COUNTRY() {
		return I043A_MER_COUNTRY;
	}
	public void setI043A_MER_COUNTRY(String i043a_MER_COUNTRY) {
		I043A_MER_COUNTRY = i043a_MER_COUNTRY;
	}
	public String getI049_CUR_TRXN() {
		return I049_CUR_TRXN;
	}
	public void setI049_CUR_TRXN(String i049_CUR_TRXN) {
		I049_CUR_TRXN = i049_CUR_TRXN;
	}
	public String getI050_CUR_SETTLE() {
		return I050_CUR_SETTLE;
	}
	public void setI050_CUR_SETTLE(String i050_CUR_SETTLE) {
		I050_CUR_SETTLE = i050_CUR_SETTLE;
	}
	public String getI051_CUR_BILL() {
		return I051_CUR_BILL;
	}
	public void setI051_CUR_BILL(String i051_CUR_BILL) {
		I051_CUR_BILL = i051_CUR_BILL;
	}
	public char getFRAUD() {
		return FRAUD;
	}
	public void setFRAUD(char fRAUD) {
		FRAUD = fRAUD;
	}
	public String getI053_SEC_CNTRL() {
		return I053_SEC_CNTRL;
	}
	public void setI053_SEC_CNTRL(String i053_SEC_CNTRL) {
		I053_SEC_CNTRL = i053_SEC_CNTRL;
	}
	public String getI054_ADDTNL_AMT() {
		return I054_ADDTNL_AMT;
	}
	public void setI054_ADDTNL_AMT(String i054_ADDTNL_AMT) {
		I054_ADDTNL_AMT = i054_ADDTNL_AMT;
	}
	public String getI055_ICC_DATA() {
		return I055_ICC_DATA;
	}
	public void setI055_ICC_DATA(String i055_ICC_DATA) {
		I055_ICC_DATA = i055_ICC_DATA;
	}
	public String getI056_ORG_DATA() {
		return I056_ORG_DATA;
	}
	public void setI056_ORG_DATA(String i056_ORG_DATA) {
		I056_ORG_DATA = i056_ORG_DATA;
	}
	public String getI058_AUTH_AGENT() {
		return I058_AUTH_AGENT;
	}
	public void setI058_AUTH_AGENT(String i058_AUTH_AGENT) {
		I058_AUTH_AGENT = i058_AUTH_AGENT;
	}
	public String getI059_POS_GEO_DATA() {
		return I059_POS_GEO_DATA;
	}
	public void setI059_POS_GEO_DATA(String i059_POS_GEO_DATA) {
		I059_POS_GEO_DATA = i059_POS_GEO_DATA;
	}
	public String getI060_POS_CAP() {
		return I060_POS_CAP;
	}
	public void setI060_POS_CAP(String i060_POS_CAP) {
		I060_POS_CAP = i060_POS_CAP;
	}
	public long getI061V1_OTH_AMT_TXN() {
		return I061V1_OTH_AMT_TXN;
	}
	public void setI061V1_OTH_AMT_TXN(long i061v1_OTH_AMT_TXN) {
		I061V1_OTH_AMT_TXN = i061v1_OTH_AMT_TXN;
	}
	public long getI061V2_OTH_AMT_BIL() {
		return I061V2_OTH_AMT_BIL;
	}
	public void setI061V2_OTH_AMT_BIL(long i061v2_OTH_AMT_BIL) {
		I061V2_OTH_AMT_BIL = i061v2_OTH_AMT_BIL;
	}
	public long getI061V3_REP_AMT_BIL() {
		return I061V3_REP_AMT_BIL;
	}
	public void setI061V3_REP_AMT_BIL(long i061v3_REP_AMT_BIL) {
		I061V3_REP_AMT_BIL = i061v3_REP_AMT_BIL;
	}
	public String getI061M_POS_DATA() {
		return I061M_POS_DATA;
	}
	public void setI061M_POS_DATA(String i061m_POS_DATA) {
		I061M_POS_DATA = i061m_POS_DATA;
	}
	public char getI062V1_AUTH_CHAR() {
		return I062V1_AUTH_CHAR;
	}
	public void setI062V1_AUTH_CHAR(char i062v1_AUTH_CHAR) {
		I062V1_AUTH_CHAR = i062v1_AUTH_CHAR;
	}
	public String getI062V2_TRANS_ID() {
		return I062V2_TRANS_ID;
	}
	public void setI062V2_TRANS_ID(String i062v2_TRANS_ID) {
		I062V2_TRANS_ID = i062v2_TRANS_ID;
	}
	public String getI062V3_VALIDAT_CD() {
		return I062V3_VALIDAT_CD;
	}
	public void setI062V3_VALIDAT_CD(String i062v3_VALIDAT_CD) {
		I062V3_VALIDAT_CD = i062v3_VALIDAT_CD;
	}
	public char getI062V4_MRKT_DATA() {
		return I062V4_MRKT_DATA;
	}
	public void setI062V4_MRKT_DATA(char i062v4_MRKT_DATA) {
		I062V4_MRKT_DATA = i062v4_MRKT_DATA;
	}
	public String getI062V5_DURATION() {
		return I062V5_DURATION;
	}
	public void setI062V5_DURATION(String i062v5_DURATION) {
		I062V5_DURATION = i062v5_DURATION;
	}
	public char getI062V6_PRSTG_PROP() {
		return I062V6_PRSTG_PROP;
	}
	public void setI062V6_PRSTG_PROP(char i062v6_PRSTG_PROP) {
		I062V6_PRSTG_PROP = i062v6_PRSTG_PROP;
	}
	public String getI063_BANKNET_DATA() {
		return I063_BANKNET_DATA;
	}
	public void setI063_BANKNET_DATA(String i063_BANKNET_DATA) {
		I063_BANKNET_DATA = i063_BANKNET_DATA;
	}
	public String getI063V1_NETWORK_ID() {
		return I063V1_NETWORK_ID;
	}
	public void setI063V1_NETWORK_ID(String i063v1_NETWORK_ID) {
		I063V1_NETWORK_ID = i063v1_NETWORK_ID;
	}
	public String getI063V2_TIME_LIMIT() {
		return I063V2_TIME_LIMIT;
	}
	public void setI063V2_TIME_LIMIT(String i063v2_TIME_LIMIT) {
		I063V2_TIME_LIMIT = i063v2_TIME_LIMIT;
	}
	public String getI063V3_MIS_CAS_RD() {
		return I063V3_MIS_CAS_RD;
	}
	public void setI063V3_MIS_CAS_RD(String i063v3_MIS_CAS_RD) {
		I063V3_MIS_CAS_RD = i063v3_MIS_CAS_RD;
	}
	public String getI063V4_STIP_RS() {
		return I063V4_STIP_RS;
	}
	public void setI063V4_STIP_RS(String i063v4_STIP_RS) {
		I063V4_STIP_RS = i063v4_STIP_RS;
	}
	public String getI063V5_PMC_ID() {
		return I063V5_PMC_ID;
	}
	public void setI063V5_PMC_ID(String i063v5_PMC_ID) {
		I063V5_PMC_ID = i063v5_PMC_ID;
	}
	public String getI068_RCV_CNTRY() {
		return I068_RCV_CNTRY;
	}
	public void setI068_RCV_CNTRY(String i068_RCV_CNTRY) {
		I068_RCV_CNTRY = i068_RCV_CNTRY;
	}
	public String getI072_MSG_NUM_LST() {
		return I072_MSG_NUM_LST;
	}
	public void setI072_MSG_NUM_LST(String i072_MSG_NUM_LST) {
		I072_MSG_NUM_LST = i072_MSG_NUM_LST;
	}
	public String getI090_ORIG_DATA() {
		return I090_ORIG_DATA;
	}
	public void setI090_ORIG_DATA(String i090_ORIG_DATA) {
		I090_ORIG_DATA = i090_ORIG_DATA;
	}
	public String getI093_RSP_IND() {
		return I093_RSP_IND;
	}
	public void setI093_RSP_IND(String i093_RSP_IND) {
		I093_RSP_IND = i093_RSP_IND;
	}
	public String getI094_SVC_IND() {
		return I094_SVC_IND;
	}
	public void setI094_SVC_IND(String i094_SVC_IND) {
		I094_SVC_IND = i094_SVC_IND;
	}
	public long getI095_ACT_TRAN_AMT() {
		return I095_ACT_TRAN_AMT;
	}
	public void setI095_ACT_TRAN_AMT(long i095_ACT_TRAN_AMT) {
		I095_ACT_TRAN_AMT = i095_ACT_TRAN_AMT;
	}
	public String getI100_RCV_INST() {
		return I100_RCV_INST;
	}
	public void setI100_RCV_INST(String i100_RCV_INST) {
		I100_RCV_INST = i100_RCV_INST;
	}
	public String getI101_FILE_NAME() {
		return I101_FILE_NAME;
	}
	public void setI101_FILE_NAME(String i101_FILE_NAME) {
		I101_FILE_NAME = i101_FILE_NAME;
	}
	public String getI102_ACCT_ID1() {
		return I102_ACCT_ID1;
	}
	public void setI102_ACCT_ID1(String i102_ACCT_ID1) {
		I102_ACCT_ID1 = i102_ACCT_ID1;
	}
	public String getI103_ACCT_ID2() {
		return I103_ACCT_ID2;
	}
	public void setI103_ACCT_ID2(String i103_ACCT_ID2) {
		I103_ACCT_ID2 = i103_ACCT_ID2;
	}
	public String getI104_TRAN_DESC() {
		return I104_TRAN_DESC;
	}
	public void setI104_TRAN_DESC(String i104_TRAN_DESC) {
		I104_TRAN_DESC = i104_TRAN_DESC;
	}
	public String getI118_INTRA_COUNTRY() {
		return I118_INTRA_COUNTRY;
	}
	public void setI118_INTRA_COUNTRY(String i118_INTRA_COUNTRY) {
		I118_INTRA_COUNTRY = i118_INTRA_COUNTRY;
	}
	public String getI120_ORIG_MSG_TYP() {
		return I120_ORIG_MSG_TYP;
	}
	public void setI120_ORIG_MSG_TYP(String i120_ORIG_MSG_TYP) {
		I120_ORIG_MSG_TYP = i120_ORIG_MSG_TYP;
	}
	public String getI123_ADR_VER() {
		return I123_ADR_VER;
	}
	public void setI123_ADR_VER(String i123_ADR_VER) {
		I123_ADR_VER = i123_ADR_VER;
	}
	public String getI124_GOODS_CODE() {
		return I124_GOODS_CODE;
	}
	public void setI124_GOODS_CODE(String i124_GOODS_CODE) {
		I124_GOODS_CODE = i124_GOODS_CODE;
	}
	public String getI125_SUPP_INFO() {
		return I125_SUPP_INFO1;
	}
	public void setI125_SUPP_INFO(String i125_SUPP_INFO) {
		I125_SUPP_INFO1 = i125_SUPP_INFO;
	}
	public String getI126V6_CH_CSERIAL() {
		return I126V6_CH_CSERIAL;
	}
	public void setI126V6_CH_CSERIAL(String i126v6_CH_CSERIAL) {
		I126V6_CH_CSERIAL = i126v6_CH_CSERIAL;
	}
	public String getI126V7_ME_CSERIAL() {
		return I126V7_ME_CSERIAL;
	}
	public void setI126V7_ME_CSERIAL(String i126v7_ME_CSERIAL) {
		I126V7_ME_CSERIAL = i126v7_ME_CSERIAL;
	}
	public String getI126V8_TRXN_ID() {
		return I126V8_TRXN_ID;
	}
	public void setI126V8_TRXN_ID(String i126v8_TRXN_ID) {
		I126V8_TRXN_ID = i126v8_TRXN_ID;
	}
	public String getI126V9_STAIN() {
		return I126V9_STAIN;
	}
	public void setI126V9_STAIN(String i126v9_STAIN) {
		I126V9_STAIN = i126v9_STAIN;
	}
	public String getI126V10_CVV2() {
		return I126V10_CVV2;
	}
	public void setI126V10_CVV2(String i126v10_CVV2) {
		I126V10_CVV2 = i126v10_CVV2;
	}
	public String getI126V18_AGENT_UNIQ_ACC_RSLT() {
		return I126V18_AGENT_UNIQ_ACC_RSLT;
	}
	public void setI126V18_AGENT_UNIQ_ACC_RSLT(String i126v18_AGENT_UNIQ_ACC_RSLT) {
		I126V18_AGENT_UNIQ_ACC_RSLT = i126v18_AGENT_UNIQ_ACC_RSLT;
	}
	public String getI126V20_ADD_AUTH_METHOD() {
		return I126V20_ADD_AUTH_METHOD;
	}
	public void setI126V20_ADD_AUTH_METHOD(String i126v20_ADD_AUTH_METHOD) {
		I126V20_ADD_AUTH_METHOD = i126v20_ADD_AUTH_METHOD;
	}
	public String getI126V21_ADD_AUTH_RSN_CD() {
		return I126V21_ADD_AUTH_RSN_CD;
	}
	public void setI126V21_ADD_AUTH_RSN_CD(String i126v21_ADD_AUTH_RSN_CD) {
		I126V21_ADD_AUTH_RSN_CD = i126v21_ADD_AUTH_RSN_CD;
	}
	public String getI130_TERM_CAPA() {
		return I130_TERM_CAPA;
	}
	public void setI130_TERM_CAPA(String i130_TERM_CAPA) {
		I130_TERM_CAPA = i130_TERM_CAPA;
	}
	public String getI131_TVR() {
		return I131_TVR;
	}
	public void setI131_TVR(String i131_TVR) {
		I131_TVR = i131_TVR;
	}
	public String getI132_UNPREDICT() {
		return I132_UNPREDICT;
	}
	public void setI132_UNPREDICT(String i132_UNPREDICT) {
		I132_UNPREDICT = i132_UNPREDICT;
	}
	public String getI133_TERM_SERIAL() {
		return I133_TERM_SERIAL;
	}
	public void setI133_TERM_SERIAL(String i133_TERM_SERIAL) {
		I133_TERM_SERIAL = i133_TERM_SERIAL;
	}
	public String getI134_VISA_DISCR() {
		return I134_VISA_DISCR;
	}
	public void setI134_VISA_DISCR(String i134_VISA_DISCR) {
		I134_VISA_DISCR = i134_VISA_DISCR;
	}
	public int getI135A_PREAUTHTRACE() {
		return I135A_PREAUTHTRACE;
	}
	public void setI135A_PREAUTHTRACE(int i135a_PREAUTHTRACE) {
		I135A_PREAUTHTRACE = i135a_PREAUTHTRACE;
	}
	public int getI135B_PURCHTRACE() {
		return I135B_PURCHTRACE;
	}
	public void setI135B_PURCHTRACE(int i135b_PURCHTRACE) {
		I135B_PURCHTRACE = i135b_PURCHTRACE;
	}
	public int getI135C_CRYPTTRACE() {
		return I135C_CRYPTTRACE;
	}
	public void setI135C_CRYPTTRACE(int i135c_CRYPTTRACE) {
		I135C_CRYPTTRACE = i135c_CRYPTTRACE;
	}
	public int getI135D_KEYVERSION() {
		return I135D_KEYVERSION;
	}
	public void setI135D_KEYVERSION(int i135d_KEYVERSION) {
		I135D_KEYVERSION = i135d_KEYVERSION;
	}
	public String getI136_CRYPTOGRAM() {
		return I136_CRYPTOGRAM;
	}
	public void setI136_CRYPTOGRAM(String i136_CRYPTOGRAM) {
		I136_CRYPTOGRAM = i136_CRYPTOGRAM;
	}
	public String getI137_ATC() {
		return I137_ATC;
	}
	public void setI137_ATC(String i137_ATC) {
		I137_ATC = i137_ATC;
	}
	public String getI138_APL() {
		return I138_APL;
	}
	public void setI138_APL(String i138_APL) {
		I138_APL = i138_APL;
	}
	public String getI139_1_ARPC() {
		return I139_1_ARPC;
	}
	public void setI139_1_ARPC(String i139_1_ARPC) {
		I139_1_ARPC = i139_1_ARPC;
	}
	public String getI139_2_ARPC_RESCD() {
		return I139_2_ARPC_RESCD;
	}
	public void setI139_2_ARPC_RESCD(String i139_2_ARPC_RESCD) {
		I139_2_ARPC_RESCD = i139_2_ARPC_RESCD;
	}
	public long getI142_SCRIPTSEND() {
		return I142_SCRIPTSEND;
	}
	public void setI142_SCRIPTSEND(long i142_SCRIPTSEND) {
		I142_SCRIPTSEND = i142_SCRIPTSEND;
	}
	public String getI143_SCRIPT_RES() {
		return I143_SCRIPT_RES;
	}
	public void setI143_SCRIPT_RES(String i143_SCRIPT_RES) {
		I143_SCRIPT_RES = i143_SCRIPT_RES;
	}
	public String getI144_CRYP_TR() {
		return I144_CRYP_TR;
	}
	public void setI144_CRYP_TR(String i144_CRYP_TR) {
		I144_CRYP_TR = i144_CRYP_TR;
	}
	public String getI145_TRM_CNTRY() {
		return I145_TRM_CNTRY;
	}
	public void setI145_TRM_CNTRY(String i145_TRM_CNTRY) {
		I145_TRM_CNTRY = i145_TRM_CNTRY;
	}
	public String getI146_TRM_DATE() {
		return I146_TRM_DATE;
	}
	public void setI146_TRM_DATE(String i146_TRM_DATE) {
		I146_TRM_DATE = i146_TRM_DATE;
	}
	public String getI147_CRYPT_AMT() {
		return I147_CRYPT_AMT;
	}
	public void setI147_CRYPT_AMT(String i147_CRYPT_AMT) {
		I147_CRYPT_AMT = i147_CRYPT_AMT;
	}
	public String getI148_CRYPT_CURR() {
		return I148_CRYPT_CURR;
	}
	public void setI148_CRYPT_CURR(String i148_CRYPT_CURR) {
		I148_CRYPT_CURR = i148_CRYPT_CURR;
	}
	public String getI149_CRYPT_CSBK() {
		return I149_CRYPT_CSBK;
	}
	public void setI149_CRYPT_CSBK(String i149_CRYPT_CSBK) {
		I149_CRYPT_CSBK = i149_CRYPT_CSBK;
	}
	public int getAUTH_RC() {
		return AUTH_RC;
	}
	public void setAUTH_RC(int aUTH_RC) {
		AUTH_RC = aUTH_RC;
	}
}