package day20_ArraysContinue_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Task3_Reverse {

    public static void main(String[] args) {

        int [] ar1 = {1,2,3,4,5};


        int[] reverse = new int [ar1.length];

        for (int i = ar1.length - 1, k=0; i >= 0; i--, k++) {// k is index for second array
           reverse [k] = ar1[i];

        }
        System.out.println(Arrays.toString(reverse));

        System.out.println("------------------reverse int-------------------");
        int [] ar2 = {1, 2, 3, 4, 5, 6, 7};
        int [] reverse2 = ArraysUtility.reverse(ar2);
        System.out.println(Arrays.toString(reverse2));

        System.out.println("----------------reverse String-------------------");

        String [] str = {"Java", "Python", "JavaScript", "C++"};
        String [] reverse22 = ArraysUtility.reverse(str);
        System.out.println(Arrays.toString(reverse22));


        System.out.println("----------------reverse char-------------------");

        char [] ch = {'a', 'b', 'c', 'd' };
        char[] reverse33 = ArraysUtility.reverse(ch);
        System.out.println(Arrays.toString(reverse33));



    }



}
/*

 Write a program that can reverse an array of integers and returns it as new array
	        ex:
	            array = {1,2,3,4,5};

	        output:
	            reversedArray = {5,4,3,2,1};
 */