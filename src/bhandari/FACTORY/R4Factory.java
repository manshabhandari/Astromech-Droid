package bhandari.FACTORY;

import java.text.DecimalFormat;
import java.util.ArrayList;

import bhandari.DROID.AstromechDroid;
import bhandari.DROID.R4;

public class R4Factory extends DroidFactory {
	//decimal format to print three zeros
	DecimalFormat DF = new DecimalFormat("000");
	
	//defining variables
	private ArrayList<AstromechDroid> DroidR4Storage = new ArrayList<AstromechDroid>();
	
	//constructor
	public R4Factory(String factoryID) {
		super(factoryID);
	}

	//buildDroids method to build droids and increase serial number by 1
	@Override
	public boolean buildDroids(int count) {
		int x = 000;
		for(int i = 0; i < count; i++) {
			R4 DroidR4 = new R4(factoryID.substring(0, 2) + "-" + DF.format(x));
			x++;
			DroidR4Storage.add(DroidR4);
		}
		return true;
	}
	
	//displayAllDroids method to display all the droid info
	public void displayAllDroids() {
		for(int i = 0; i < DroidR4Storage.size(); i++ ) {
			DroidR4Storage.get(i).displayDroid();
		}
		
		
	}
	

}
