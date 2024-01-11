package day19_Arrays;

import java.util.Arrays;

public class alphabets {
    public static void main(String[] args) {
//       //  Create a char array and store all the alphabet letters in ascending order
//        char[] ascending = new char[26];
//        for (char i = 0,j= 'A'; i < ascending.length; i++,j++) {
//            ascending[i]=(char)j;
//
//
//
//        }  System.out.println(Arrays.toString(ascending));
//
//
//        //Create a char array and store all the alphabet letters in descending order
//
//        char[] descending = new char[26];
//        for (char i = 0,j= 'Z'; i < descending.length; i++,j--) {
//            descending[i]=(char)j;
//
//
//
//        }  System.out.println(Arrays.toString(descending));

        // we can solve as follow as well, as they both have the same index number

        char[] ascending = new char[26];
        char[] descending = new char[26];
      for (char i = 0,j= 'A', k='Z'; i < ascending.length; i++,j++,k--) {
           ascending[i]=(char)j;
          descending[i]=(char)k;}
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("--------------------------------------------");
        //create a char array that contains all the characters

//        char[] characters = new char [65535];
//        //now how to get all those characters and store them to this array
//        for (int i = 0; i < characters.length; i++) {
//            characters[i] = (char) i;
//
//        }
//        System.out.println(Arrays.toString(characters));

    }



}
