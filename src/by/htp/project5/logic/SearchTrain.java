package by.htp.project5.logic;

import java.util.Scanner;

import by.htp.project5.entity.Depot;
import by.htp.project5.entity.Train;
import by.htp.project5.view.ShowAll;

public class SearchTrain {

	public Train searchTrain(Depot depot) {
		
		ShowAll all = new ShowAll();
		System.out.println("������� ������ � ����:");
		all.showAll(depot);
		System.out.println("������� ����� ������:");
		int choose = 0;
		Scanner sc = new Scanner(System.in);
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("������� ����� �� 1 �� 3");
		}
		choose = sc.nextInt();
		
		for (Train train : depot.getTrains()) {
			if (train.getNumberTrain() == choose) {
				return train;
			}
		}
		
		return null;

	}
}

