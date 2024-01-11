package day16_LoopsContinue_nestedLoops;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "ccaabbccbcccc";
        char ch = 'c';
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {//index number of the string
           if(str.charAt(i)==ch){// if the character of the string is equal to the given character, it means the given character has appeared
               count++;
           }


        }System.out.println(count);


    }


}
/*

write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
 */