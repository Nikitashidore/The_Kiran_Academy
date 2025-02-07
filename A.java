package home_work_no_2;

public class A {
    public static void main(String[] args) {
        // for loop 
    	System.out.println("The number is 1 to 10 using for loop: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        
        // while loop
        System.out.println("The number is 1 to 10 using While loop: ");
        int k = 1;
        while (k <= 10) {
            System.out.println(k);
            k++;
        }
        
        //do while loop
        System.out.println("The number is 1 to 10 using Do while loop: ");
        int j = 1;
        do {
        	System.out.println(j);
            j++;
        }while(j <= 10);
    }
}
