package day12_CustomMethodsIntro;

public class CustomMethodIntro {

     public static void displayMessage(){// as methods can be created anywhere inside the class, but outside other method

        System.out.println("Hello world");
        System.out.println("I love Java");



    }

    public static void main ( String[] args){

        System.out.println(" Test started");

greetings();// calling the custom method and its the only time that it can get executed, else if not called then it will not be executed

        System.out.println(" Test completed");

        // as the execution is fom top to bottom, so first the first statement will be printed, then the method, means whatever is in the method body, and then whatever is coming after the method.

        System.out.println("--------------------------------------------------");
        displayMessage();


    }

    public static void greetings(){// the method must be created outside the main method body, while inside the class and should have body by have {}

        System.out.println("Hello Cydeo!");
        System.out.println("How are you today?");


    }

}
