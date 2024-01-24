package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMethods {

    public static void main(String[] args) {
        Map<String, String> person = new TreeMap<>();//to keep data in sorted order
        System.out.println(person.size());//to get the size of map, which counts the number of pair in the map, not key and value, here size will be zero
        person.put("QA210", "Ahmad");//add values for key and value of the pair
        System.out.println(person.size());//as we added one pair, so size will be 1
        person.put("QA220", "Naail");
        person.put("A214", "Nora");
        person.put("A410", "Josh");
        System.out.println("person = " + person);
        System.out.println(person.size());//now size will be 4

        System.out.println(person.get("A214"));//this get method will give us the value for the key we provide

        person.put("A410", "James");//here we are assigning new value to the key A410, we can change or update the value, but we can not change the key, as it is final, it can be removed, but not change

        System.out.println("------------replace method-------------------");

        // we can also use replace method for updating value of any key
        person.replace("A214", "Rashid");
        System.out.println("person = " + person);//will have updated value for A410, which we changed via put method and updated value for "A214" which we updated via replace method

        System.out.println("------------remove method-------------------");
        person.remove("A410");// remove method asks for the key, once it matches the provided key then it removes that pair from the map
        System.out.println("person = " + person);//pair with "A410" key is removed

        System.out.println("---------contains key/value methods----------------");
        //these methods verify if the provided key/value is available in the map
        System.out.println(person.containsKey("A214"));//verifies if the key is available in the map
        System.out.println(person.containsValue("Rashid"));//verifies if the value is available in the map
        System.out.println(person.containsKey("A213"));

        System.out.println("person.isEmpty() = " + person.isEmpty());//it will return false as this map is not empty

        System.out.println("----------------equals method-------------------");
        //this method compares if the given maps are equal and returns true or false accordingly
        System.out.println("person.equals(person) = " + person.equals(person));//just for testing we are comparing person map with itself to see the result of equals method, it will return true in this case


    }
}
/*
pair: id-name
 */