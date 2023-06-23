package bhandari.ARMS;

import bhandari.ENUMS.Limb;
import bhandari.ENUMS.Side;
import bhandari.PAD.FootPad;

public abstract class Arm {
	
	//defining variables
	private String serialNumber;
	private Side side;
	private Limb upper;
	private Limb lower;
	private FootPad pad;
	
	//constructor
	public Arm(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	//abstract method
	public abstract boolean armCheck();

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

	public FootPad getPad() {
		return pad;
	}

	public void setPad(FootPad pad) {
		this.pad = pad;
	}
	
}
