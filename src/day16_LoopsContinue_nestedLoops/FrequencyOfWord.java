package day16_LoopsContinue_nestedLoops;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String sentence = "Java java JaVa JavA JaVA";// these two are for ignoring the case sensitivity
        String word = "Java";


        sentence = sentence.toLowerCase();
        word =word.toLowerCase();
        int count = 0;

        while (sentence.contains(word)){
            count++;


            sentence= sentence.replaceFirst(word,"");// we do this so that each time the word is counted it is replaced with and empty space else the loop will continue infinitely

        }

        System.out.println(count);
    }


}
/*

Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
 */