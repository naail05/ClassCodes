package day21_Multi_dimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {


        int[] array = {10,20,30,40,50,60,70,80};
        int element = 90;
        //creat a method that can include the new element into the array
        // where the expected result should be {1,2,3,4,5,6}

        //As once declared then the array size is fixed, so if you want to add an element you need to creat a new array which will have enough size to include all the elements of the previous array plus the new element

       // int[] new_array = new int [array.length+1];
       // System.out.println(new_array.length);
        int []new_array = Arrays.copyOf(array,array.length+1);
       // System.out.println(Arrays.toString(new_array));
        // this will include all the elements of the 1st array plus one(zero for now as we have not assigned any value yet)
        new_array[new_array.length-1]= element;
        System.out.println(Arrays.toString(new_array));
        //here we have assigned the value of the element to the last index and then printed the array

        System.out.println("---------------------------------------------");

        int[] numbers = { 100, 90, 80, 70, 60};
        System.out.println(Arrays.toString(numbers));
        // add 50 to this array at the end
        int num = 50;
// for this we will call the add method which we created in arrays utility class
        numbers = ArraysUtility.addElement(numbers,num);
        System.out.println(Arrays.toString(numbers));

        String[] students = {"Yasin"," Sumeye", "Ermek"};
        String newStudent = "Bashir";

        students = ArraysUtility.addElement(students,newStudent);
        System.out.println(Arrays.toString(students));


        // we can continue and add one more element and so on
        String newStudent2 = "Nazir";
        students = ArraysUtility.addElement(students,newStudent2);
        System.out.println(Arrays.toString(students));






    }
}
