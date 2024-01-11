package day22_ArrayList;

import Utilities.ArraysUtility;

public class Test {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 80, 90};
        boolean has60 = ArraysUtility.contains(numbers,60);

        System.out.println(has60);

        System.out.println("-------------for String Array--------");
        String[] students = {"Maray", "Nazir", "Rashid"};
        boolean isStudent = ArraysUtility.contains(students,"Naail");
        System.out.println("isStudent = " + isStudent);

    }
}
