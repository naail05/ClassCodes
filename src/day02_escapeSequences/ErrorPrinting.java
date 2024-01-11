package day02_escapeSequences;

public class ErrorPrinting {
    public static void main(String[] args) {

        System.out.println("Hello World");
      /* If we want to print any code as error msg then we use another print statement
      which is:
      system.error.println("") the printed code will come in red in console or as error msg
       */

        System.err.println("Hello World"); // the short-cut for this is type serr+Enter
    }
}
