package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {

        Map<String, String> person = new TreeMap<>();
        person.put("QA210", "Ahmad");//add values for key and value of the pair
        person.put("QA220", "Naail");
        person.put("A214", "Nora");
        person.put("A410", "Josh");

        Map<String, String > employees = new TreeMap<>();// here we want to add all the above pairs from person map to the employee map
        employees.putAll(person);

        System.out.println("employees = " + employees);

        //compare above two maps using equals operator
        System.out.println("(employees==person) = " + (employees == person));//this will return us false as they are different objects stored in different memory locations, for comparing them we need to use equals method

        //compare above two maps using equals method
        System.out.println("employees.equals(person) = " + employees.equals(person));
    }
}
