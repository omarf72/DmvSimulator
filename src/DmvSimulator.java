import java.util.Random;
import java.security.SecureRandom;

public class DmvSimulator {

    public static void main(String[] args) {
        System.out.println("Welcome to the DMV ");

        SecureRandom ran= new SecureRandom();
        
        int num=ran.nextInt(200)+1;


        System.out.println("Your number is "+num+" please wait until it is called.");

        for (int i = num + 1; ; i++) {
            if (i > 200) {
                i = 1; // Wrap around if we reach 100


            }

            System.out.println("Now serving number " + i + "...");
            System.out.println();
            
           
            if (i == num) {
                System.out.println("Your number (" + num + ") is now being served. Please proceed to the counter.");
                System.out.println();
                break; // Exit the loop once user's number is called
            }


    }
    System.out.println(" You dont have required paperwork ");

    }
}

