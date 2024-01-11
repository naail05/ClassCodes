package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class Login_DoWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userN ,pass ;
        int attempts = 3;

        do {
            System.out.println("Enter your username:");
           userN = input.next();

            System.out.println("Enter your password:");
            pass = input.next();
            attempts--;
            if (attempts==0) {break;// with this condition the loop will exit else will continue to execute until the condition is true like in this case. else will execute as soon as the condition is false
            }


        }while (!(userN.equals("Cydeo") && pass.equals("WoodenSpoon")));// while the credentials are invalid

    }


}
