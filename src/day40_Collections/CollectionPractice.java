package day40_Collections;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        System.out.println("--------------------List interface-------------------");
        //for the list interface of collection as List is the parent, it can be a reference for all the sub-types as Arraylist, Stack, LinkedList adn Vector

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new Stack<>();
        List<Integer> list3 = new LinkedList<>();
        List<Integer> list4 = new Vector<>();

        //or as they have "is a relationship with the collection, so they can be referenced by collection itself

        Collection<Integer> list11 = new ArrayList<>();
        Collection<Integer> list22 = new Stack<>();
        Collection<Integer> list33 = new LinkedList<>();
        Collection<Integer> list44 = new Vector<>();
        //but we need to use the reference, based on the need as it impacts the access to the methods and variables in the given object class (as here it will only have access to the methods in the collection interface

        list11.add(100);
        list11.addAll(Arrays.asList(120, 200, 100, 40, 300, 500));

        System.out.println(list11);
        //now with such reference the specific methods will not be accessible as get() method in this case, now if we need those specific methods then we have to do casting
        System.out.println(((List) list11).get(2));//will give us 200 in this case

        //now if we need to call a unique method from the stack class, we can do the same down-casting as:
        list22.addAll(Arrays.asList(120, 200, 100, 40, 300, 500));
        System.out.println(list22);
        ((Stack)list22).pop();//here we are down-casting the list22 from collection to Stack, so to have access to the specific method of pop();
        System.out.println(list22);
        ((Stack)list22).push(600);//this adds an element to the start
        System.out.println(list22);

        System.out.println("--------------------Set interface-------------------");

        //for the set interface of collection as Set is the parent, it can be a reference for all the sub-types as Hashset, Linked Hashset and TreeSet

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        //Or as they have "is a relationship with the collection, so they can be referenced by collection itself and we will have access to the collection methods

        Collection<Integer> set11 = new HashSet<>();
        Collection<Integer> set22 = new LinkedHashSet<>();
        Collection<Integer> set33 = new TreeSet<>();

        set11.addAll(Arrays.asList(120, 200, 100, 40, 300, 500,100));
        System.out.println(set11);//as set does not accept duplicates, so there will be only one value for the 100 from above and with random order

        set33.addAll(Arrays.asList(120, 200, 100, 40, 300, 500,100));//tree set also does not allow duplicates, but it orders the elements with ascending order
        System.out.println(set33);
        // if we want to access any given element at a given index we can not do casting as there is no ' is a relationship' between list and set if we try to do so it will lead to ClassCastingException, what we can do is to call the Arraylist constructor where Arraylist does take collection as argument and set is a collection type

        System.out.println((new ArrayList<>(set33).get(4)));
        //if we want to use the get method for multiple time then we can assign it to List reference variable
        List<Integer> l = new ArrayList<>(set33);



    }
}
