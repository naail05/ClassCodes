package day15_whil_LoopsContinue;

import java.util.Scanner;

public class EligibleToVot_whileLoop {

    public static void main(String[] args) {
        // write a program to determine if the person is eligible to vote. must be over 21 and US citizen

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();//valid age between 1~120, if invalid ask user to re-enter

        while (! (age>=1 && age<=120)){
            System.err.println("Invalid age entry! re-enter your age: ");// wile loop will continue until the condition become false and a valid age is entered
            age = input.nextInt();}

        System.out.println("Are you a US citizen? Yes/No");
        String YesOrNo = input.next().toLowerCase();//we added to lower case to ignore case sensitivity
        // if answer is other than yes or no then user should be asked again

        while (!(YesOrNo.equals("yes") || YesOrNo.equals("no"))){//while the answer is neither yes nor no
            System.err.println("Invalid Entry! Please re-enter");
            System.out.println("Are you a US citizen? Yes/No");
            YesOrNo = input.next().toLowerCase();}

        if(age>=21 && YesOrNo.equals("yes")){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");}


    }
}
