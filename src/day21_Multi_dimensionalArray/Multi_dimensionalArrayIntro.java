package day21_Multi_dimensionalArray;

import java.util.Arrays;

public class Multi_dimensionalArrayIntro {

    public static void main(String[] args) {


        int[] arr1 = {10,20,30};
        int[] arr2 = {40, 50, 60, 70, 80};
        int[] arr3 = {90, 100};
        int[] arr4 = {1000, 2000};
        // lets suppose we need all the elements of the above arrays, but dont want the elements to be mixed up with others and group needs not to be changed, so how to put them into one variable

        int[][] array2D = {{10,20,30}, {40, 50, 60, 70, 80},{90, 100}, arr4 };

        //we can store the array itself or the variable that contains the array, as arr4 in this case
        System.out.println(Arrays.deepToString(array2D));
        //for printing multi-dimensional array we need to use deepToString for printing instead of toString method

        System.out.println(array2D.length);
        //the length of the array is the number of single dimensional arrays stored in it, which will be three in the above case

       // now to access any given single dimensional array from a multi dimensional array, we need to provide the index number of the given array
        System.out.println(Arrays.toString(array2D[1]));//[40, 50, 60, 70, 80]
        System.out.println(Arrays.toString(array2D[2]));//[90, 100]
        // as it will return a single dimensional array, so we need to call toString method to print

        System.out.println(array2D[2][1]);// access an element of a given array, as its a string element so we would not need toString method
        //in the first [] we give the index number of the single dimensional array we want and in the second [] need to give the index number of the element we want to access




    }
}
