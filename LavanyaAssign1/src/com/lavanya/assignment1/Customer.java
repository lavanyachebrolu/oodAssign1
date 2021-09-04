package com.lavanya.assignment1;

public class Customer implements Promotion {
	
	private String customerName;
	

	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	
	public void notification(String customerName, String owner, String deal, String message) {
		System.out.println("Customer Name:: "+customerName);
		System.out.println("Owner Name:: "+owner);
		System.out.println("Course:: "+deal);
		System.out.println("Message:: "+message+"\n");
	}

}
