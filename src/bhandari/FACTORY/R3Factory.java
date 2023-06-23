package bhandari.FACTORY;

import java.text.DecimalFormat;
import java.util.ArrayList;

import bhandari.DROID.AstromechDroid;
import bhandari.DROID.R3;

public class R3Factory extends DroidFactory {
	//decimal format to print out the three zeros
	DecimalFormat DF = new DecimalFormat("000");
	
	//defining variables
	private ArrayList<AstromechDroid> DroidStorage = new ArrayList<AstromechDroid>();
	
	//constructor
	public R3Factory(String factoryID) {
		super(factoryID);
	}
	
	//buildDroids method to build droids and increase the number of the serial number by 1
	@Override
	public boolean buildDroids(int count) {
		//ArrayList<AstromechDroid> DroidR3Storage = new ArrayList<AstromechDroid>();
		int x = 000;
		for(int i = 0; i < count; i++) {
			String serialNumber = getFactoryID().substring(0, 2)+ "-" + DF.format(x);
			R3 DroidR3 = new R3(serialNumber);
			x++;
			DroidStorage.add(DroidR3);
		}
		return true;
	}
	
	//displayAllDroids method to display all the droid info
	public void displayAllDroids() {
		for(int i = 0; i < DroidStorage.size(); i++ ) {
			DroidStorage.get(i).displayDroid();
		}
	}

	//getters and setters
	public ArrayList<AstromechDroid> getDroidStorage() {
		return DroidStorage;
	}

}
