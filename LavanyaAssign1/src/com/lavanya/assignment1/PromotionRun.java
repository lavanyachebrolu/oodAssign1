package com.lavanya.assignment1;

public class PromotionRun {
	public static void main(String[] args) {
		Owner owner = new Owner("Lavanya", "New Deal");
		
		Customer customer1 =new Customer("John Smith");
		Customer customer2 =new Customer("Hitha");
		Customer customer3 =new Customer("Aishu");
		Customer customer4 =new Customer("Nikitha");
		owner.addDealSubcriber(customer1);
		owner.addDealSubcriber(customer2);
		owner.addDealSubcriber(customer3);
		owner.addDealSubcriber(customer4);
		
		owner.notifyDealSubscribers("You have a new Labor Day Deal!");
	}
}



