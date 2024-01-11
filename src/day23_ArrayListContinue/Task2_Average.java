package day23_ArrayListContinue;

import java.util.ArrayList;

public class Task2_Average {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

      list.add(20);//add method adds element to the arraylist
      list.add(30);
      list.add(40);
      list.add(50);
      list.add(60);
      list.add(70);


        double average = 0.0;
        int sum = 0;
        for (Integer each : list) {
            sum +=each;

        }
        average= (double)sum/(list.size());

        System.out.println("average = " + average);

    }
}
