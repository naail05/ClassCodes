package day38_exceptions_handling;

public class BreakTimeException extends RuntimeException{//when it becomes an exception, the class icon also changes
    //in order for our throw keyword to have exception message printed, we need to call  parent constructor


    public BreakTimeException() {//default constructor calling parent constructor
        super("It is break time ");

    }

    public BreakTimeException(String message) {
        super(message);
    }
}
