package by.htp.project5.logic;

import by.htp.project5.entity.Depot;
import by.htp.project5.entity.Train;

public class BubbleSortDestination {

	public void bubbleSortNumber(Depot depot) {

		for (int i = depot.getTrains().size() - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				int val = depot.getTrains().get(j).getDestinationTrain().compareTo(depot.getTrains().get(j + 1).getDestinationTrain());
				if (val > 0) {
					Train tmp = depot.getTrains().get(j);
					depot.setTrain(j, depot.getTrains().get(j+1));
					depot.setTrain(j+1, tmp);
				} else if (val == 0) {
					int val2 = depot.getTrains().get(j).getTimeTrain().compareTo(depot.getTrains().get(j + 1).getTimeTrain());
					if (val2 > 0) {
						Train tmp = depot.getTrains().get(j);
						depot.setTrain(j, depot.getTrains().get(j+1));
						depot.setTrain(j+1, tmp);
					}
					
				}
			}
		}
	}
}