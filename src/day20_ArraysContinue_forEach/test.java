package day20_ArraysContinue_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] nums = {3,4,1,5,6,5};
        System.out.println(ArraysUtility.indexOf(nums,5));

        System.out.println("-----------------------------------------");

        int[] num2 = ArraysUtility.addTo(nums,10);
        System.out.println(Arrays.toString(num2));

        int[]num3 = ArraysUtility.addTo2(nums,20);

        System.out.println(Arrays.toString(num3));

        String str = "3483";
       int result = Integer.parseInt(str);
        System.out.println(result+21);
    }

    }

