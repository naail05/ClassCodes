package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class CydeoLogIn {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userN = input.next();

        System.out.println("Enter your password:");
        String pass = input.next();

        if( userN.equals("Cydeo") && pass.equals("WoodenSpoon")){
            System.out.println("Logged in.");// if credentials are correct
        }else { //otherwise

            for (int i = 0; i < 3; i++) {
                if(i !=2) {System.err.println("Incorrect username/password, please try again");}
                else{System.err.println("Incorrect username/password, please try again. warning! if entered incorrect your account will be locked ");}
                System.out.println("Enter your username:");
                userN = input.next();
                System.out.println("Enter your password:");
                pass = input.next();

                if (userN.equals("Cydeo") && pass.equals("WoodenSpoon")) {//if the user enters valid credential
                    System.out.println("Logged in.");
                    break;//exits the loop
                }else{  System.out.println("Your account is locked!");
                    }

        }
        }input.close();
    }
}

/*
 // System.out.println("Your account is locked!");
 if (!(userN.equals("Cydeo") && pass.equals("WoodenSpoon"))){
            System.out.println("Your account is locked!");
 Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."
 */
