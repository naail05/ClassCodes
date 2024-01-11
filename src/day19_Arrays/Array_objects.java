package day19_Arrays;

import java.util.Arrays;

public class Array_objects {

    public static void main(String[] args) {
        int [] arr1 = { 1, 2, 3,4 ,5};
        int [] arr2=arr1;
        int[] arr3 = arr2;
        //here one object is referenced by three array variables
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        // whatever array we print get the same data

        System.out.println("------------------------------------------");
        //how about different objects, can they be referenced by one reference variable?
        String [] a1 = {"Imran", "Mehmet"};
        a1 = new String []{"James", "Danial"};

        System.out.println(Arrays.toString(a1));
        //in Java one reference variable can not reference more than one object at a time, so the first array object will be eligible for garbage collection.

    }
}
