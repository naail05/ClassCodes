package day23_ArrayListContinue;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {


    ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        ArrayList<String> nonDup =new ArrayList<>();// for this we need a new array list which will contain non-duplicate elements

        for (String each : names) {
           if(!nonDup.contains(each)) {nonDup.add(each);}

        }
        names = nonDup;// we made the original array un-referenced and assigned it to the new arraylist with no duplicated elements
        System.out.println(names);

}}
