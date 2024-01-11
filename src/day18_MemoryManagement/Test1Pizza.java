package day18_MemoryManagement;

public class Test1Pizza {

    public static void main(String[] args) {


        warmUp1_pizza pizza = new warmUp1_pizza();
       pizza.setInfo('L',2,1);
       System.out.println(pizza);

       warmUp1_pizza pizza2 = new warmUp1_pizza();
       pizza2.setInfo('M',3,2);
        System.out.println(pizza2);


        warmUp1_pizza pizza3 = new warmUp1_pizza();
        pizza2.setInfo('w',3,2);
        System.out.println(pizza2);

        System.out.println("---------------------------------------------");

        double total = 0;

        for (int i = 0; i < 20; i++) {
           warmUp1_pizza large = new warmUp1_pizza();
           large.setInfo('l',2,3);

           total += large.calcCost();//means every time a large pizza is created total will increase by that amount

           warmUp1_pizza medium = new warmUp1_pizza();
           medium.setInfo('m',2,2);

           total +=medium.calcCost();

           warmUp1_pizza small = new warmUp1_pizza();
           small.setInfo('s',1,1);
           //calculate the total cost of all the above ordered pizzas(60 pizzas in this case)
            total += small.calcCost();

        }

        System.out.println("total = " + total);

    }
}
