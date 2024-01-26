package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice1 {

    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Sumet", "M");
        employeeMap.put("Folra", "F");
        employeeMap.put("Samenta", "F");
        employeeMap.put("David", "M");
        employeeMap.put("Chris", "M");
        employeeMap.put("Lucy", "F");
        employeeMap.put("Shona", "F");

        System.out.println("------------------------------------------------");
        //count the total number male and female employees
        int countMaleEmployees= 0;
        int countFemaleEmployees= 0;

        /**
        //using keySet() method, it will return the required solution, but is not the best solution
        for (String name : employeeMap.keySet()) {
            String gender = employeeMap.get(name);
            if(gender.equals("M")){
                countMaleEmployees++;
            }else{
                countFemaleEmployees++;
            }

        }
        System.out.println("countMaleEmployees: " + countMaleEmployees);
        System.out.println("countFemaleEmployees: " + countFemaleEmployees);
*/
        System.out.println("-------------------------------------------------");

        for (String eachValue : employeeMap.values()) {
            if (eachValue.equals("F")){
                countFemaleEmployees++;
            }else{
                countMaleEmployees++;
            }

        }
        System.out.println("countMaleEmployees: " + countMaleEmployees);
        System.out.println("countFemaleEmployees: " + countFemaleEmployees);

        System.out.println("----------display the names--keySet method------------");
        //display the names of all the female employees, using keySet method
        for (String eachKey : employeeMap.keySet()) {
            if (employeeMap.get(eachKey).equals("F")){
                System.out.println(eachKey);
            }
        }
        System.out.println("---------display the names--entrySet method-----------");
        //display the names of all the female employees, using entry method
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")){
                System.out.println(eachEntry.getKey());
            }

        }

        System.out.println("---------------update values---------------------");
        //update all the "M" values to male and "F" values to female
        //here we are using entrySet method as we have set values method there, where we can set/update values
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if (eachEntry.getValue().equals("F")){
                eachEntry.setValue("Female");
            }else{
                eachEntry.setValue("Male");
            }
        }
        System.out.println(employeeMap);
    }
}
