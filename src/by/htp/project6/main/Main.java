package by.htp.project6.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.htp.project6.entity.Customer;
import by.htp.project6.logic.NewCustomer;
import by.htp.project6.logic.BubbleSortName;
import by.htp.project6.logic.SearchCard;
import by.htp.project6.view.Info;
import by.htp.project6.view.SearchedCard;
import by.htp.project6.view.ShowAll;
import by.htp.project6.entity.Bank;

public class Main {

	public static void main(String[] args) {
		NewCustomer newCustomer = new NewCustomer();
		BubbleSortName sortName = new BubbleSortName();
		SearchCard search = new SearchCard();
		SearchedCard list = new SearchedCard();
		ShowAll show = new ShowAll();
		Info info = new Info();
		Scanner sc = new Scanner(System.in);
		
		int choose = 0;
		
		
		List<Customer> customers = new ArrayList<Customer>();
		
		Bank bank = new Bank();
		bank.setCustomers(customers);

		Customer c1 = newCustomer.newCustomer(1, "The Emperor", "Holy Terra", 1, 11111111, bank);
		Customer c2 = newCustomer.newCustomer(2, "Commander Shepard", "New Kyoto", 999, 2222222, bank);
		Customer c3 = newCustomer.newCustomer(3, "Igor Grom", "St.Petersburg", 10000, 48151623, bank);
		Customer c4 = newCustomer.newCustomer(4, "Yagami Light", "Kanto", 179, 33333333, bank);
		Customer c5 = newCustomer.newCustomer(5, "Alexey Solo Berezin", "Noworosyjsk", 322, 17861790, bank);
		
		bank.addCustomer(c1);
		bank.addCustomer(c2);
		bank.addCustomer(c3);
		bank.addCustomer(c4);
		bank.addCustomer(c5);
		
		info.info();
		int check = 0;
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите число от 1 до 3");
		}
		check = sc.nextInt();
		
		switch(check) {
			case 1:
				show.showAll(bank);
				System.out.println();
				break;
			case 2:
				sortName.sortName(bank);
				show.showAll(bank);
				break;
			case 3:
				List<Customer> newList = search.searchCard(bank);
				list.list(newList);
				break;
			default:
				System.out.println("До свидания! :)");
				return;
		}
	}
}
