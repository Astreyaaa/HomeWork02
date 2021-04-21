package by.htp.project5.view;

import by.htp.project5.entity.Depot;
import by.htp.project5.entity.Train;

public class ShowAll {
	public void showAll(Depot depot) {

		for (Train train : depot.getTrains()) {
			System.out.println(train);
		}
	}
}
