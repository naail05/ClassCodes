package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class FrequencyOfChar_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();

        System.out.println("Enter the character for which you want to know the frequency: ");
        char ch = input.next().charAt(0);

        System.out.println(charFrequency(str,ch));
        input.close();

    }


    public static int charFrequency (String str, char ch){

        int count = 0;
        for (int i = 0; i <str.length() ; i++) {//index number of the string
            if(str.charAt(i)==ch){// if the character of the string is equal to the given character, it means the given character has appeared
                count++;
            }


        }return count;
        // this can be done both ways means through void method and through return method where for void we will give print statement and simply call it in the main method and for return we will return here and print it in the main method and give the return type which is int in this case instead of void
    }

}
