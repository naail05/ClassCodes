package day19_Arrays;

import java.util.Arrays;

public class ArraysLiterals {

    public static void main(String[] args) {

        int [] numbers = new int [5];// here we only knw the number of elements while we dont know what those elements will be

        // when we know the number and what they are then we use array literals

        int[] nums = {2,4,6,8,10};//here the number and elements themselves are known or the element specify the total number.

        System.out.println(numbers.length);//shows the size of array
        System.out.println(nums.length);

        // now printing their elements

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println("-----Days of week--using arrays literal-----------");
        // printing days of the week b using arrays literal

        String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};// as we know both the number and elements we use arrays literal
        int n = 1;
        System.out.println(days[n-1]);// we did minus one as elements start from one while index from zero, so if we want to get element one which is at index zero it will be 1-1=0 which will be at index zero

        System.out.println("-----months--using arrays literal-----------");

        String[] month ={"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println(Arrays.toString(month));

        // but sometimes the number of elements are to many then it would be prefered to instantiate array throw new keyword as array containing numbers from 1 to 100

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);

        }




    }

}
