package day06_IfStatementsIntro;

public class IdentifyNumber_warmup2 {

    public static void main(String[] args) {

        int number = 200;

        boolean isPositive = number >0 ;//when more than zero than its positive
        boolean isNegative = number<0;
        boolean isZero = number==0;

        System.out.println( number +" is positive number : "+ isPositive);
        System.out.println( number +" is negative number : "+ isNegative);
        System.out.println( number +" is zero : "+ isZero);
        System.out.println("---------------------------------------------------");

        number = -180;
        isPositive = number >0 ;
        isNegative = number<0;
        isZero = !isPositive && !isNegative;//if the number is not positive and not negative then it is zero, thats what this boolean expression says or explains

        System.out.println( number +" is positive number : "+ isPositive);
        System.out.println( number +" is negative number : "+ isNegative);
        System.out.println( number +" is zero : "+ isZero);


    }
}
/*

Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */