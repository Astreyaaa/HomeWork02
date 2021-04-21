package by.htp.project5.logic;

import by.htp.project5.entity.Train;

public class Logic {

	public Train[] bubbleSort(Train[] trainList) {
		
		for(int i = trainList.length-1; i >= 0 ; i--){
	        for(int j = 0 ; j < i; j++){
	            if(trainList[j].getNumberTrain() > trainList[j+1].getNumberTrain()){
	            	Train tmp = trainList[j];
	            	trainList[j] = trainList[j+1];
	            	trainList[j+1] = tmp;
	            }
		    }
		}
		
		return trainList;
	}
	
	public Train[] bubbleSortDestination(Train[] trainList) {
		
		for(int i = trainList.length-1; i >= 0 ; i--){
	        for(int j = 0 ; j < i; j++){
	        	int val = trainList[j].getDestinationTrain().compareTo(trainList[j+1].getDestinationTrain());
	            if(val > 0 ){
	            	Train tmp = trainList[j];
	            	trainList[j] = trainList[j+1];
	            	trainList[j+1] = tmp;
	            }else if(val == 0) {
	            	int val2 = trainList[j].getTimeTrain().compareTo(trainList[j+1].getTimeTrain());
	            	if (val2 > 0) {
	            		Train tmp = trainList[j];
		            	trainList[j] = trainList[j+1];
		            	trainList[j+1] = tmp;
	            	}
	            }
		    }
		}
		
		
		return trainList;
	}
}
