package bhandari.DROID;

import bhandari.ARMS.LeftArm;
import bhandari.ARMS.RightArm;
import bhandari.COMPONENT.Chasis;
import bhandari.COMPONENT.SensorDome;
import bhandari.ENUMS.Battery;
import bhandari.ENUMS.Status;

public class R3 extends AstromechDroid{
	
	//defining variables
	private Status R3Status;
	private Battery R3Battery;

	//constructor
	public R3(String serialNumber) {
		super(serialNumber);
		this.R3Status = Status.ONLINE;
		this.R3Battery = Battery.R3;
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
	
	//checkStatus method to check the status of the sensordome, chasis, left arm, right arm
	public void checkStatus() {
		
		if(super.getLeftArm().armCheck() == true) {
			if(super.getDome().sensorDomeCheck() == true) {
				if(super.getChasis().chasisCheck() == true) {			
					if(super.getRightArm().armCheck() == true) {
						setR3Status(Status.ONLINE);
						System.out.println("R3 Astromech is ONLINE");
					}
				}
			}
			
		} else {
				setR3Status(Status.OFFLINE);
				System.out.println("R3 Astromech is OFFLINE");
			}
		
	}
	
	//displayDroid method to display the information for each R3 droid
	public void displayDroid() {
		LeftArm LA1 = new LeftArm(serialNumber);	
		RightArm RA1 = new RightArm(serialNumber);
		System.out.println("R3 Astromech");
		System.out.println("Serial Number: " + serialNumber);
		System.out.println("Status: " + this.R3Status);
		System.out.println("Battery: " + getR3Battery().getType());
		System.out.println("SensorDome Serial Number " + serialNumber);
		System.out.println("Chasis Serial Number " + serialNumber);
		System.out.println("Left Arm Serial Number " + LA1.getSerialNumber());
		System.out.println("Right Arm Serial Number " + RA1.getSerialNumber());
		System.out.println();
	}

	//getters and setters
	public Status getR3Status() {
		return R3Status;
	}

	public void setR3Status(Status r3Status) {
		R3Status = r3Status;
	}

	public Battery getR3Battery() {
		return R3Battery;
	}

	public void setR3Battery(Battery r3Battery) {
		R3Battery = r3Battery;
	}
	
}
