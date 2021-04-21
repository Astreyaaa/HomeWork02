package by.htp.project6.logic;

import by.htp.project6.entity.Bank;
import by.htp.project6.entity.Customer;

public class NewCustomer {
	public Customer newCustomer(int id, String fullname, String address, long cardNumber, long account, Bank bank){
		return new Customer(id, fullname, address, cardNumber, account);
	}
}
