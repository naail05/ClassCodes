package day42_maps;

import java.time.LocalDate;
import java.util.*;

public class MapPractice2 {

    public static void main(String[] args) {

        Map<String, Object> person1 = new LinkedHashMap<>();// we specified Key as String and value as object, which can be String, Character, Integer, LocateDate and so
        person1.put("Name", "Arthur");
        person1.put("Gender", 'M');
        person1.put("Age", 32);
        person1.put("Job_title", "SDET");
        person1.put("Salary", 100000.5);
        person1.put("Hiring-Date", LocalDate.of(2023,06,12));
        person1.put("Married", true);

        System.out.println("person1 = " + person1);

        Map<String, Object> person2 = new LinkedHashMap<>();// we specified Key as String and value as object, which can be String, Character, Integer, LocateDate and so
        person2.put("Name", "Nora");
        person2.put("Gender", 'F');
        person2.put("Age", 31);
        person2.put("Job_title", "QA");
        person2.put("Salary", 95000);
        person2.put("Hiring-Date", LocalDate.of(2023,12,10));
        person2.put("Married", true);
        System.out.println("person2 = " + person2.get("Name"));
        System.out.println("person2 = " + person2.get("Job_title"));


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

        //storing the above maps to a data structure as list, Now inorder to store the data type must be map to have all the maps
        List<Map<String, Object>> listOfMap = new ArrayList<>();//this arraylist object only accepts map objects
        listOfMap.add(person1);//using add method to add single map
        listOfMap.add(person2);
        listOfMap.addAll(Arrays.asList(person3,person4));//using add all method to add set/collection of maps

        System.out.println("listOfMap = " + listOfMap);
        System.out.println(listOfMap.size());

        System.out.println("-------------iterating through listOfMap-------------");
        for (Map<String, Object> eachMap : listOfMap) {
            System.out.println(eachMap);//wil get each map of the list
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);//this will give us each entry in the list

            }
            
        }
        System.out.println("-------------------------------------------------");
        //display the name of the employee who are hired this year
        for (Map<String, Object> eachMap : listOfMap) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()){
              if(eachEntry.getKey().equals("Hiring-Date")){
                  if(((LocalDate)eachEntry.getValue()).getYear()==2023){
                      System.out.println(eachMap.get("Name"));
                  }
              }
            }

            }

        System.out.println("-------------------------------------------------");
        //change the name of Arthur to Wasel from the list
        listOfMap.get(0).replace("Name", "Wasel");//as it is set and set has index number, so we call the map at the given index, where its at index zero and from that map we use replace method and replace the name

        System.out.println(listOfMap);
        System.out.println("-------------------------------------------------");
        //increase the salary of the last person by 50000

        listOfMap.get(listOfMap.size()-1).replace("Salary", ((Integer)listOfMap.get(listOfMap.size()-1).get("Salary"))+ 50000);
        System.out.println(listOfMap);

        System.out.println("-------------------------------------------------");
        //update the age of second employee from the list of map
        listOfMap.get(1).replace("Age", 28 );

        System.out.println("-------------------------------------------------");
        //increase the age of second employee by 4 years
        listOfMap.get(1).replace("Age", ((Integer)listOfMap.get(1).get("Age"))+ 4);

        System.out.println(listOfMap);

        System.out.println("-------------------------------------------------");
        Map<String, Object> car1 = new LinkedHashMap<>();//map including car info
        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("year", 2021);
        car1.put("color", "Red");
        car1.put("price",45000.5);

        Map<String, Object> car2 = new LinkedHashMap<>();
        car2.put("brand", "Toyota");
        car2.put("model", "Camry");
        car2.put("year", 2022);
        car2.put("color", "Silver");
        car2.put("price", 30000.0);

        Map<String, Object> car3 = new LinkedHashMap<>();
        car3.put("brand", "Ford");
        car3.put("model", "Mustang");
        car3.put("year", 2021);
        car3.put("color", "Blue");
        car3.put("price", 55000.75);

        Map<String, Object> car4 = new LinkedHashMap<>();
        car4.put("brand", "Honda");
        car4.put("model", "Civic");
        car4.put("year", 2023);
        car4.put("color", "White");
        car4.put("price", 25000.0);

        //now put all the above map into a single data structure, a list of Maps

        List<Map<String, Object>> listOfMaps = new ArrayList<>();
        listOfMaps.addAll(Arrays.asList(car1, car2, car3, car4));
        System.out.println(listOfMaps);
        //now by calling specific methods we will change some of the cars info from the above listOfCars

        System.out.println("--------------------------------------------");
        //display the model of the car that came to the market in 2022
        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if(eachEntry.getKey().equals("year")){
                    if (eachEntry.getValue().equals(2021)){
                        System.out.println(eachMap.get("model"));
                    }
                }

            }
        }

        System.out.println("--------------------------------------------");
        //display the model of the car with the highest price
        double maxPrice = Double.MIN_VALUE; // Initialize to a very small value
        String modelWithMaxPrice = null;

        for (Map<String, Object> eachMap : listOfMaps) {
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                if (eachEntry.getKey().equals("price")) {
                    double price = (double) eachEntry.getValue(); // Assuming price is of type double

                    // Compare prices and update if the current price is higher
                    if (price > maxPrice) {
                        maxPrice = price;
                        modelWithMaxPrice = (String) eachMap.get("model");
                    }
                }
            }
        }

        // Print the model with the highest price
        if (modelWithMaxPrice != null) {
            System.out.println("Model with the highest price: " + modelWithMaxPrice);
        } else {
            System.out.println("No cars in the list");
        }
    }




        }




