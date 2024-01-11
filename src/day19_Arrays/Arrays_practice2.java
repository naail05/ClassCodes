package day19_Arrays;

import java.util.Arrays;

public class Arrays_practice2 {

    public static void main(String[] args) {

        int[] Numbers = new int[100];

        for (int i =0; i < Numbers.length; i++) {

                Numbers[i]=i+1;//to start from 1 upto 100, as i is the index number and that starts from 0 so if we want the element to start from 1 would be to add 1 to the given index
            
        }
        System.out.println("Numbers) = " + Arrays.toString(Numbers));

        System.out.println("------------method two------------------");
        
        int [] arr1 = new int[100];
        for (int i = 0, j=1; i < arr1.length; i++, j++) {
            arr1[i]= j;// here i is the index number and j is the element which we want to assign to each index.
            
        }
        System.out.println("arr1 = " +Arrays.toString(arr1));
        
        
        
        System.out.println("-----------------reverse numbers------------------");

        int [] arr2 = new int[100];// index : 0~99
        for (int i = arr2.length - 1; i >= 0; i--) {
            arr2[i] =100-i;
        }


        System.out.println("arr2 = " + Arrays.toString(arr2));

        System.out.println("------------method two------------------");

        for (int i = 0, j =100; i < arr2.length; i++, j--) {// i is index and j is the value we assign, so it means for index zero we assign 100
            arr2[i] =j;
            

        }
        System.out.println("arr2 = " + Arrays.toString(arr2));
        
       


    }
}
