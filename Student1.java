package Assignments;

public class Student1   extends Person1{
	int marks;
	Student1(String name, int age, int marks){
		super(name,age);
		this.marks = marks;
		
	}
	
	void display() {
		System.out.println("name  :"+name);
		System.out.println("age  :"+age);
		System.out.println("marks  :"+marks);
	}

}
