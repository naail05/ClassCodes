package day06_IfStatementsIntro;

public class EvenlyDivisible_warmup3 {

    public static void main(String[] args) {

        int number = 45;

        boolean isDivisibleBy2 = number%2==0;//true is number is evenly divisible by 2, else false
        boolean isDivisibleBy3 = number%3==0;//true is number is evenly divisible by 3, else false
        boolean isDivisibleBy5 = number%5==0;//true is number is evenly divisible by 5, else false

        System.out.println( number +" is divisible by 2: "+ isDivisibleBy2);
        System.out.println( number +" is divisible by 3: "+ isDivisibleBy3);
        System.out.println( number +" is divisible by 5: "+ isDivisibleBy5);



    }
}
/*
Create a class named EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

            Evenly Divisible ==> remainder is zero



Single If Statement: can be used for creating condition for one possible output


 */