package day24_DateAndTime;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        System.out.println("----------------ReplaceAll method---------------------");
        //replaces all the (given) elements with new elements in an arraylist

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java", "Java","C#", "C#", "Ruby", "Swift", "Swift" ,"Java"));
        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) { we use this method in the absence of replace all method
            if(names.get(i).equals("Java")){
                names.set(i,"Python");  }
        }
        System.out.println(names);
        */


        //replace all the "Java" elements with "Python"
        Collections.replaceAll(names,"Java", "Python");
        System.out.println(names);


        System.out.println("-------------Frequency method--Integer-------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,50,50,60,60,50,50,50));
        // find the frequency of 50 in the above arraylist

        int frequency = Collections.frequency(list,50);

        System.out.println("frequency = " + frequency);

        System.out.println("-------------Frequency method--Integer-------------");



        System.out.println("------------Frequency method--String --------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java", "Java","C#", "C#", "Ruby", "Swift", "Swift" ,"Java"));
        int JavaFrequency = Collections.frequency(words,"Java");
        System.out.println("JavaFrequency = " + JavaFrequency);

        System.out.println("--------Frequency method--unique Element-----------");

        //find unique number
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(40,10,20,20,30,30,40,50,50,50,50,50,60,60,50,50,50));

        /*
        solution 1
         int unique =numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            int frequency1 =Collections.frequency(numbers,numbers.get(i));

            if (frequency1==1){
                unique=numbers.get(i);
            }
        }
        System.out.println(unique);

*/


        //solution 2
        for (Integer each : numbers) {
            if (Collections.frequency(numbers,each)==1){
                System.out.println(each);
            }
        }


    }


}
