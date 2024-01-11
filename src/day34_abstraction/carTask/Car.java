package day34_abstraction.carTask;

public abstract class Car {// by making abstract it is meant to be inherited, can not be instantiated

    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();//to set the class name to the make of the car
        this.model = model;
        setColor(color);

        if (year < 1886) {
            System.err.println("Invalid year: " + year + " year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price + " price can not be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    //methods

    protected final void stop() {// making it final to prevent changes
        //and by making it protected we want to make sure that non-sub classes outside the package can not use it
        System.out.println(" Press the brake to stop "+make+" "+model);
    }

    protected abstract void start();//it is meant to be overridden as body/implementation needed to be given eventually which is only possible though overriding , so we can not make it final.


    @Override
    public String toString() {
        return make + "{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=$" + price +
                '}';
    }
}

/*
Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price

			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not  negative or zero

			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car

			Methods:
				stop() (final): prints "Presse the brake"

				start() (abstract)

				toString(): prints the given car info when a car object is passed in the print statement

	2. Create the following sub classes of Car
			1. Honda
			2. Audi
					extra methods:
						autoPark()
			3. Tesla
					extra methods:
						autoPilot

 */