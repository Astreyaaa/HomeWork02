package by.htp.project5.entity;

import java.util.ArrayList;
import java.util.List;

public class Depot {

	private List<Train> trains;
	
	public Depot(){
		trains = new ArrayList<Train>();
		
	}
	
	public Depot(List<Train> trains) {
		this.trains = trains;
	}
	
	public void addTrain(Train train) {
		trains.add(train);
	}
	
	public List<Train> getTrains() {
		return trains;
	}
	
	public void setTrains(List<Train> trains) {
		this.trains = trains;
	}
	
	public Train getTrain(int index) {
		return trains.get(index);
	}

	public void setTrain(int index, Train train) {
		trains.set(index, train);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((trains == null) ? 0 : trains.hashCode());
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
		Depot other = (Depot) obj;
		if (trains == null) {
			if (other.trains != null)
				return false;
		} else if (!trains.equals(other.trains))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depot [trains=" + trains + "]";
	}
	
	
	
}
