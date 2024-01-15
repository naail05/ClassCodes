package day38_exceptions_handling;

import Utilities.Library;

public class Test {

    public static void main(String[] args) {

        System.out.println("Hello Cydeo");//need to pause for eg. 3.5 seconds
        Library.sleep(3.5);// we are calling our own custom method
        System.out.println("Hello future");

        /* here we will still get that exception and need to handle it here again when we call the mentioned method
        System.out.println("Hello Cydeo");//need to pause for eg. 3.5 seconds
        Library.sleep2(3.5);// we are calling our own custom method
        System.out.println("Hello future");*/
    }
}
