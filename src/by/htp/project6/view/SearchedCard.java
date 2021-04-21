package by.htp.project6.view;

import java.util.List;

import by.htp.project6.entity.Customer;

public class SearchedCard {
	public void list(List<Customer> selectionCustomers) {
		
			for (Customer customer : selectionCustomers) {
				System.out.println(customer);
			}
	}
}
