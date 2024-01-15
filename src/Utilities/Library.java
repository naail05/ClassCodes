package Utilities;

public class Library {
   //create a method that can pause the execution for few seconds (sleep method)

    public static void sleep(double seconds){
        try {
            Thread.sleep((long)seconds * 1000);//here we did casting as sleep method only takes long as argument
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /*
    public static void sleep2(double seconds) throws InterruptedException{

            Thread.sleep((long)seconds * 1000);//here we did casting as sleep
    }
    */
}
