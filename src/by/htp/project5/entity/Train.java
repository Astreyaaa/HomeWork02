package by.htp.project5.entity;

import java.util.Date;

public class Train {

	private int numberTrain;
	private String destinationTrain;
	private Date timeTrain;
	
	public Train (int _numberTrain, String _destinationTrain, Date _timeTrain) {
		this.numberTrain = _numberTrain;
		this.destinationTrain = _destinationTrain;
		this.timeTrain = _timeTrain;
	}

	public int getNumberTrain() {
		return numberTrain;
	}

	public void setNumberTrain(int numberTrain) {
		this.numberTrain = numberTrain;
	}

	public String getDestinationTrain() {
		return destinationTrain;
	}

	public void setDestinationTrain(String destinationTrain) {
		this.destinationTrain = destinationTrain;
	}

	public Date getTimeTrain() {
		return timeTrain;
	}

	public void setTimeTrain(Date timeTrain) {
		this.timeTrain = timeTrain;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destinationTrain == null) ? 0 : destinationTrain.hashCode());
		result = prime * result + numberTrain;
		result = prime * result + ((timeTrain == null) ? 0 : timeTrain.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (destinationTrain == null) {
			if (other.destinationTrain != null)
				return false;
		} else if (!destinationTrain.equals(other.destinationTrain))
			return false;
		if (numberTrain != other.numberTrain)
			return false;
		if (timeTrain == null) {
			if (other.timeTrain != null)
				return false;
		} else if (!timeTrain.equals(other.timeTrain))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Поезд №" + numberTrain + ", направление: " + destinationTrain + ", время отправления "
				+ timeTrain;
	}
	
}
