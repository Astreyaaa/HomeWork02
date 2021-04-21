package by.htp.project5.logic;

import by.htp.project5.entity.Depot;
import by.htp.project5.entity.Train;

public class BubbleSortNumber {

	public void bubbleSortNumber(Depot depot) {

		for (int i = depot.getTrains().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (depot.getTrains().get(j).getNumberTrain() > depot.getTrains().get(j + 1).getNumberTrain()) {
					Train tmp = depot.getTrains().get(j);
					depot.setTrain(j, depot.getTrains().get(j+1));
					depot.setTrain(j+1, tmp);
				}
			}
		}
	}
}
