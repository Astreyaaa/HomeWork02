package by.htp.project5.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import by.htp.project5.entity.Depot;
import by.htp.project5.entity.Train;
import by.htp.project5.logic.BubbleSortDestination;
import by.htp.project5.logic.BubbleSortNumber;
import by.htp.project5.logic.Logic;
import by.htp.project5.logic.NewTrain;
import by.htp.project5.logic.SearchTrain;
import by.htp.project5.view.ShowAll;
import by.htp.project5.view.TrainInfo;
import by.htp.project5.view.Info;

public class Main {

	public static void main(String[] args) {
		
		List<Train> trains = new ArrayList<Train>();
		Depot depot = new Depot(trains);
		NewTrain newTrain = new NewTrain();
		BubbleSortNumber sortNumber  = new BubbleSortNumber();
		BubbleSortDestination sortDestination = new BubbleSortDestination();
		SearchTrain search = new SearchTrain();
		Info info = new Info();
		ShowAll all = new ShowAll();
		TrainInfo trainInfo = new TrainInfo();
		Scanner sc = new Scanner(System.in);
		
		Train train1 = newTrain.newTrain(2, "Malinovka", new Date(121, 8, 13, 12, 0));
		Train train2 = newTrain.newTrain(3, "Malinovka", new Date(121, 8, 13, 10, 0));
		Train train3 = newTrain.newTrain(4, "Minsk", new Date(121, 3, 12, 06, 07));
		Train train4 = newTrain.newTrain(5, "Brest", new Date(121, 3, 26, 1, 23));
		Train train5 = newTrain.newTrain(1, "Vitebsk", new Date(121, 0, 23, 10, 40));
		
		depot.addTrain(train1);
		depot.addTrain(train2);
		depot.addTrain(train3);
		depot.addTrain(train4);
		depot.addTrain(train5);
			
		info.info();
	
		int choose = 0;
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введите число от 1 до 3");
		}
		choose = sc.nextInt();
		
		switch(choose) {
			case 1:
				sortNumber.bubbleSortNumber(depot);
				all.showAll(depot);
				break;
			case 2:
				Train trainSearched = search.searchTrain(depot);
				trainInfo.trainInfo(trainSearched);
				break;
			case 3:
				sortDestination.bubbleSortNumber(depot);
				all.showAll(depot);
				break;
			default:
				System.out.println("До свидания! :)");
				return;
		}
	}
}
