package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        //anagram words made of same letters as earth and heart
       String str1 = "heart";
        String str2 = "earth";
        // we can sort the strings in ascending order and then if both strings are equal then we can say both are anagram, but there is no sort method in the string, so we need to creat array form the string then sort, here we can use toChar or split method
       //String[] a1 = str1.split("");//will return string array
        //System.out.println(Arrays.toString(a1));
        //or can use char method where we will get char array

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        //now need to sort them by calling sort method form array utility

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println(isAnagram);// if this return true means they are anagram


    }
}
/*
 Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false


        listen  silent
 */