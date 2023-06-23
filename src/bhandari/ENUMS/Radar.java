package bhandari.ENUMS;

public enum Radar {
	
	//radar specifics
	R4R("Doppler", 500);
	
	//defining variables
	private String type;
	private int range;
	
	//constructor
	private Radar(String type, int range) {
		this.type = type;
		this.range = range;
	}
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	
	
}
