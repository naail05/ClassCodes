package day09_switch_Scanner;
//import java.util.Scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {


Scanner scan = new Scanner(System.in);// after giving this scanner class will have connection with keyboard, means can take data typed by user

        System.out.println("----------------Scanner methods--------------");
       /*
        System.out.println("Enter a number : ");
        //byte num = scan.nextByte();
        short num = scan.nextShort();
        System.out.println("You entered: "+num);
           */

        System.out.println("Enter your first number: ");
        byte num1 = scan.nextByte();// provides numbers withing byte range

         System.out.println("Enter your second number: ");
         short num2 = scan.nextShort();// provide number within short's range

        System.out.println("Enter your third number: ");
        int num3 = scan.nextShort(); // provides number withing int range

         System.out.println("Enter your fourth number: ");
         long num4 = scan.nextLong();// provide number within long's range




        System.out.println("Enter your fifth number: ");
        int num5 = scan.nextInt();
         scan.close();//means the scanner is closed and after this line cant be used again, if we want then we have to create a new one. So we have to add the closing  after the point where we do not need to use the scanner anymore
        System.out.println("First number is: "+num1);
        System.out.println("Second number is: "+num2);
        System.out.println("Third number is: "+num3);
        System.out.println("Fourth number is: "+num4);
        System.out.println("Fifth number is: "+num5);



    }
}
