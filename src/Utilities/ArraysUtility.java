package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int [] merge (int[]arr1 ,int[]arr2){

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

        return arr3;}

    public static double [] merge (double[]arr1 ,double[]arr2){

        // now how to merge them to a third Array? the third array should have enough capacity to hold both the elements of arr1 and arr2, so

        double [] arr3 = new double [(arr1.length)+(arr2.length)];
        // so the size of third array is size of arr1 plus size of arr2
        int k = 0;// this will work as index number of arr3
        for (int i = 0; i < arr1.length; i++,k++) {//i is for first arrays index number
            arr3[k]= arr1[i];// this loop adds the elements of arr1 to arr3
        }
        for (int j = 0; j < arr2.length; j++,k++) {// j is for the second arrays index number
            arr3[k]=arr2[j];// this loop adds the elements of arr2 to arr3
        }

        return arr3;}

    public static char [] merge (char[]arr1 ,char[]arr2){

        // now how to merge them to a third Array? the third array should have enough capacity to hold both the elements of arr1 and arr2, so

        char [] arr3 = new char [(arr1.length)+(arr2.length)];
        // so the size of third array is size of arr1 plus size of arr2
        int k = 0;// this will work as index number of arr3
        for (int i = 0; i < arr1.length; i++,k++) {//i is for first arrays index number
            arr3[k]= arr1[i];// this loop adds the elements of arr1 to arr3
        }
        for (int j = 0; j < arr2.length; j++,k++) {// j is for the second arrays index number
            arr3[k]=arr2[j];// this loop adds the elements of arr2 to arr3
        }

        return arr3;}

    public static String [] merge (String[]arr1 ,String[]arr2){

        // now how to merge them to a third Array? the third array should have enough capacity to hold both the elements of arr1 and arr2, so

        String [] arr3 = new String [(arr1.length)+(arr2.length)];
        // so the size of third array is size of arr1 plus size of arr2
        int k = 0;// this will work as index number of arr3
        for (int i = 0; i < arr1.length; i++,k++) {//i is for first arrays index number
            arr3[k]= arr1[i];// this loop adds the elements of arr1 to arr3
        }
        for (int j = 0; j < arr2.length; j++,k++) {// j is for the second arrays index number
            arr3[k]=arr2[j];// this loop adds the elements of arr2 to arr3
        }

        return arr3;}

    public static int [] reverse (int [] ar1){
        int[] reverse = new int [ar1.length];

        for (int i = ar1.length - 1, k=0; i >= 0; i--, k++) {// k is index for second array
            reverse [k] = ar1[i];

        }
        return reverse;

    }

    public static String [] reverse (String [] ar1){
        String[] reverse = new String [ar1.length];

        for (int i = ar1.length - 1, k=0; i >= 0; i--, k++) {// k is index for second array
            reverse [k] = ar1[i];

        }
        return reverse;

    }
    public static char [] reverse (char [] ar1){
        char[] reverse = new char [ar1.length];

        for (int i = ar1.length - 1, k=0; i >= 0; i--, k++) {// k is index for second array
            reverse [k] = ar1[i];

        }
        return reverse;

    }

    public static double [] reverse (double [] ar1){
        double[] reverse = new double [ar1.length];

        for (int i = ar1.length - 1, k=0; i >= 0; i--, k++) {// k is index for second array
            reverse [k] = ar1[i];

        }
        return reverse;

    }

    public static int indexOf(int[] arr, int element){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                return i;
            }
        }

        return -1; // if this runs the element was not found int the array
    }


    public static int[] addTo (int[] arr, int newElement){
        // this method will add elements to an array by creating an array with one more size

        int [] newArr = new int[arr.length+1];//one size bigger than the old array
        //copy all the of the old elements into the new array
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1]=newElement;
        return newArr;
    }

    public static int[] addTo2 (int[] arr, int newElement){
        // this method will elements to an array by creating an array with one more size

        int [] newArr = Arrays.copyOf(arr,arr.length+1);//one size bigger than the old array
        //copy all the of the old elements into the new array


        newArr[newArr.length-1]=newElement;
        return newArr;
    }

    public static int[] subArray(int[] arr, int start, int end){
        //manipulate our indexes

        int [] subArr = new int [end-start];//just subtract one number

        for (int i = 0; i < subArr.length; i++) {//i will be the index for assigning into subArr
            subArr[i]= arr[start++];
        }

        return subArr;

         /*
     subArray({3, 4, 1, 5, 6, 5}, 2, 5) -> {1, 5, 6}
        {3, 4, 1, 5, 6, 5}
        start = 4
        [1, 5, 6]
     */
    }

    public static int[] subArray2(int[] arr, int start, int end){
        //manipulate our indexes

        int [] subArr = new int [end-start];//just subtract one number

        for (int i = 0, j=start; i < subArr.length; i++,j++) {//i will be the index for assigning into subArr
            subArr[i]= arr[j];}
        return subArr;
        }


        public static int[] addElement(int[] array, int element){
            int []new_array = Arrays.copyOf(array,array.length+1);
            // this will include all the elements of the 1st array plus one(zero for now as we have not assigned any value yet)
            new_array[new_array.length-1]= element;

            //here we have assigned the value of the element to the last index and then printed the array
            return new_array;

        }

    public static double[] addElement(double[] array, double element){
        double []new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]= element;
        return new_array;

    }
    public static char[] addElement(char[] array, char element){
        char []new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]= element;
        return new_array;

    }

    public static String[] addElement(String[] array, String element){
        String []new_array = Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]= element;
        return new_array;}

    public static boolean contains(int[] array, int element) {
        // Iterate through the array
        for (int each : array) {
            // Check if the current element is equal to the specified element
            if (each == element) {
                return true; // Element found, return true
            }
        }
        // Element not found in the array
        return false;}

    public static boolean contains(double[] array, double element) {
        // Iterate through the array
        for (double each : array) {
            // Check if the current element is equal to the specified element
            if (each == element) {
                return true; // Element found, return true
            }
        }
        // Element not found in the array
        return false;}

    public static boolean contains(char[] array, char element) {
        // Iterate through the array
        for (char each : array) {
            // Check if the current element is equal to the specified element
            if (each == element) {
                return true; // Element found, return true
            }
        }
        // Element not found in the array
        return false;}

    public static boolean contains(String[] array, String element) {
        // Iterate through the array
        for (String each : array) {
            // Check if the current element is equal to the specified element
            if (each.equals(element)) {
                return true; // Element found, return true
            }
        }
        // Element not found in the array
        return false;}

    //creat a method to remove an element, by using index number, at the end should return a new array, the name should be remove
/*
    public  static int[] remove(int[] array, int index){
      for (int each : array)


    }

    //creat a method that can remove duplicates
    public static int[] removeDup (int[] array){

        // Create a new array to store unique elements
        int[] uniqueArray = new int[array.length];


    }
*/
}




