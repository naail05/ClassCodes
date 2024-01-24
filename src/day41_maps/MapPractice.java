package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {

    public static void main(String[] args) {
     // want to create map to store the information of given person"Arthur"
        Map<String, Object> person1 = new LinkedHashMap<>();
        person1.put("Name", "Arthur");// we specified Key as String and value as object, which can be String, Character, Integer
        person1.put("Gender", 'M');
        person1.put("Age", 32);//even though value is primitive it is autoboxed to wrapper class object
        person1.put("Job_title", "SDET");
        person1.put("Salary", 100000.5);//double is changed to Double wrapper class
        person1.put("Married", true);
        //here key serves as index for the values, as they are unique for each value

        System.out.println("person1 = " + person1);

        System.out.println(person1.get("Name"));//get name via name key
        System.out.println(person1.get("Salary"));//get salary via salary key
        System.out.println(person1.get("Job_title"));
        //System.out.println(person1.get(0)); no index numbers in maps, so if we want to access any value we can get it via its related key


    }
}
