package bhandari.PAD;

import bhandari.ENUMS.Side;
import bhandari.ENUMS.Status;

public class LeftFootPad extends FootPad{
	
	//defining variables
	private String serialNumber = "LFP-1";
	private Side side;
	private Status LeftPadStatus;

	//constructor
	public LeftFootPad(String serialNumber) {
		super(serialNumber);
		this.LeftPadStatus = Status.ONLINE;
		this.side = Side.LEFT;
	}
	
	//padcheck method to check the status of the pad
	public boolean padCheck() {
		if(getLeftPadStatus() == Status.ONLINE) {
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

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public Status getLeftPadStatus() {
		return LeftPadStatus;
	}

	public void setLeftPadStatus(Status leftPadStatus) {
		LeftPadStatus = leftPadStatus;
	}
	
}
