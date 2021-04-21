package by.htp.project6.view;

import by.htp.project6.entity.Bank;
import by.htp.project6.entity.Customer;

public class ShowAll {
	public void showAll(Bank bank) {

		for (Customer customer : bank.getCustomers()) {
			System.out.println(customer);
		}
	}
}
