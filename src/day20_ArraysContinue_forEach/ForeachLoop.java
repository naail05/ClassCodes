package day20_ArraysContinue_forEach;

import java.util.Arrays;

public class ForeachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i =0; i<numbers.length;i++){// using for loop first
           // i here is the index number of the for loop

            System.out.println(numbers[i]);

            //to access each element of the numbers array, but while using for loop we have to give attention to initialization that to start from 1st element and condition that it should iterate till last index and the iteration ( that how many times the loop need to be executed
        }

        System.out.println("----------------for each loop----------------");

        for (int each:numbers){
//            if(each==40) {continue;}// if we want to use continue
            System.out.println(each);}

        System.out.println("---------merging two Arrays for each loop---------");

        int[] a1 = {10, 20, 30, 40, 50};
        int[] a2 = {60, 70, 80, 90, 100, 110, 120};


        int[] a3 = new int [a1.length+ a2.length];// the length of new array which is equal to the length of both the arrays which need to be merged as the length should be enough to include both the arrays

        int k = 0; //for the index number of the third array
        for (int each : a1) {
            a3 [k++]=each;//k++ to increase with each iteration
        }

        for (int each : a2) {
            a3[k++] =each;
        }
        System.out.println(Arrays.toString(a3));
        System.out.println();

        System.out.println("-----------print initial using for each loop------");

        String[] names = {"Bashir Naail", "Nazir Naail", "Rashid Naail", "Maryam Naail"};
        for (String each : names){
            System.out.println(each.charAt(0) +"."+ each.charAt(each.lastIndexOf(" ")+1) );
        }
    }
}
