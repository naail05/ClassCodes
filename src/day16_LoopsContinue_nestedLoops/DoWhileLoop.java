package day16_LoopsContinue_nestedLoops;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        for (; condition ; ) {// as long as the condition is false it will not be executed

            System.out.println("Hello Cydeo -----for loop");}

        System.out.println("-----------------------------------------");

        while (condition){//as long as the condition is false it will not be executed
            System.out.println("Hello Cydeo-------while loop");
        }

        System.out.println("-----------------------------------------");

        do {// the difference is that even the condition is false the statement will be executed at least once
            System.out.println("Hello Cydeo-------Do while loop");
        }while (condition);// the use case for do while loop is quite rare as compared with for and while loops
    }
}
