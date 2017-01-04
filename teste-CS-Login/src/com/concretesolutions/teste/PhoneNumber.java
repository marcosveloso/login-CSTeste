package com.concretesolutions.teste;

import java.io.Serializable;

public class PhoneNumber implements Serializable{

	private static final long serialVersionUID = 4633801665593346118L;

	private String areaCode;
	private String phoneNumber;
	
	public PhoneNumber(String areaCode, String aNumber) {
		this.areaCode = areaCode;
		this.phoneNumber = aNumber;
	}

	public String getDdd() {
		return areaCode;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
