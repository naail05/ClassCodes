package day38_exceptions_handling;

class CustomCheckedException extends Exception{
    //custom checked exception which is inheriting the Exception class

}
class CustomUncheckedException extends RuntimeException{
    //custom unchecked exception which is inheriting the  RuntimeException class
}
public class CustomExceptions {

    public static void main(String[] args) {
        try {// we used try catch block to handle the custom checked exception
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("-------------------------------------------");
        throw new CustomUncheckedException();


    }
}
