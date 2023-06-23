package bhandari.ENUMS;

public enum Limb {
	
	//limb specifics
	Upper("Upper", 1), Lower("Lower", 2);
	
	//defining variables
	private String type;
	private int value;
	
	//constructor
	private Limb(String type, int value) {
		this.type = type;
		this.value = value;
	}

	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
