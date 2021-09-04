package com.lavanya.assignment1;

public interface Offer {
	public void addDealSubcriber(Customer customer);
	public void removeDealSubcriber(Customer customer);
	public void notifyDealSubscribers(String message);
}
