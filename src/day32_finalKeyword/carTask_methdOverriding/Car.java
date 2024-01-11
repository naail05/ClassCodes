package day32_finalKeyword.carTask_methdOverriding;

public class Car {

    private String make, model,color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;

    static {//initializing the static variables
        numberOfWheels = 4;
        hasBattery = true;
    }

    public Car(String model, String color, int year, double price) {
        setMake(getClass().getSimpleName());// here we are setting the class name to the make of the car and setter checks if there are any conditions while setting the car object
       setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year<=0){
            System.err.println("Year can not be zero or negative: "+ year);
            System.exit(1);//if the given year is negative or zero then it terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Invalid price! price can not be negative or zero: "+price);
            System.exit(1);
        }
        this.price = price;
    }

    public static int getNumberOfWheels() {
        return numberOfWheels;
    }

    public static void setNumberOfWheels(int numberOfWheels) {
        Car.numberOfWheels = numberOfWheels;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Car.hasBattery = hasBattery;
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }

    @Override
    public String toString() {// we modified the toString as well for the make, which will be as that of the class name
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", number of wheels=" + numberOfWheels +
                ", has battery=" + hasBattery +
                '}';
    }
}

/*
 Create a class named Car
            Variables:
                make, model, color, year, price, numberOfWheels (static), hasBattery (static)

            Encapsulate all the fields
                    Condition:
                        1. year can not be negative or zero
                        2. price can not be negative or zero

            Add a constructor that can set all the fields
                    note: make of the car can be set to the class name

            Methods:
                start(): "Press the brake and twist the key to ignition"

                toString()


 */