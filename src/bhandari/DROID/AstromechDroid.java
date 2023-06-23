package bhandari.DROID;

import bhandari.ARMS.*;
import bhandari.COMPONENT.*;
import bhandari.INTERFACES.Droid;

public abstract class AstromechDroid implements Droid {
	
	//defining variables
	protected String serialNumber;
	protected double height;
	protected double weight;
	private SensorDome dome;
	private Chasis chasis;
	private LeftArm leftArm;
	private RightArm rightArm;
	
	//constructor
	public AstromechDroid(String serialNumber) {
		this.serialNumber = serialNumber;
		this.leftArm = leftArm;
	}
	
	//abstract method checkStatus
	public abstract void checkStatus();

	//getters and setters
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public double getHeight() {
		return (SensorDome.height + Chasis.height);
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return (SensorDome.weight + Chasis.weight);
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public SensorDome getDome() {
		return dome;
	}

	public void setDome(SensorDome dome) {
		this.dome = dome;
	}

	public Chasis getChasis() {
		return chasis;
	}

	public void setChasis(Chasis chasis) {
		this.chasis = chasis;
	}

	public LeftArm getLeftArm() {
		return leftArm;
	}

	public void setLeftArm(LeftArm leftArm) {
		this.leftArm = leftArm;
	}

	public RightArm getRightArm() {
		return rightArm;
	}

	public void setRightArm(RightArm rightArm) {
		this.rightArm = rightArm;
	}
	
	
	
}
