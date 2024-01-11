package day06_IfStatementsIntro;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;

        boolean isEvenNumber = number%2==0;


        if(isEvenNumber){
            System.out.println(number +" is even number ");

        }
        if(!isEvenNumber){
            System.out.println(number +" is odd number ");

        }

        System.out.println("---------with creating boolean variable---------");

        if(number%2==0){
            System.out.println(number +" is even number ");

        }
        if(number%2!=0){
            System.out.println(number +" is odd number ");

        }





    }
}
/*

write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)
 */