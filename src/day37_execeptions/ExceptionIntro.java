package day37_execeptions;

import java.io.FileInputStream;

public class ExceptionIntro {

    public static void main(String[] args) {
        String str = "Java";
       // char ch = str.charAt(200);//this will cause OutOfBoundException, which is unchecked exception
       // System.out.println(ch);//so this and other code fragments after this will not be executed due to the above exception

        Pizza pizza = null;
        //pizza.calcCost();//we can call this method, but now that null does not reference to any object, so we will get an unchecked exception of NullPointerException

        //System.out.println(20/0);// as we can not divide any number by zero, so we will get an unchecked exception "ArithmeticException"

        System.out.println("Hello World");

        System.out.println("----------------------------------------------");

        int score = 100;
        if (score>59){
            System.out.println("Your grade is D");//now there is bug not exception, as it still compiles and does not give any exception, and does not crash the program and execution still takes place
        }else if (score>70){
            System.out.println("Your grade is C");
        }

        System.out.println("----------------checked Exceptions-----------------");

       // FileInputStream file = new FileInputStream("");// this is an example of checked exception as compiler tells us and we get an error and code fragments will not compile

        //Thread.sleep(2000);// this is an example of checked exception as compiler tells us and we get an error and code fragments will not compile


    }
}
