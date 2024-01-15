package day38_exceptions_handling;

import Utilities.Library;

import java.time.LocalTime;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");//need to pause for eg. 3.5 seconds
        Library.sleep(3.5);// we are calling our own custom method
        System.out.println("Hello future");

        /* here we will still get that exception and need to handle it here again when we call the mentioned method as many times as needed
        System.out.println("Hello Cydeo");//need to pause for eg. 3.5 seconds
        Library.sleep2(3.5);// we are calling our own custom method
        System.out.println("Hello future");*/

        System.out.println("-------------------------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0)));
        //throw new BreakTimeException();
        //if the time is 4pm it will throw this exception
        //now that we created a new constructor for our exception class we can give an argument

       // throw new BreakTimeException();

        throw  new BreakTimeException("Its time to go home");

    }
}
