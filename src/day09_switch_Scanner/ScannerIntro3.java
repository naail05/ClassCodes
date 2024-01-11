package day09_switch_Scanner;

import java.util.Scanner;

public class ScannerIntro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.next();// for a single word

        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        input.nextLine();

        System.out.println("Enter your full name: ");
        String FullName = input.nextLine();// the nextline method prints full line on the console as compared with next which only prints one word
        // however one issue with next line is when it  is used after next methods of scanner




        System.out.println("Name = " + name);
        System.out.println("You have entered: "+ch);
        System.out.println(" Bashir Naail");
        input.close();


    }
}
