package day26_static;

public class Iphone {
public static String brand = "Apple";//now that it is static, so we can initialize it at class level rather than each object level as it is going to be the same for all the objects
public String model;// it is instance, because each iphone object will have a different model
public String color;
public double price;
public static String OS = "iOS";
public static String madeIn ="China";
public static boolean hasBattery = true;
public static boolean isTouchScreen = true;
public static boolean isExpensiveToFix = true;


    public Iphone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;

        // why only these three variables are there in the constructor, because they are the only instance variables, as constructor runs separately for each object, as instance variables need to be initialized separately for each object
    }

    public void printPhoneInfo(){

        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);
    }



    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*

Attributes:
brand, model, color, price, OS, madeIn,hasBattery, isTouchScreen
we have to pick which one needs to static and which one instance
 */