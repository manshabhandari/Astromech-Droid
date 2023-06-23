package bhandari.PAD;

import bhandari.ENUMS.Side;

public abstract class FootPad {
	
	//defining variables
	private String serialNumber;
	private Side side;
	
	//constructor
	public FootPad(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	//abstract method
	public abstract boolean padCheck();

	//getters and setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}
	
	
}
