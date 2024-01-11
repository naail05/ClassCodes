package day09_switch_Scanner;

import java.util.Scanner;

public class ScannerIntro2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first decimal number: ");
        float number = input.nextFloat();

        System.out.println("Enter your second decimal number: ");
        double number2 = input.nextDouble();

        System.out.println("Enter true/false ");// there should be one entry either true or false
        boolean r = input.nextBoolean();




        System.out.println("number = " + number);
        System.out.println("number2 = " + number2);
        System.out.println("r = " + r);
        input.close();


    }
}
