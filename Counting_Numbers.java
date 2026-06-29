package Assignments;

public class Counting_Numbers {

	public static void main(String[] args) {
		int num =987456;
		int count = 0;
		while (num != 0) {
			num = num/ 10;
			count++;
		}
		System.out.println("Numbe of digits =" +count);
		
	
	}

}