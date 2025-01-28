package model;

public class Programmer extends Employee {
	
	Programmer() {
		super("Programmer");
	}

	@Override
	public double calculateSalary(){
		return 8000;
	}
}
