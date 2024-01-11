package day37_execeptions;

import day35_polymorphism_intro.transportation.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

       Car car = null;
        //here we have car reference variable, but not the car object, so in this case if we call the instance variable it might give exception

        try {
            car.drive();
        }catch (ArithmeticException e){//this will handle if it is arithmetic exception
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ClassCastException e){//this will handle if it is Class Cast
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch (NullPointerException e){//this will handle if it is null pointer
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (RuntimeException e){//this will handle if it is other than above
            System.out.println("Forth catch block");
            e.printStackTrace();
        }
        //so whichever is able to catch and handle the execution than that block will be executed only
        //But there is one rule that parent exception block (RuntimeException in this case) can not be placed first, as it will give us compile error, as that will handle the exception and nothing will be left to the remaining, so it will give us error

        System.out.println("Program1 ended");
    }
}
