package day41_maps;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1,2,3,4,5,6,7))  ;

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(8,9,10,11,12,13,14));

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(15,16,17,18,19));
        //let us store the above objects into an array

        List<Integer>[] arrayOfLists = new List[3];
        arrayOfLists[0] = list1;
        arrayOfLists[1] = list2;
        arrayOfLists[2] = list3;
        System.out.println(Arrays.toString(arrayOfLists));
        //now what if we want to update any specific element in the array

        arrayOfLists[0].set(4,50);// first we will get the array element by using [] and as it is list so we can use set method, where we need to specify index number and the the latest value

        System.out.println("-------------------------------------");
        //array of sets, where data type is set, which means we can only store set objects into this array
       Set<Integer>[] arrayOfSets = new Set[5];
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();
        //arrayOfSets[0] = new ArrayList<>(); we can store this as it is array of set, so we can only store sets in this array

        //now to add elements

        arrayOfSets[2].addAll(Arrays.asList(1,2,3,4)); //[2] will give us the object at index 2, now that at index 2 we have set, which is collection, where we have addAll method so we cn add values at once

        System.out.println(Arrays.toString(arrayOfSets));







    }
}
