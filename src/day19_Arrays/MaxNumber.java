package day19_Arrays;

public class MaxNumber {
    public static void main(String[] args) {

        int [] numbers = { 100, 20, 10, 40, -10, 300};
        
        int max = numbers[0];//first element of the array which is at index zero

        for (int i = 1; i < numbers.length; i++) {// we started from 1, to compare from second number onward
            if (numbers[i] > max){// compares the elements of the array with current maximum number
                max = numbers[i];}
            
        }
        System.out.println("max = " + max);
        
        


    }

}
