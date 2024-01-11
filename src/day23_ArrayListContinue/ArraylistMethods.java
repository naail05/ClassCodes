package day23_ArrayListContinue;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraylistMethods {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        array[0]=100;//updating the element at index zero
        System.out.println(Arrays.toString(array));
        System.out.println("---updating an element----set method----------");

        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("cooking oil");

        System.out.println(groceriesList);//[Eggs, paper Towels, Apples, cooking oil]
        groceriesList.set(2,"Oranges");// updating an element of arraylist
        System.out.println(groceriesList);//[Eggs, paper Towels, Oranges, cooking oil] after the updating

        System.out.println("---removing an element----remove method----------");
        //removing by the object
        groceriesList.remove("cooking oil");
        System.out.println(groceriesList);

        //removing by index
        groceriesList.remove(1);
        System.out.println(groceriesList);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);//add method adds element to the arraylist
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        numbers.remove(5);// removing by index
        System.out.println(numbers);

        boolean r = numbers.remove(Integer.valueOf(30));// we can assign this to a boolean as well as the result will be true if removed and false if not
        System.out.println(numbers);
        System.out.println(r);
        // here we will use Integer class and the value of and pass the value we want to remove

        System.out.println("---clearing all elements----clear method----------");
        numbers.clear();//clears all the elements and set the arraylist to zero
        System.out.println(numbers);

        System.out.println("----------indexOf and lastIndexOf--------------");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));//this checks from  start to end or  right to left  and returns the index of first appearance
        System.out.println(names.lastIndexOf("Vasyl"));

        System.out.println(names.lastIndexOf("Sumeye"));//this checks from last to start or left to right and returns the index of first appearance

        boolean hasBashir = names.contains("Bashir");//false as it doesnt contain
        boolean hasAli = names.contains("Ali");//true, as it contains

        System.out.println("hasBashir = " + hasBashir);
        System.out.println("hasAli = " + hasAli);


        System.out.println("---------------equals method-------------------");

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer>  list2 = list;
        // here list2 is also referencing to the same object, means only one object is created and referenced by both
        list.add(10);

        System.out.println(list);
        System.out.println(list2);//now that only one object is created and referenced by both of them so the result of both will be the same added element
        //now if we compare them using (==) it will return us true as its one object
        System.out.println(list==list2);//true

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);// we created another arraylist and added 10 here as well
        //now if we compare them using (==), it will return us false as they are different objects and allocated different heap memory

        System.out.println(list==list3);//false

        //so to compare the elements we need to use equals method as that will compare the elements

        System.out.println(list.equals(list3));//true
        //but when we compare the order of the element does matter, if they are same elements, but different order, this comparison will return us false

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(20);
        n2.add(10);
        n2.add(30);

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        //now that both have same elements, but different order, the result of comparing them will be false

        System.out.println(n1.equals(n2));// will return false
        // for that comparison, what we can do is, first sort them and them compare, then the return will be true

        System.out.println("---------------isEmpty method-------------------");
        //it checks if the arraylist has any element or not, it will return us true if there are no elements else will return us true
        System.out.println(n1.isEmpty());//return false

        //how if we clear n1?? then it will return true, as there will be no elements in n1 after clear.
        n1.clear();
        System.out.println(n1.isEmpty());//will return true










    }
}
