package day04_primitiveCastin_Concatenation;

public class Task4_Carinfo {
    public static void main(String[] args) {

      int year = 2017;
      String make = "Honda";
      String model = "Accord";
      int miles = 104000;
      String color = "Gray";
      int price = 12000;

        System.out.println("Car information is :");
        System.out.println("\t"+year+" "+make+" "+model+", "+miles+" miles, "+color+", "+"$"+price);

        System.out.println();
        System.out.println("------------------------------");
        System.out.println("Car information is :"+"\n\t"+year+" "+make+" "+model+", "+miles+" miles, "+color+", "+"$"+price);
    }
}
/*
Declare the following variables:
   1. year
   2. make
   3. model
   4. miles
   5. color
   6. Price
 Use concatenation to print the full info of the car in the
following format:

Year Make Model, Miles, Color, Price.

Ex:
  Car information is :
      2018 Toyota Camry, 50000 miles, Red, $19000.

 */