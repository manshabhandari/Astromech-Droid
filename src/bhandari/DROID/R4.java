package bhandari.DROID;

import bhandari.ARMS.LeftArm;
import bhandari.ARMS.RightArm;
import bhandari.COMPONENT.Chasis;
import bhandari.COMPONENT.SensorDome;
import bhandari.ENUMS.Battery;
import bhandari.ENUMS.Radar;
import bhandari.ENUMS.Status;

public class R4 extends AstromechDroid{
	
	//defining variables
	private Status R4Status;
	private Battery R4Battery;
	private Radar R4Radar;

	//constructor
	public R4(String serialNumber) {
		super(serialNumber);
		this.R4Status = Status.ONLINE;
		this.R4Battery = Battery.R4;
		this.R4Radar = Radar.R4R;
		SensorDome SD = new SensorDome(serialNumber);
		Chasis C = new Chasis(serialNumber);
		this.height = SD.getHeight() + C.getHeight();	
		this.weight = SD.getWeight() + C.getWeight();
		
		LeftArm la1 = new LeftArm(serialNumber);	
		RightArm ra1 = new RightArm(serialNumber);
		
		this.setLeftArm(la1);
		this.setRightArm(ra1);
		this.setDome(SD);
		this.setChasis(C);
	}
	
	//checkStatus method that is void
	@Override
	public void checkStatus() {
	}
	
	//displayDroid method to display the information for each R4 droid
	public void displayDroid() {	
		LeftArm LA1 = new LeftArm(serialNumber);	
		RightArm RA1 = new RightArm(serialNumber);
		System.out.println("R4 Astromech");
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Status: " + this.R4Status);
		System.out.println("Battery: " + getR4Battery().getType());
		System.out.println("SensorDome Serial Number " + serialNumber);
		System.out.println("Chasis Serial Number " + serialNumber);
		System.out.println("Left Arm Serial Number " + LA1.getSerialNumber());
		System.out.println("Right Arm Serial Number " + RA1.getSerialNumber());
		System.out.println();
	}

	//getters and setters
	public Status getR4Status() {
		return R4Status;
	}

	public void setR4Status(Status r4Status) {
		R4Status = r4Status;
	}

	public Battery getR4Battery() {
		return R4Battery;
	}

	public void setR4Battery(Battery r4Battery) {
		R4Battery = r4Battery;
	}

	public Radar getR4Radar() {
		return R4Radar;
	}

	public void setR4Radar(Radar r4Radar) {
		R4Radar = r4Radar;
	}
	
	
}