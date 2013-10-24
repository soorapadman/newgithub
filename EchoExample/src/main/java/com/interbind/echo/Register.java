package com.interbind.echo;

import java.io.Serializable;



public class Register implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String userName;
private int age;
private String address;
private String email;
private String mobileNumber;

	
	public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}


@Override
	public String toString() {
		return "Register [userName=" + userName + ", age=" + age + ", address="
				+ address + ", email=" + email + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
