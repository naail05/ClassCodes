package day09_switch_Scanner;

import java.util.Scanner;

public class NextLine_Practice {

    public static void main(String[] args) {

        Scanner Practice = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String FullName = Practice.nextLine();



        System.out.println("Enter your address: ");
        //no need to clear the scanner memory for the new next line method as the earlier method used is also a next line which left nothing in the scanner memory
        String Address = Practice.nextLine();

        System.out.println("Enter your gender: ");
        String Gender = Practice.next();// as gender is only one word, so we use next method instead of next-line method

        System.out.println("Provide your age: ");
        int age = Practice.nextInt();
        Practice.nextLine();//to clear what is left in the scanner memory( which are two enters from the earlier two next methods) this is only required when we use next line method after other methods. if next line is used at the beginning or after other next line then there is no need

        System.out.println(" Provide your father name: ");
        String FatherName = Practice.nextLine();


        System.out.println("FullName = " + FullName);
        System.out.println("Address = " + Address);
        System.out.println("Gender = " + Gender);
        System.out.println("age = " + age);
        System.out.println("FatherName = " + FatherName);
        Practice.close();
    }
}
