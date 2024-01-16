package day38_exceptions_handling.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException (String message){
        super(message);

        //here we have created a custom exception (giving a condition by throwing a custom exception that if the radius is 0 or minus then the system should not process it ) of the InvalidShapeException with a constructor where we can give a custom message
        //here we are g
    }
}
