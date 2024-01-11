package day19_Arrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int total = input.nextInt();

        int[] number = new int[total];//whatever the inputs are, that will be the size of array
          int sum = 0;
        for (int i = 0; i < total; i++) {
            System.out.println("Enter a number: ");
            number[i] = input.nextInt();
            sum +=number[i];
        }
        double average = sum/(double)total;// now that both are integers, so our result will be an int not double, so to get exact double value, either of the values, sum or total, needs to be double
        DecimalFormat df = new DecimalFormat("0.00");// this will format the decimal points to whatever number we want

        System.out.println(Arrays.toString(number));
        System.out.println("sum = " + sum);
        System.out.println("average = " + df.format(average));

        DecimalFormat df1 = new DecimalFormat("0.00");// this will format the decimal points to whatever number we want
        double n1 = 10.587654;
        System.out.println(df1.format(n1));

        input.close();




    }


}
/*
AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number

 */