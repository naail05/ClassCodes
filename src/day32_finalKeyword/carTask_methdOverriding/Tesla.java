package day32_finalKeyword.carTask_methdOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public final class Tesla extends Car{// want to make this class as final, to make sure that other classes can not copy or inherit this class

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void setModel(String model) {
       String [] models = {"Model S", "Model Y", "Model x", "Model 3" };
       if (!Arrays.asList(models).contains(model)){//means the specified model is not valid then
           System.err.println("Invalid Tesla Model: "+model);
           System.exit(1);
       }
       super.setModel(model);//it is as (this.model = model;)
    }

    @Override
    public void setColor(String color) {//here we are using arraylist not array
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));
       if (!colors.contains(color)){
           System.err.println("Invalid Color");
           System.exit(1);
       }
       super.setColor(color);


    }

    @Override
    public void setYear(int year) {
        if (year<2008){
            System.err.println(" Year of make can not be less than 2008");
            System.exit(1);
        }
        super.setYear(year);

    }

    @Override
    public void setPrice(double price) {
        if (price<50000){
            System.err.println("Price of the Tesla car can not be less than 50K");
            System.exit(1);
        }
        super.setPrice(price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\" to start "+getMake() +" "+getModel());
    }

    public void autoPilot(){//specific to tesla object

        System.out.println(getMake()+" "+getModel()+" is in self-driving mode");

    }
}

/*
Create Tesla sub-class and override the start() method if needed:
Tesla
               		start(): "Say \"Start\""

	                Extra method:
	                	  autoPilot()


	                Extra Conditions for the variables:
	                    1. Model of tesla can only be set to one of the followings:
	                        {"Model S", "Model Y", "Model x", "Model 3" };
	                    2. color of tesla can only be set to one of the followings:
	                        {"White", "Red", "Black", "Silver", "Blue", "Brown", "Green"}
	                    3. year of the tesla can not be less than 2008
	                    4. price of tesla can not be less than 50k
 */