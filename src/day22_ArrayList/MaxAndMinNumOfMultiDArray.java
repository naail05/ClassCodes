package day22_ArrayList;

public class MaxAndMinNumOfMultiDArray {

    public static void main(String[] args) {

        int[][] array = { {100, 20, 3000}, {10, 1000, 5000}, {-200, 400, 0} };
        // length is equal to number of single dimensional arrays

        int max = array[0][0];//to get the first element of the first array
        int min = array[0][0];


        for (int[] each1DArray : array) {
            for (int eachElement : each1DArray) {//to access each element
                if(eachElement>max){
                max =eachElement;}
                if (eachElement<min){
                    min = eachElement;
                }

            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }
}
/*

Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
		Ex:
			array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

			output:
				Minimum number is: -200
				Maximum number is: 1000
 */