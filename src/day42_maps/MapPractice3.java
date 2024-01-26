package day42_maps;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

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

        //store the above map objects into array

        Map<String, Object>[] arrayOfMap = new Map[4];//now this is array of maps which will include 4 maps objects, which are not assigned till now which will have index 0~3

        System.out.println(Arrays.toString(arrayOfMap));//by default we will have null
        //now how to assign first map to the index zero
        arrayOfMap[0] = person1;
        arrayOfMap[1] =person2;//assign second map to the index 1
        arrayOfMap[2] = person2;//assign third map to the index 2
        arrayOfMap[3] =person3;//assign fourth map to the index 3
        System.out.println(Arrays.toString(arrayOfMap));

        System.out.println("-------------------------------------------------");

        //update the information of second employee, increase salary by 10000
        arrayOfMap[1].replace("Salary",((Integer) arrayOfMap[1].get("Salary"))+10000);// as get returns object, not Integer, so we need to do casting
        System.out.println(arrayOfMap[1].get("Salary"));

        System.out.println("-------------------------------------------------");
        //change name of the first person

        arrayOfMap[0].replace("Name", "Nazir");
        System.out.println(arrayOfMap[0]);

        System.out.println("---------------Iterate through Array------------------");
        //list of employees making less than 100K

        for (Map<String, Object> eachMap : arrayOfMap) {
            if ((Integer) eachMap.get("Salary")< 105000)
            System.out.println(eachMap.get("Name"));

        }

        System.out.println("---------------Iterate through Array------------------");
        int count = 0;
        for (Map<String, Object> eachMap : arrayOfMap){
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
               if( eachEntry.getKey().equals("Salary")){
                   if ((Integer) eachEntry.getValue()<120000){
                       count++;

                   }
               }

            }
        }
        System.out.println(count);


    }
}
