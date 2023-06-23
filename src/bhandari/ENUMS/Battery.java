package bhandari.ENUMS;

public enum Battery {
	
	//the R3 and R4 battery specifics
	R3("Lithium", 1000), R4("Trithium", 2000);
	
	//defining variables
	private String type;
	private int amps;
	
	//constructor
	private Battery(String type, int amps) {
		this.type = type;
		this.amps = amps;
	}
	
	//getters and setters
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmps() {
		return amps;
	}

	public void setAmps(int amps) {
		this.amps = amps;
	}

	
	
}
