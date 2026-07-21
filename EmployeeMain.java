package Assignments;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee.displayCompany();
		System.out.println();
		Employee e1=new Employee(101,"prasad",50000);
		Employee e2=new Employee(102,"Samarth",52525);
		Employee e3=new Employee(103,"Rohit",454545);
		
		e1.displayEmployee();
		e2.displayEmployee();
		e3.displayEmployee();
		
	}

}
