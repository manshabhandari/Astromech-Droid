package bhandari.COMPONENT;

import bhandari.DROID.AstromechDroid;
import bhandari.ENUMS.Status;

public class SensorDome {
	
	//defining variables
	private String serialNumber;
	public static double height;
	public static double weight;
	public static Status status;
	
	//constructor
	public SensorDome(String serialNumber) {
		this.serialNumber = serialNumber;
		this.status = Status.ONLINE;
		
		//defining the height and weight for R3 and R4
		if(serialNumber.substring(0,2).equals("R3")) {
			this.height = 2;
			this.weight = 200;
		}
		if(serialNumber.substring(0,2).equals("R4")) {
			this.height = 2;
			this.weight = 150;
		}
	}
	
	//sensorDomeCheck method to check the status of the sensorDome
	public boolean sensorDomeCheck() {
		if(getStatus() == Status.ONLINE) {
			return true;
		} else {
			return false;
		}
		
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
