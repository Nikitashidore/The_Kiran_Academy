package home_work_no_2;

import java.util.Scanner;

public class HomeWork_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		int Num = sc.nextInt();
		int result = 0;
		
		if(Num %  5 == 0) {
			result = Num;
		}
		else if(Num %  5 == 1) {
			result = Num - 1;
		}
		else if(Num %  5 == 2) {
			result = Num - 2;
		}
		else if(Num %  5 == 3) {
			result = Num - 3;
		}
		else if(Num %  5 == 4) {
			result = Num - 4;
		}
		System.out.println("The value Input is "   +  Num   + " output Number is -> " + result);
		
	}

}
