package day23_ArrayListContinue;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        System.out.println("--------addAll method-------------------");


        ArrayList<Integer> numbers =new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        // if we want to add all the elements of arraylist numbers to this arraylist, then we can use addAll method
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(1,numbers);
        System.out.println(numbers);
        System.out.println(list1);

        //it can also be done through specifying the index that at what index you want to add

        // this always asks about collection type

        System.out.println("-----------------------------------------");
        ArrayList<Integer> scores = new ArrayList<>();
        //scores.addAll(75, 85, 95,80,70) in this case we will get compile error as this will be taken as array of elements not collection, ir order to overcome this problem there is an additional method we need to use
        scores.addAll(Arrays.asList(75,85,95,70,80));// we can use asList method for any collection type where this method return collection type where we can add multiple elements at once (when we are using add all method)

        System.out.println(scores);

        System.out.println("------------------addAll with String method--------------------");
        // we have an arraylist student, where we want to add names of the students

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println("students = " + students);

        // other forms of addAll method where you can add elements at a specified index number

        students.addAll(2, Arrays.asList("Shukur", "Sumeye", "Tatiana"));

        //here we added elements to index 2 and the original elements will shift to the right
        System.out.println("students = " + students);

        System.out.println("-------------asList for converting Array to Arraylist------------------");
        // with asList method ywe can convert Array to Arraylist as it returns a list, but we have to make sure that the array is non-primitive as Arraylist(collection) does not support primitive type
        Integer[] nums = {1,2,3,4,5,6,7,8};// now that its non-primitive/wrapper class object, so this can be converted to Arraylist, if it was primitive(as int) then i wouldnt and would give compile error
        ArrayList<Integer>l1 = new ArrayList<>();
        //ArrayList<Integer>l1 = new ArrayList<>(Arrays.asList(nums)); adding can be done this way or as below, both work well, but in both ways we have to make sure that array is non-primitive. This constructor will implicitly use addAll method
        l1.addAll(Arrays.asList(nums));
        System.out.println(l1);

        System.out.println("------------containsAll() method------------------");
        // it confirms if all the elements specified are in the arraylist
        ArrayList<String> employeesList = new ArrayList<>();
        employeesList.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));
        System.out.println("employeesList = " + employeesList);

        //verify if the Arraylist has Abidullah
        boolean hasAbidullah = employeesList.contains("Abidullah");
        System.out.println("hasAbidullah = " + hasAbidullah);
        // now how if we want to verify many elements that this list contains then we use containsAll

        boolean hasAbidullahHasanGadir = employeesList.containsAll(Arrays.asList("Gadir", "Hasan", "Abidullah"));
        System.out.println("has Abidullah, Hasan, Gadir:  = " + hasAbidullahHasanGadir);

        boolean hasAbidullahNaailJamshid = employeesList.containsAll(Arrays.asList("Gadir", "Naail", "Jamshid"));// result will be false
        System.out.println("hasAbidullahNaailJamshid = " + hasAbidullahNaailJamshid);

        System.out.println("------------removesAll() method------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 10, 10, 10));//need to pass as collection type, which can be done by using asList method
        //remove all the elements of 10s  and 20 from the above list
        list.removeAll(Arrays.asList(10,20));//this will remove all the 10s and 20s
        System.out.println(list);// if we were to use remove method that would just remove only one 10 and 20 element from list not all 10s and 20s

        System.out.println("------------retainAll() method------------------");
        // removes all the elements which are bot matching with which we provided in the argument of asList method. Its opposite of the removeAll method where it removes all the matching elements
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal", "Naail", "Jamshid", "Nazir", "Maryam"));
        //as long as we know which elements to keep we can use retainAll method

       developers.retainAll(Arrays.asList("Nazir", "Maryam", "Naail"));// we want to keep only "Nazir", "Maryam" and "Naail" in the developer list

      System.out.println("developers = " + developers);
        // so tasks like these can be done both ways, by removeAll(where removes the matching elements) and retainAll method(which removes all the non-matching elements)
       // developers.removeAll(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal", "Jamshid"));
        //System.out.println("developers = " + developers);













    }
}
