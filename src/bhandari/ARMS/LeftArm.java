package bhandari.ARMS;

import bhandari.ENUMS.Limb;
import bhandari.ENUMS.Side;
import bhandari.ENUMS.Status;
import bhandari.PAD.LeftFootPad;

public class LeftArm extends Arm{
	
	
	//defining variables
	private String serialNumber = "LA-01";
	private Status status;
	private Side side;
	private LeftFootPad pad;
	private Limb upper;
	private Limb lower;
	
	//constructor
	public LeftArm(String serialNumber) {
		super("LA-01");
		this.serialNumber = "LA-01";
		this.status = Status.ONLINE;
		this.side = Side.LEFT;
		this.upper = Limb.Upper;
		this.lower = Limb.Lower;

	}
	
	//armCheck method to check the status of the left arm
	@Override
	public boolean armCheck() {
		if((getStatus() == Status.ONLINE) && (getPad().getLeftPadStatus() == Status.ONLINE)) {
			return true;
		} else { 
			setLeftArmStatus(Status.OFFLINE);
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

	public Status getStatus() {
		return status;
	}

	public void setLeftArmStatus(Status status) {
		this.status = status;
	}

	public Side getSide() {
		return side;
	}

	public void setSide(Side side) {
		this.side = side;
	}

	public LeftFootPad getPad() {
		return pad;
	}

	public void setPad(LeftFootPad pad) {
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
