package bhandari.FACTORY;

import java.util.ArrayList;

import bhandari.DROID.AstromechDroid;

public abstract class DroidFactory {
	
	//defining variables
	protected String factoryID;
	private ArrayList<AstromechDroid>droidStorage;
	
	//constructor
	public DroidFactory(String factoryID) {
		this.factoryID = factoryID;
	}
	
	//abstract method
	public abstract boolean buildDroids(int count);

	//getters and setters
	public String getFactoryID() {
		return factoryID;
	}

	public void setFactoryID(String factoryID) {
		this.factoryID = factoryID;
	}

	public ArrayList<AstromechDroid> getDroidStorage() {
		return droidStorage;
	}

	public void setDroidStorage(ArrayList<AstromechDroid> droidStorage) {
		this.droidStorage = droidStorage;
	}
	
	
	
	
}
