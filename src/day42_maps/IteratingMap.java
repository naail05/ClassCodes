package day42_maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {


    Map<String, Integer> employee = new LinkedHashMap<>();
        employee.put("Daniel", 95000);
        employee.put("Emily", 100000);
        employee.put("Bella", 85000);
        employee.put("Ahmad", 95000);
        employee.put("Naz", 105000);
        employee.put("Jam", 100000);


        System.out.println("--------------Iterate map by key-------------------");
        //let we need to display all the keys in the map, so we need to iterate by the keys
        for (String eachKey : employee.keySet()) {//after we get key we can do many operations on it, by changing the related values of those keys
            System.out.println( eachKey);
         //   employee.replace(eachKey, employee.get(eachKey)* 2);// here we are doubling the value of each key

        }
        System.out.println("employee = " + employee);

        System.out.println("--------------Iterate map by value-------------------");

        for (Integer eachValue : employee.values()) {
            System.out.println(eachValue);//here we are iterating through values only
        }
 
        System.out.println("----------Iterate map by entry-(each pair)------------");
        //iterate the map by entries
        for (Map.Entry<String, Integer> eachEntry : employee.entrySet()) {

            System.out.println(eachEntry);
           // System.out.println(eachEntry.getKey()); get key from each entry
            //System.out.println(eachEntry.getValue()); get value from each entry
            
        }
        System.out.println("----------getKey/value from entry method------------");

        for (Map.Entry<String, Integer> eachEntry : employee.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();

            eachEntry.setValue(eachValue+10000);//here we setting new values/updating

            System.out.println(eachKey+" : "+eachValue);
        }

        System.out.println(employee);

} }
