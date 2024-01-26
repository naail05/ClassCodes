package day42_maps;

import day26_static.Car;
import day33_abstraction.employeeTask.Developer;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPractice4 {
    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();// we specified Key as String and value as object, which can be String, Character, Integer, LocateDate and so
        person1.put("Name", "Arthur");
        person1.put("Gender", 'M');
        person1.put("Age", 32);
        person1.put("Job_title", "SDET");
        person1.put("Salary", 100000);
        person1.put("Hiring-Date", LocalDate.of(2023,06,12));
        person1.put("Married", true);

        Map<String, Object> person2 = new LinkedHashMap<>();
        person2.put("Name", "Nora");
        person2.put("Gender", 'F');
        person2.put("Age", 31);
        person2.put("Job_title", "QA");
        person2.put("Salary", 95000);
        person2.put("Hiring-Date", LocalDate.of(2023,12,10));
        person2.put("Married", true);

        Map<String, Object> person3 = new LinkedHashMap<>();
        person3.put("Name", "James");
        person3.put("Gender", 'M');
        person3.put("Age", 35);
        person3.put("Job_title", "QA");
        person3.put("Salary", 105000);
        person3.put("Hiring-Date", LocalDate.of(2024,1,12));
        person3.put("Married", false);

        Map<String, Object> person4 = new LinkedHashMap<>();
        person4.put("Name", "Josh");
        person4.put("Gender", 'M');
        person4.put("Age", 28);
        person4.put("Job_title", "Developer");
        person4.put("Salary", 115000);
        person4.put("Hiring-Date", LocalDate.of(2022,8,25));
        person4.put("Married", false);

        //need to store above maps into a map, but for that they need to be in pairs, so we can have them as value, we need to create keys for them to be pair, where we can have integer as key which will work as index numbers

        Map<Integer, Map<String, Object>> mapOfMaps = new LinkedHashMap<>();//this is map of maps
        mapOfMaps.put(0, person1);//adding person1 at index 0
        mapOfMaps.put(1,person2);
        mapOfMaps.put(2, person3);
        mapOfMaps.put(3, person4);
        System.out.println(mapOfMaps);

        System.out.println("--------------------------------------------------");
        //now how to get the information of any given person(sub map)
        System.out.println(mapOfMaps.get(1));//this will give us the information of the second person

        System.out.println("--------------------------------------------------");
        //update any given value, for eg update the salary of second person to 120k

        mapOfMaps.get(1).replace("Salary", 120000);
        System.out.println(mapOfMaps.get(1));

        System.out.println("----------------iterating to it------------------");
        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            System.out.println(eachValue);//now that each value is a map so we will get each map
        }

        System.out.println("----------------iterating to it------------------");
        //lets say we want to increase salary of each by 10000
        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if (eachEntry.getKey().equals("Salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue()+10000);
                }

            }

        }

        System.out.println(mapOfMaps);

        System.out.println("-------------------------------------------------");
        //map with both key and value as maps

       // Map<Map<String, Integer>, Map<String, Integer>> mapMapMaps = new LinkedHashMap<>();
        //but this takes a lot of memory and will slow our codes

        System.out.println("-------------------------------------------------");
        Map< int[], List<Integer>> map2 = new LinkedHashMap<>();
        Map<Developer, Car> map3 = new LinkedHashMap<>();





    }

}
