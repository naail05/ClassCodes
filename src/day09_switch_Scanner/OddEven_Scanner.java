package day09_switch_Scanner;

import java.util.Scanner;

public class OddEven_Scanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int number = input.nextInt();




        String result = "";


        if(number%2==0) { result = number+" is an even number";}
        else{result = number+" is an odd number";}

        System.out.println(result);

        input.close();
        }

    }

/*
Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero
 */