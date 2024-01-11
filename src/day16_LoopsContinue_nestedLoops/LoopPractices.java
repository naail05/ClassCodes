package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class LoopPractices {

    public static void main(String[] args) {



        System.out.println("-------------------for loop------------");

        for (int i = 0; i < 5; i++) {// condition depends upon the initialization value
            //For loop: three things need to be given 1)initialization 2)condition 3) iteration (the cycle for repetition, which increases/decreases after each cycle based on the condition
            // for loop is good when the number of iteration are known. variable i which is used in the initialization of for loop can only be used inside the for loop block and is known as the local variable
            System.out.println("Hello future "+ i);
        }

            System.out.println("-------------------while loop------------");
            // while can also be used instead of for loop, here what you need to do is the initialization variable should be declared before the loop and then that declared variable can be used as the condition in the while loop.Also for iterator which ever statement you want to print or execute then you can specify the iterator after that statement

            int j = 1;
            while(j<6){
                System.out.println("Hello "+ j);
                j++;// the iteration, now this while loop does the same job as for loop
                //But while loop will be the best when the repetition depends upon the condition only not the initialization and iteration then while loop is the best.
            }


        System.out.println("------------------do while loop-----------------");

        int k = 1;
        do {
            System.out.println("Hello world "+ k);
           k++;
        } while (k<6);
        //now this do-while loop will be executed the same as for and while loop, but this is not the best practice as when the number of iterations are known then its better to use for loop


        System.out.println("-----------------------------------------");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score ");
        int score = input.nextInt();

        while (score>100 || score<0){//while the score is invalid we will be repeated asking the user to re-enter the score
            // for such senerious where number of entry is unknown then while is the best.
            System.out.println("Invalid score, please re-enter your score ");
        score = input.nextInt();}

        if(score>=60) {
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }
}
