package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

    //index of elements : 0  1  2   0    1   2   3   4    0   1     0     1
     int[][] array2D = {{10,20,30},{40, 50, 60, 70, 80},{90, 100},{1000, 2000} };
  //index of 1D Array :   0                1                2          3

        for (int i = 0; i < array2D.length; i++) {// i is the index number of 1D in array2D

            int[] each1D = array2D[i];

            System.out.println(Arrays.toString(each1D));
       // to iterate each single dimensional array from this 2-dimensional array

            //now to iterate the elements of each the array, so we will need an inner loop for this

            for (int j = 0; j < each1D.length; j++) {// j is the index number of elements in each 1D array of array2D

                int eachElement = each1D[j];
                System.out.println(eachElement);

            }

        }
        System.out.println("-----------Iteration through for each loop-------");


        for (int[] each1DArray : array2D) {

            System.out.println(Arrays.toString(each1DArray));
            //now to access each element, we need to use another for each loop

            for (int eachElement : each1DArray) {


                System.out.println(eachElement);
            }

        }

        System.out.println("-----------Iteration by using shortcuts-------");


        for (int i = array2D.length - 1; i >= 0; i--) {

         //i index of each single dimensional array
            for (int j = array2D[i].length - 1; j >= 0; j--) {

             //j index of each element
                System.out.println(array2D[i][j]);

            }

        }

        System.out.println("-----Iteration through for each loop---shortcut--");

        for (int[] each1D : array2D) {
            for (int eachElement : each1D) {
                System.out.println(eachElement);

            }

        }
    }
}
