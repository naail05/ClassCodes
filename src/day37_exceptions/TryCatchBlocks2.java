package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");
        int[] arr = {1, 2, 3, 4};

       try {
           System.out.println(arr[1000]);
       }catch (RuntimeException e) {
          // e.printStackTrace();//this will display the full details of the exception after the execution
       }
        System.out.println("Program1 ended");

        System.out.println("------------------------------------");
        System.out.println("Program2 started");
        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------checked exceptions-------------------");
        System.out.println("Program3 started");
        try {
            FileInputStream file = new FileInputStream("file path");
        } catch (FileNotFoundException e) {
            System.out.println("Catch block 3");
           e.printStackTrace();
        }
        System.out.println("Program3 ended");

        System.out.println("------------------------------------------------");


        System.out.println("Program4 started");

        try {
            Thread.sleep(3000);
            System.out.println("try block");
        } catch (InterruptedException e) {
            System.out.println("Catch block 4");
           // e.printStackTrace();
        }

        System.out.println("Program4 ended");
    }
}
