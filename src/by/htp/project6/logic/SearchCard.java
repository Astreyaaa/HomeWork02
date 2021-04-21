package by.htp.project6.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.project6.entity.Bank;
import by.htp.project6.entity.Customer;

public class SearchCard {

	public List<Customer> searchCard(Bank bank) {

		Scanner sc = new Scanner(System.in);
		List<Customer> needCardNumber = new ArrayList<Customer>();
		
		int min = 0;
		int max = 0;
		
		System.out.println("������� ����������� ��������:");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ����������� ��������:");
		}
		min = sc.nextInt();
		
		System.out.println("������� ������������ ��������:");
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ������������ ��������:");
		}
		max = sc.nextInt();

		for (Customer customer : bank.getCustomers()) {
			if (customer.getCreditCard() >= min && customer.getCreditCard() <= max) {
					needCardNumber.add(customer);
			}
		}
		return needCardNumber;
	}
}
