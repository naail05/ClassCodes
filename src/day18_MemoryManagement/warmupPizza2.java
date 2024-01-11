package day18_MemoryManagement;

public class warmupPizza2 {

    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;


    public void setInfo (String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public int calcCost() {
        int totalCost=0;
        if (size.equalsIgnoreCase("small")) {
            totalCost = 10 + 2*(numberOfCheeseTopping + numberOfPepperoniTopping);
            System.out.println(totalCost);
        }else if (size.equalsIgnoreCase("medium")) {
            totalCost = 12 + 2 *(numberOfCheeseTopping + numberOfPepperoniTopping);
            System.out.println(totalCost);
        }else if (size.equalsIgnoreCase("large")) {
            totalCost = 14 + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
            System.out.println(totalCost);
        }
        return totalCost;

    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '"' +
        ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}

