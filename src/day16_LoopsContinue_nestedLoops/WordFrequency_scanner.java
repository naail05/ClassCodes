package day16_LoopsContinue_nestedLoops;

import java.util.Scanner;

public class WordFrequency_scanner {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter you sentence: ");
        String sentence = input.nextLine();
        System.out.println("Enter the word you want to count:");
        String word1 =input.next();

        System.out.println(wordFrequency(sentence,word1));
        input.close();

    }

    public static int wordFrequency (String str,String word){

        int count = 0;

        while (str.contains(word)){
            count++;
            str= str.replaceFirst(word,"");// we do this so that each time the word is counted it is replaced with and empty space else the loop will continue infinitely

        }
        return count;

    }

}
