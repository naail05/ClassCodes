package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class OddOrEven_nestedLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            //determine if the number is odd or even

            if (number % 2 == 0) {
                System.out.println(number + " is even number");
            } else {
                System.out.println(number + " is odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();




            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();}






                if (answer.equals("no")) {

                    break;
                }




        }

    }
}
