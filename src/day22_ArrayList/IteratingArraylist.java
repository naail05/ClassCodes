package day22_ArrayList;

import java.util.ArrayList;

public class IteratingArraylist {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);
        numbers.add(3,255);//adding 255 at index 3

        System.out.println(numbers);//[100, 200, 300, 255, 400, 500]

        System.out.println("-------iterating arraylist by using for loop------");
        for (int i = 0; i < numbers.size(); i++) {
          int each =  numbers.get(i);//this will get u element through each iteration

            System.out.println(each);

        }
        System.out.println("----iterating arraylist from last index by using for loop------");

        for (int i = numbers.size() - 1; i >= 0; i--) {
            int each = numbers.get(i);
            System.out.println(each);

        }
        System.out.println("---iterating arraylist by using for each loop-----");

        for (Integer each : numbers) {// as each element is int and in arraylist doesnt support primitives, so we use wrapper clas objects, though int in this case be used, but then one extra step will be done by performing the conversion called autoboxing
            System.out.println(each);

        }
    }
}
