package day38_exceptions_handling;

public class ThrowsKeyword2 {

    public static void main(String[] args) {

        method1();
    }


    //we have two options to handle this check exception
    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }

    public static void pauseFor5Seconds2 (){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void method1(){
        System.out.println("Hello World");
        //pauseFor5Seconds();//still we will get the exception when it is called
        pauseFor5Seconds2();//here when we handled it via try-catch it will not give compile error again
        System.out.println("Hello Cydeo");
    }
}
