package day23_ArrayListContinue;

import java.util.ArrayList;

public class Task1_uniqueElement {

    public static void main(String[] args) {
//find the first unique element

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//add method adds element to the arraylist
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);


        for (Integer element : list) {


            int frequency = 0;

            for (Integer each : list) {
                if (each == element) {
                    frequency++;
                }

            }
            if (frequency==1){
                System.out.println(element);
            break;// to exit the loop after the condition becomes true, as we need the first unique element


        }}


    }
}
/*

Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */