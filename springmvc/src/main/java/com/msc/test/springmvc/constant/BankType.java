package com.msc.test.springmvc.constant;

import java.util.HashMap;
import java.util.Map;


public enum BankType {
	
	/**中国工商银行*/
	BANKTYPE_ICBC("0102", "中国工商银行","102100099996"),
	/**中国农业银行*/
	BANKTYPE_ABC("0103", "中国农业银行","103100000026"),
	/**中国银行*/
	BANKTYPE_BC("0104", "中国银行","104100000004"),
	/**中国建设银行*/
	BANKTYPE_CCB("0105", "中国建设银行","105100000017"),
	/**中国邮政储蓄银行*/
	BANKTYPE_PSBC("0106", "中国邮政储蓄银行","403100000004"),
	/**中国交通银行*/
	BANKTYPE_BCM("0301", "中国交通银行","301290000007"),
	/**中国银联*/
	UNION_PAY("0905","中国银联"),
	WECHAT("0906","微信"),
	ALIPAY("0907","支付宝");
	
	
	
	private String value;
	
	private final String displayName;
	
	/**总行联行号*/
	private String defaulBankNo;
	
	
	
	private static Map<String, BankType> valueMap = new HashMap<String, BankType>();

	static {
		for (BankType _enum : BankType.values()) {
			valueMap.put(_enum.value, _enum);
		}
	}

	
	BankType(String value, String displayName) {
		this.value = value;
		this.displayName = displayName;
	}

	BankType(String value, String displayName, boolean hasRefundNo) {
		this.value = value;
		this.displayName = displayName;
	}

	/**
	 * @param value
	 * @param displayName
	 * @param defaulBankNo
	 */
	private BankType(String value, String displayName, String defaulBankNo) {
		this.value = value;
		this.displayName = displayName;
		this.defaulBankNo = defaulBankNo;
	}

	/**
	 * @return the defaulBankNo
	 */
	public String getDefaulBankNo() {
		return defaulBankNo;
	}

	/**
	 * @param defaulBankNo the defaulBankNo to set
	 */
	public void setDefaulBankNo(String defaulBankNo) {
		this.defaulBankNo = defaulBankNo;
	}

	public String getValue() {
		return value;
	}

	public String getDisplayName() {
		return displayName;
	}
	
	public BankType getEnum(String value) {
		return valueMap.get(value);
	}

	public Map<String, BankType> getAllValueMap() {
		return valueMap;
	}

	@Override
	public String toString() {
		return this.getDisplayName();
	}
	
	public static void main(String[] args){
		
		for (BankType item : values()){
			System.out.println(item.value+"|"+item.displayName+"|"+item.defaulBankNo);
		}
	}
	/**
	 * 枚举转换
	 */
	public static BankType parseOf(String value) {
		for (BankType item : values())
			if (item.getValue().equals(value))
				return item;
		throw new IllegalArgumentException("枚举值[" + value + "]不匹配!");
	}
	/**
	 * 根据联行号获取BankType
	 * @param bankNo	联行号
	 * @return
	 * @author	马颂超
	 * @date	2016年12月13日
	 */
	public static BankType parseOfBankNo(String bankNo) {
		for (BankType item : values())
			if (item.getDefaulBankNo()!=null && item.getDefaulBankNo().equals(bankNo))
				return item;
		return null;
	}

	/**
	 * 获取枚举
	 */
	public static BankType returnEnum(String value) {
		return valueMap.get(value);
	}

	public static Object getRechiBankTypes() {
		return new BankType[] { 	
				BANKTYPE_CCB,     //中国建设银行
		};   
	}
	
	public static boolean isMobilePayment(String bankType) {
		return WECHAT.getValue().equals(bankType)||ALIPAY.getValue().equals(bankType);
	}
	
	public static String getAbc(){
		return "abc";
	}

	

}