package day20_ArraysContinue_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Task2_MergeArrays {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,9};
        int [] arr2 = {5,6,7,8};
        // now how to merge them to a third Array? the third array should have enough capacity to hold both the elements of arr1 and arr2, so

        int [] arr3 = new int [(arr1.length)+(arr2.length)];
        // so the size of third array is size of arr1 plus size of arr2
      int k = 0;// this will work as index number of arr3
        for (int i = 0; i < arr1.length; i++,k++) {//i is for first arrays index number
            arr3[k]= arr1[i];// this loop adds the elements of arr1 to arr3
        }
        for (int j = 0; j < arr2.length; j++,k++) {// j is for the second arrays index number
            arr3[k]=arr2[j];// this loop adds the elements of arr2 to arr3
        }

        System.out.println(Arrays.toString(arr3));


        System.out.println("-----------------------------------------------");

        int [] a1 = {10, 20, 30 , 40 , 50 , 60};
        int [] a2 = {70, 80, 90};
        int [] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));

        System.out.println("---------------merge double---------------");
        //how if we have double arrays
        double [] b1 = {10.5, 5.5, 6.5, 8.5 };
        double [] b2 = {20.5, 15.5, 13.5};
        double [] b3 = ArraysUtility.merge(b1,b2);
        // now the previous method is not going to work as that is for int while this one is double, so will creat another method
        System.out.println(Arrays.toString(b3));

        System.out.println("---------------merge char-------------");
//how if we have char arrays, we need to creat char method and call it here

        char [] ch1 = {'A', 'b', 'c', 'D', 'e'};
        char [] ch2 = { 'X', 'Y', 'Z'};

        char [] ch3 = ArraysUtility.merge(ch1, ch2);

        System.out.println(Arrays.toString(ch3));


        System.out.println("---------------merge String-------------");
        //how if we have string arrays, we need to creat string method and call it here (from Array utility method)

        String [] str1 = {"Java is quite "};
        String [] str2 = {"an interesting programing language"};

        String [] str3 = ArraysUtility.merge(str1, str2);
        System.out.println(Arrays.toString(str3));



    }
}
/*
 write a program that can merge two arrays of integers
	        Ex:
	            arr1 = {1,2,3,4}
	            arr2 = {5,6}

	        output
	            arr3 = {1,2,3,4,5,6}
 */