package day14_forLoop_Overloading;

public class forLoopPractice {

    public static void main(String[] args) {

        //for (int i = 5; i <=10 ; i--) {// what happens if instead of increasing the value we decrease it after each cycle?? in this case our condition will never be false and the given statement will keep repeating. Even if we dont give iteration, it will never give us compile error, but there will be logical error, as the cycle of loop will continue repeating.
        for (int i = 10; i >=5 ; i--) {// in this case for our condition to be false eventually our iteration need to decrease after each cycle till we reached our planned number of times
          System.out.println("Hello software");}

            System.out.println("------------------print from A to Z-----------");
        for (char i = 'A'; i <= 'Z'; i++) {// this will print us alphabets from A to Z

           System.out.print(i+" ");}
        System.out.println();
        System.out.println("------------------print from Z to A-----------");
       // System.out.println("Hello software");}// this loop will print for us Alphabets from Z to A
        for (char i = 'Z'; i >= 'A'; i--) {

        System.out.print(i+" ");}// this will give us all the character on the same line with a space
        System.out.println();// this print statement will append a new line and our next task will start from new line, as in the previous task we used print not println statement


        //sum of all the numbers from 1~100
        int sum = 0;
        for (int i = 1; i <=100 ; i++){
            sum +=i;// means increase the value of sum by i which is going to be the coming number each time

        }
        System.out.println(sum);// we are passing it out of the loop as we want one number not reaping each tim, if we wanted to show each separate added number then we would place the print statement inside the loop


    }
}
