package day12_CustomMethodsIntro;


import java.util.Scanner;

public class Task1_fullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String FirstName = input.nextLine().trim().replace(" ","");// we added trim method to remove the white spaces (if any) and we added the replace method to remove any space in between the character of the name

        System.out.println("Enter your last name:");
        String LastName = input.nextLine().trim();

        input.close();

         FirstName = FirstName.substring(0,1).toUpperCase()+FirstName.substring(1).toLowerCase();//getting the first character of first name and the remaining characters



         LastName = LastName.substring(0,1).toUpperCase()+LastName.substring(1).toLowerCase();


        System.out.println(FirstName+" "+LastName);






    }
}
/*
Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School

 */