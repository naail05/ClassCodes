package day07_IfStatements;

public class ifStatement_withoutCurlyBraces {

    public static void main(String[] args) {

        int age =32;

        if(age>21) System.out.println("Eligible");
            //removed curly braces, but they are ok to be removed only if there is only one statement in the If-block, but if there are more than one statements in if or else block the we need to give curly braces

        else System.out.println("Not Eligible");


        System.out.println("---------------------------------------------------------------");

        int itemNumber = 1;
        
        if(itemNumber==1)
        {System.out.println("Eggs");
            System.out.println("Oranges");}
        else if (itemNumber==2)
        {System.out.println("Milk");
            System.out.println("Onion");}
        else
        {System.out.println("Apple");
            System.out.println("Cherry");}
        //In this case if we dont give curly braces then we will get compile error


        System.out.println("----------------------------------------------------------");

        /*

2. An integer variable named number is declared and given, Write a program that can print the name of the day that the number represents
Ex: Given:
number = 1
output: Monday
Hint: Assume that a number between 1 ~ 7 is given to the variable
 */



        int number  = 1;//1~7

        if (number == 1 ) System.out.println( "Monday");


        else if (number == 2 ) System.out.println("Tuesday");


        else if (number == 3 ) System.out.println("Wednesday");


        else if (number == 4 ) System.out.println("Thursday");


        else if (number == 5 ) System.out.println("Friday");


        else if (number == 6 ) System.out.println("Saturday");


        else System.out.println("Sunday");

        //if statement without curly braces, as there is one statement in its body, but it is not the best practice and the recommendation is that always give curly braces.



    }


}
