package my_first_project;

import java.util.Scanner;


public class Home_work {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter The Number: ");
	int Num = sc.nextInt();
	
	if(Num%3 == 0 && Num%5 == 0) {
		System.out.println("Mango and Apple");
	}
	else if(Num%3 == 0) {
		System.out.println("Mango");
	}
	else if(Num%5 == 0) {
		System.out.println("Apple");
	}
	else {
		System.out.println("The Number is " +Num);
	}
	}

}
