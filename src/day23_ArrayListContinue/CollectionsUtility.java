package day23_ArrayListContinue;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        System.out.println("---------------min and max-------------------------");
// find min and max from the below arraylist
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7,8));
        int max = Collections.max(list);// to import the collections class, need to type Collections.(the method you want to use as max in this case and then the collections to which you want to apply

        int min = Collections.min(list);// as they will return Integer , so we can assign them to int

        System.out.println("max = " + max);

        System.out.println("min = " + min);

        System.out.println("---------------sort method-------------------------");

        ArrayList<String> items =new ArrayList<>(Arrays.asList("Eggs", "Potato", "Milk", "Tomato", "Rice", "Orange", "Strawberry", "BlueBerry", "Paper towels"));
        //need to sor the above arraylist
        Collections.sort(items);// this just sort and returns nothing
        System.out.println("items = " + items);

        System.out.println("---------------reverse method----------------------");

        Collections.reverse(items);// this will sort in descending order
        System.out.println("items = " + items);// as here we reversed the earlier order

        System.out.println("---------------swap method-------------------------");
        //swaps any element you want

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal", "Naail", "Jamshid", "Nazir", "Maryam"));
        System.out.println("developers = " + developers);
        //we can swap the positions of any to elements

        Collections.swap(developers,0,developers.size()-1);//need to specify the list where we want swaping the index at which we want to swap, as here index zero with last index
        System.out.println("developers = " + developers);




    }
}
