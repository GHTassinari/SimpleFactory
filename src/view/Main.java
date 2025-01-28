package view;

import model.Employee;
import model.EmployeeFactory;
import model.EmployeeType;
import model.Programmer;

public class Main {

	public static void main(String[] args) {
		Employee manager = EmployeeFactory.createEmployee(EmployeeType.MANAGER);
		Employee programmer = EmployeeFactory.createEmployee(EmployeeType.PROGRAMMER);
		Employee leader = EmployeeFactory.createEmployee(EmployeeType.LEADER);
		
		System.out.println(manager);
		System.out.println(programmer);
		System.out.println(leader);
	}

}