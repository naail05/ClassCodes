package day09_switch_Scanner;

import java.util.Scanner;

public class Nextline_vs_Next {

    public static void main(String[] args) {

        Scanner Difference = new Scanner(System.in);

        System.out.println("Enter your age: ");
        String age = Difference.next();//35 (age number)+Enter, where next method will take the number value from here and leave out the enter,

        Difference.nextLine();//by adding a next line method right after other methods, it will take the leftover in the memory and the new next line will wait for the data from the user

        System.out.println("Enter your Full name: ");
        String FullName = Difference.nextLine();// so when we use next line after this what next line does is checks what is left in the scanner's memory to read and if there is no data left in the scanner memory then it wait for the user to provide the data, where right now the data (Enter) iss already in the memory so it  reads that and does not wait for the user to provide the data

        System.out.println("age = " + age);
        System.out.println("FullName = " + FullName);
        Difference.close();



    }
}
