package day37_execeptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);
        }catch (RuntimeException e){
            System.out.println("Runtime exception is caught");
            e.printStackTrace();
        }finally {//this block will always be executed whether the exception is handled or not, but it is totally optional, but if we want to forcefully stop the th later execution by giving System.exit(1);
            System.out.println("Finally block");
        }

    }
}
