package day42_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapPractice5 {

    public static void main(String[] args) {
        Map<String, String> person = new TreeMap<>();
        person.put("QA210", "Ahmad");//add values for key and value of the pair
        person.put("QA220", "Naail");
        person.put("A214", "Nora");
        person.put("A410", "Josh");
        person.put("B410", "Sam");

        //using lambda expression for iteration through map
        person.forEach((k,v ) -> {
            System.out.println(k +" : "+ v);});// here k is for all the keys and v is for all the values

    }
}
