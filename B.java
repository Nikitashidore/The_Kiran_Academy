package home_work_no_2;

public class B {
    public static void main(String[] args) {
        // for loop 
    	System.out.println("The number is 44 to 22 using for loop: ");
        for (int i = 44; i >= 22; i--) {
            System.out.println(i);
        }

        
        // while loop
        System.out.println("The number is 44 to 22 using While loop: ");
        int k = 44;
        while (k >= 22) {
            System.out.println(k);
            k--;
        }
        
        //do while loop
        System.out.println("The number is 44 to 22 using Do while loop: ");
        int j = 44;
        do {
        	System.out.println(j);
            j--;
        }while(j >= 22);
    }
}
