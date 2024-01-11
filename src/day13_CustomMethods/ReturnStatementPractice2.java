package day13_CustomMethods;

import java.util.Scanner;

public class ReturnStatementPractice2 {

    public static void main(String[] args) {

        int number = new Scanner(System.in).nextInt();
        if(number<1 || number>7){
            System.err.println("Invalid number: "+number);
            return;// to terminate the method if invalid number entered/exit
        }
        System.out.println( (number == 1 ) ? "Monday" :(number == 2 ) ? "Tuesday" :(number == 3 ) ? "Wednesday" :(number == 4 ) ? "Thursday" :(number == 5 ) ? "Friday" :(number == 6 ) ?  "Saturday" : "Sunday");



    }
    /*
    combine("look","will");






    }

    public static void  combine (String a,String b){
       a = a.toLowerCase().trim();
       b = b.toLowerCase().trim();
    if(a.charAt(a.length()-1)==b.charAt(0)){
        System.out.println((a+(b.substring(1))));}else{
        System.out.println(
        (a+b));}}


     */
}
/*

  String result = "";//First we will assign temporary value "" so not to get error

        int number  = 4;
        if(number>=1 && number<=7){

        if (number == 1 ) {

            result= "Monday";
        }

        else if (number == 2 ) {

            result ="Tuesday";
        }

        else if(number == 3 ) {

            result="Wednesday";
        }

        else if (number == 4 ) {

            result = "Thursday";
        }

        else if(number == 5 ) {

            result ="Friday";
        }

        else if(number == 6 ) {

            result ="Satureday";
        }

        else  {

            result ="Sunday";
        }}
        else{ result ="Invalid";}

        System.out.println(result);//now we only need one print statement

 */