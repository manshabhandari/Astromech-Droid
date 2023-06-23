package bhandari.ARMS;

import bhandari.ENUMS.*;
import bhandari.PAD.RightFootPad;

public class RightArm extends Arm{
	
	//defining variables
	protected String serialNumber = "RA-02";
	private Status status;
	private Side side;
	private RightFootPad pad;
	private Limb upper;
	private Limb lower;
	
	//constructor
	public RightArm(String serialNumber) {
		super("RA-02");
		this.serialNumber = "RA-02";
		this.status = Status.ONLINE;
		this.side = Side.LEFT;
		this.upper = Limb.Upper;
		this.lower = Limb.Lower;

	}
	
	//armCheck method to check the status of the right arm
	public boolean armCheck() {
		if((getStatus() == Status.ONLINE) && (getPad().getRightPadStatus() == Status.ONLINE)) {
			return true;
		} else { 
			setStatus(Status.OFFLINE);
			return false;
		}
		
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public RightFootPad getPad() {
		return pad;
	}

	public void setPad(RightFootPad pad) {
		this.pad = pad;
	}

	public Limb getUpper() {
		return upper;
	}

	public void setUpper(Limb upper) {
		this.upper = upper;
	}

	public Limb getLower() {
		return lower;
	}

	public void setLower(Limb lower) {
		this.lower = lower;
	}
}
