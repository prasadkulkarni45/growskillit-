package Assignments;

public class Employee {
	int empId;
	String name;
	double salary;
	
	static String companyName = "ABC Technologies";
	Employee(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		
	}
	static void displayCompany() {
		System.out.println("companyName:" + companyName);
	}
	void displayEmployee() {
		System.out.println("empId:"+empId);
		System.out.println("name:"+name);
		System.out.println("salary:"+ salary);
		System.out.println("----------------");
	}
}
