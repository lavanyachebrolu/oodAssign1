package com.lavanya.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Owner implements Offer {
	private String ownerName;
	private String deal;
	List<Customer> customers = new ArrayList<>();
	
	
	public Owner(String ownerName, String deal) {
		super();
		this.ownerName = ownerName;
		this.deal = deal;
	}
	
	public String getownerName() {
		return ownerName;
	}
	public void setownerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getDeal() {
		return deal;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	
	public synchronized void addDealSubcriber(Customer customer) {
		customers.add(customer);
	}
	
	public synchronized void removeDealSubcriber(Customer customer) {
		customers.remove(customer);
	}
	
	
	public void notifyDealSubscribers(String message) {
		System.out.println("Professor Posted Message:: "+message+"\n");
		customers.forEach(customer->customer.notification(customer.getCustomerName(), this.ownerName, this.deal, message));
	}
	
}
