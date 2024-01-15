package day38_exceptions_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
       /*
        System.out.println("Program1 started");
       // System.out.println(100/0); we can not handle this exception by using throws keyword as it is unchecked exception, th only way to handle this is by using try-catch block

        //now will take into account a checked exception, where we will use both try-catch block and throws keyword solutions

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }// here the exception was handled, but we had to use two blocks of codes


        System.out.println("Program1 ended");


        System.out.println("-----------------------------------------------------");
//lets say we have another program as well and we used the  Thread.sleep(); again, so we have to use the try-catch block again to handle the exception
        System.out.println("Program2 started");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }// here the exception was handled, but we had to use two blocks of codes


        System.out.println("Program2 ended");
        */

        //now will use throws keyword method for handling, where we need to put "throws InterruptedException" in the method signature between () and the body of method

        System.out.println("Program3 started");

        Thread.sleep(3000);

        System.out.println("Program3 ended");

        System.out.println("--------------------------------");

        System.out.println("Program4 started");

        Thread.sleep(3000);

        System.out.println("Program4 ended");

        //here is we have many more programs as well we will not need to add anything fo handling that exception, but it is good, when we do not aim to call this method anywhere, as it is temporary solution

        System.out.println("--------------------------------");

        System.out.println("Program5 started");

      //  FileInputStream file = new FileInputStream("");

        System.out.println("Program5 ended");
//so for this error we just need to add the exception type in the throws section

    }

}
