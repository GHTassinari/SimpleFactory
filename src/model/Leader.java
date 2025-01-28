package model;

public class Leader extends Employee{
	private String position;
	
	Leader(){
		super("Leader");
	}
	
	@Override
	public double calculateSalary(){
		return 12000;
	}
}
