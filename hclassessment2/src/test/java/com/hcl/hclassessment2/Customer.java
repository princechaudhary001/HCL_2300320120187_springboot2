package com.hcl.hclassessment2;

import java.util.List;

public class Customer {
	private long customerId;
	private String customer_FName;
	private String email;
	private String password;
	private String mobile;
	private String city;

	public Customer() {
	}

	public Customer(long customerId, String customer_FName, String email, String password, String mobile, String city) {
		this.customerId = customerId;
		this.customer_FName = customer_FName;
		this.email = email;
		this.password = password;
		this.mobile = mobile;
		this.city = city;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomer_FName() {
		return customer_FName;
	}

	public void setCustomer_FName(String customer_FName) {
		this.customer_FName = customer_FName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public String getmobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	@Override
	public String toString() {
		return "Customer ID: " + customerId + ", Customer First Name: " + customer_FName + ", Customer Last Name: "
				+ ", Email: " + email + ",
				+ ", Orders: " ;
	}

}
