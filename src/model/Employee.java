package model;

public abstract class Employee {
	private String position;
	
	public Employee(String position) {
		this.position = position;
	}
	
	public abstract double calculateSalary();
	
	@Override
	public String toString() {
		return String.format("%s: R$ %.2f", 
				position, calculateSalary());
	}
}
