package day07_IfStatements;

public class Task1_PosNegZero {
    public static void main(String[] args) {
      //usimg if --else if --else (multi branch if)

        //when we have more than two possiblities then we use multi branch if
        int number = 20;
        String result;

        if (number > 0) {result = "Potivite";}//starts with if-block
        else if (number < 0) {result = "Negativite";}//then includes else-if
        else {result = "Zero";}// and ends with else block

        System.out.println(result);
    }
}
//the advantage of using multi-branch if is if one first condition is true then there is no need to check rest of the coonditions, while in single if statements you have to check all the statement irrespective of the first one which was true.

/*
Create a class named PosNegZero.java
2. An integer variable named number is declared and given, Write a program can identify if the number is positive, negative or zero
Ex:
number = 20
output: Positive

 */