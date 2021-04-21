package by.htp.project6.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Customer> customers;
	
	public Bank() {
		customers = new ArrayList<Customer>();
	}

	public Bank(List<Customer> customers) {
		this.customers = customers;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}

	
	public Customer getCustomer(int index) {
		return customers.get(index);
	}

	public void setCustomer(int index, Customer customer) {
		customers.set(index, customer);
	}

	
	
}
