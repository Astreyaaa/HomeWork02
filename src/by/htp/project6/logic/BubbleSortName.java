package by.htp.project6.logic;

import by.htp.project6.entity.Bank;
import by.htp.project6.entity.Customer;

public class BubbleSortName {
	public void sortName(Bank bank) {

		for (int i = bank.getCustomers().size()-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (bank.getCustomers().get(j).getFullname().compareTo(bank.getCustomers().get(j + 1).getFullname()) > 0) {
					Customer temp = bank.getCustomers().get(j);
					bank.setCustomer(j, bank.getCustomers().get(j+1));
					bank.setCustomer(j+1, temp);
				}
			}

		}
	}
}

