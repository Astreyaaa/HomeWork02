package by.htp.project5.logic;

import java.util.Date;

import by.htp.project5.entity.Train;

public class NewTrain {

	public Train newTrain(int numberTrain, String destinationTrain,  Date timeTrain) {

		if (destinationTrain == null) {
			throw new RuntimeException("destination can't be null");
		}

		if ((numberTrain == 0) || (numberTrain < 0)) {
			throw new RuntimeException("trainNumber should be positive number and can't be 0");
		}

		if (timeTrain == null) {
			throw new RuntimeException("departureTime can't be null");
		} else {
			return new Train(numberTrain, destinationTrain, timeTrain);
		}

	}
}
