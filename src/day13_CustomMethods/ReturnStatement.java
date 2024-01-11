package day13_CustomMethods;

public class ReturnStatement {
    public static void main(String[] args) {

        eligible(155);
        System.out.println(multiplication(2,4));

        System.out.println("---------------return statement terminating the main method------");

        System.out.println("Test 1 started");
        boolean exit = true;
        if (exit){return;}// here if the boolean is true the return statement will exit/terminate  the main method and rest of the statement will not be printed/executed, else they will get executed.
        // if we give anything after the return statement that will give us compile error as the return statement exits the mention method and nothing gets executed after it theres why it gives compile error

        System.out.println("Test 2started");
        System.out.println("Test 3 started");





    }

    public static void eligible(int age){
        if(age<0 || age >150){
            System.err.println("Invalid age: "+age);
            return;// exits the method, means no execution of the method, here thats the only job of the return statement
        }if (age>=21){
            System.out.println("You are eligible to buy alcohol");
    }else {System.out.println("you are not eligible to buy alcohol");}}


    public static int multiplication (int n1, int n2){
        return n1*n2;// here returns the value when exiting
    }
}
