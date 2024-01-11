package day11_StringsContinue;

import java.util.Scanner;

public class Practice2_LogIn {
    public static void main(String[] args) {

        String CorrectUsername = "Cydeo";
        String CorrectPassword = " WoodenSpoon";
        CorrectPassword =CorrectPassword.trim();// to remove the unwanted spaces

        Scanner LogIn = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName= LogIn.nextLine();

        System.out.println("Enter your password: ");
        String password = LogIn.nextLine();
        LogIn.close();

        if (userName.equals(CorrectUsername) && password.equals(CorrectPassword)){
            System.out.println("Welcome to cydeo");} else if (userName.equals(CorrectUsername)) {
            System.out.println("incorrect password");} else if (password.equals(CorrectPassword)) {System.out.println("incorrect username");}else {
            System.err.println("account locked!");// to have msg in red color

        }

    }


    }

/*
Create a class named LogIn
			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and password
				otherwise print the error message "Incorrect username or password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */