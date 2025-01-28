package model;

public enum EmployeeType {
	MANAGER(0),
	PROGRAMMER(1),
	LEADER(2);
	
	private int value;
	
	EmployeeType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
