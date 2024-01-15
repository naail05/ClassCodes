package day37_exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {
        System.out.println("Program1 started");

        // this below code is going to cause an uncheck exception, which will cause the program to terminate, so we will not be able to execute any code fragment after this, till we do not handle it, so will try and catch block

        //will place the code causing the exception in the try block
        try {
            System.out.println(9/0);
            System.out.println("Try block");//just to see which one handles the exception
        }catch (ArithmeticException e){
            System.out.println("Catch block");
        }
        // whichever block catches and handle the exception the code fragment in that block will be executed


        System.out.println("Program ended");


        System.out.println("---------------------------------------------");
        System.out.println("Program2 started");


        String str= null;
        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        }catch (RuntimeException e){//if we dont know the exact exception class, so we use the parent class which is runtimeException, for the unchecked ones
            System.out.println("Catch block");
        }

        System.out.println("Program2 ended");

        System.out.println("---------------------------------------------");
        System.out.println("Program3 started");

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try block");
        }catch (Exception e){// we can use the grand parent class of Exception as well, but it is not really recommended as this is also for checked exceptions as well
            System.out.println("Catch block");
        }

        System.out.println("Program2 ended");

        System.out.println("---------------------------------------------");

        System.out.println("Program4 started");
        try {
            Thread.sleep(3000);//it is example of check exception
            System.out.println("Try block");// here try block is handling this exception
        }catch (InterruptedException e){
            System.out.println("Catch block");
        }


        System.out.println("Program4 ended");

    }
}
