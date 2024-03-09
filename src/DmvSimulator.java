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
    if(ran.nextInt(100)+1==1)
    {
        System.out.println("You have the correct papers");
    }
    else{
        System.out.println("This isn't even close to the right stuff! Get out of here! MUAHAHAHA");
    }
    

    }
}

