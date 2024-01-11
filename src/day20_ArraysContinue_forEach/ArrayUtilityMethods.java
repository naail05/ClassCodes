package day20_ArraysContinue_forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUtilityMethods {

    public static void main(String[] args) {
        int [] score = { 70, 100, 80, 90, 65};

        System.out.println("--------------toString method---------------");
        //to print this we need to call toString method from array utility class and this is an overloaded class where there are many toString methods. This toString method is used when you want to print an array

        System.out.println(Arrays.toString(score));

        //As toString method returns a string, so we can store the result into a string and can print it that way as well
        String result = Arrays.toString(score);

        System.out.println(result);


        System.out.println("----------------Equals method-----------------");
        //this method is used to compare one object with another with return true or false.
        int[] a1 = { 1,2,3,4,5};
        int[] a2 = {1, 2, 3,4,5};
        int[] a3 = { 1,3,4,5, 2};
        // bow that this method returns a boolean result so that result can be stored to a boolean variable
       boolean r1 =  Arrays.equals(a1,a2);
        // as long as  the elements and their order is same then will return you true
        System.out.println(r1);
        boolean r2 = Arrays.equals(a1,a3);
        System.out.println(r2);
        char[] ch1 = { 'A', 'B', 'C'};
        char[] ch2 = { 'A', 'B', 'C'};
        boolean r3 =Arrays.equals(ch1,ch2);
        System.out.println(r3);
        //in the above ch1 reference to an array object while elements in that array are char

        String[] s1 = {"A", "B", "C"};
        String[] s2 = {"A", "C", "B"};


        System.out.println(Arrays.equals(s1,s2));
        Arrays.sort(s2);// when we pass this it will return us the sorted array and when we compare after this th returned value will be true
        System.out.println(Arrays.equals(s1,s2));

        int[] nums = {100, 80, 90, 75, 88, 99, 0, 5, 4, 1000, 500};
        //sort method doesnt return anything, it just sort the array

        System.out.println(Arrays.toString(nums));// this will give us the result before sorting

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));// this will return us the array after sorting

        // now that when sorted then the first element (at index 0) will be minimum and the last element will be maximum

        System.out.println("Minimum number: " + nums[0]);
        System.out.println("Maximum number: "+ nums[nums.length-1]);



    }
}
