package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class Single_vs_TwoDimensionalArray {

    public static void main(String[] args) {

        int[] arr1D = new int[10];//this must contain 10 elements
        System.out.println(Arrays.toString(arr1D));
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9,10};
        int[] arr4 = {11,12,13,14,15};
        int[] arr5 = {16,17,18,19,20,21};


        int [][] arr2D = new int[5][];//here you need to give the number of one dimensional array that you want to store which will be in the first []
        arr2D[0] = arr1;//assigning arr1 to index zero of arr2D
        arr2D[1] = arr2;
        arr2D[2] = arr3;
        arr2D[3] = arr4;
        arr2D[4] = arr5;
        System.out.println(Arrays.deepToString(arr2D));


    }
}
