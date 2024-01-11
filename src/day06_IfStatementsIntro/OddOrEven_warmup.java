package day06_IfStatementsIntro;

public class OddOrEven_warmup {
    public static void main(String[] args) {

        int number = 20;

        boolean isEven = number %2==0;//the remainder should be zero for even number
        System.out.println(number + " is a odd number: "+ isEven);//use concatenation
        System.out.println();

        number = 60;
        //boolean isOdd = number %2!=0;// in case of odd the remainder can not be equal to zero
        //System.out.println(isOdd);
        boolean isOdd =!isEven;// this is the opposite or is Not expression, where odd is opposite of even
        System.out.println(number + " is an even number: "+ isOdd);




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