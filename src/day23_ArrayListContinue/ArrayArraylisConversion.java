package day23_ArrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArraylisConversion {
    public static void main(String[] args) {

        String[] arr = {"A", "B", "C", "D"};
        //want to convert this array to arraylist

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println(list);

        System.out.println("---------------converting Arraylist to array------------------");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python", "C#"));
        //need to convert it to Array
        //need to call the toArray method for conversion
        String[] languages = list2.toArray(new String [0]);// for the size you need to give zero or smaller number than the elements in the arraylist and the toArray method will creat a new array and update the size to contain all the elements of arraylist OR can give the size of the array list (list.size()) instead of zero
        System.out.println(Arrays.toString(languages));

        System.out.println("--------converting Arraylist to array-(with Integer type)---------------");

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
// the data type should be same as that of arraylist, Integer in this case and should not consider primitives, else will get compile error
        Integer[] num1 = nums.toArray(new Integer[nums.size()]);
        System.out.println(Arrays.toString(num1));



    }


}
