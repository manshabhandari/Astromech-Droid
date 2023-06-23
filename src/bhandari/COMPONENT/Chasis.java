package bhandari.COMPONENT;

import bhandari.DROID.AstromechDroid;
import bhandari.ENUMS.Status;

public class Chasis {
	
	//defining variables
	private String serialNumber;
	public static double height;
	public static double weight;
	private Status status;
	
	//constructor
	public Chasis(String serialNumber) {
		this.serialNumber = serialNumber;
		this.status = Status.ONLINE;
		if(serialNumber.substring(0,2).equals("R3")) {
			this.height = 4;
			this.weight = 400;
		}
		if(serialNumber.substring(0,2).equals("R4")) {
			this.height = 5;
			this.weight = 500;
		}
	}	
	
	//chasis check method to check the status of the chasis
	public boolean chasisCheck() {
		if (getStatus() == Status.ONLINE) {
			return true;
		} else {
			return false;
		}
		
	}
	
	//getters and setters
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
