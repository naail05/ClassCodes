package day18_MemoryManagement;

public class warmUp1_pizza {

    public char size ;
    public int numberOfCheeseTopping, numberOfPeperoniTopping;

    public void setInfo (char size, int numberOfCheeseTopping, int numberOfPeperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPeperoniTopping = numberOfPeperoniTopping;
    }// this method helps us when we have many objects, we just call the method and that will return us all the required data. it suggests a method commonly used for setting or updating information within an object or instance of a class.


    public String toString() {
        return "warmUp1_pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPeperoniTopping=" + numberOfPeperoniTopping + ", total" +
                " price ="+calcCost()+
                '}';
    }

  //the following method calculates the total price of the pizza, returns it as double
    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case's':
                totalPrice = 10 + 2 *(numberOfCheeseTopping+numberOfPeperoniTopping);
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2 *(numberOfCheeseTopping+numberOfPeperoniTopping);
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2 *(numberOfCheeseTopping+numberOfPeperoniTopping);
                break;
            default:
                System.err.println("Invalid size: "+ size);

        }

        return  totalPrice;
    }
}
/*

Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping
 */