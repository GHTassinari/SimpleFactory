package model;

public class EmployeeFactory {
	public static Employee createEmployee(EmployeeType employeeType) {
		if(employeeType == EmployeeType.MANAGER) {
			return new Manager();
		} else if (employeeType == EmployeeType.LEADER) {
			return new Leader();
		}else  {
			return new Programmer();
		}
	}
}
