package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {

        int[] [] arr2D1 = {{1,2} , {3, 4, 5}};
        int[][] arr2D2 = {{6, 7, 8, 9},{10, 11},{12,13,14}};
        int[][] arr2D3 = {{15, 16, 17, 18}};
        //we have three 2-dimensional arrays, so if we want to store all of these into one container, then we need a three-dimensional array.

        int[][][] arr3D = {{{1,2} , {3, 4, 5}}, {{6, 7, 8, 9},{10, 11},{12,13,14}}, {{15, 16, 17, 18}}};
        //[index of 2d array][index of 1d array][index of elements]
        //the length of this 3-dimensional array is 3, as it includes 3 2-dimensional arrays
        System.out.println(arr3D.length);//length = 3

        System.out.println(Arrays.deepToString(arr3D));
        // we need to call deepToString when we want to print a 3-dimensional array
        System.out.println(Arrays.deepToString(arr3D[1]));
        //when we want to print any 2-dimensional array from the 3-dimensional array
        System.out.println(Arrays.toString(arr3D[1][2]));
        //to get any single dimensional array from the 3-dimensional array, here we need to call toString method

        System.out.println(arr3D[1][2][1]);
        //to get a single element from a single dimensional array

        // now to get each element of the arrays, then we need loop, here three loops

        System.out.println("------------------loops-------------------------");

        for (int i = 0; i < arr3D.length; i++) {// i: index of each 2-dimensional array
            int[][] each2dArray = arr3D[i];
            System.out.println(Arrays.deepToString(each2dArray));
            for (int j = 0; j < each2dArray.length; j++) {//index number of each 1dimensional array
                int[] each1dArray =each2dArray[j];
                System.out.println(Arrays.toString(each1dArray));
                for (int k = 0; k < each1dArray.length; k++) {//index of element
                    int eachElement =  each1dArray[k];
                    System.out.println(eachElement);

                }

            }




        }




    }


}
