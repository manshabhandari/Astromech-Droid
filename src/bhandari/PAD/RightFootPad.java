package bhandari.PAD;

import bhandari.ENUMS.Side;
import bhandari.ENUMS.Status;

public class RightFootPad extends FootPad{
	
	//defining variables
	private String serialNumber = "RFP-2";
	private Side side;
	private Status RightPadStatus;

	//constructor
	public RightFootPad(String serialNumber) {
		super(serialNumber);
		this.RightPadStatus = Status.ONLINE;
		this.side = Side.RIGHT;
	}
	
	//padcheck method to check the status of the pad
	public boolean padCheck() {
		if(getRightPadStatus() == Status.ONLINE) {
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

	public Status getRightPadStatus() {
		return RightPadStatus;
	}

	public void setRightPadStatus(Status rightPadStatus) {
		RightPadStatus = rightPadStatus;
	}
	
}
