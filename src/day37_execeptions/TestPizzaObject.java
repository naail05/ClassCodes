package day37_execeptions;

public class TestPizzaObject {

    public static void main(String[] args) {


        Pizza pizza1 = new Pizza('M', 2, 1);
        Pizza pizza2 = new Pizza('L', 3, 2);
        Pizza pizza3 = new Pizza('M', 1, 1);

        System.out.println(pizza1.equals(pizza2));
        System.out.println(pizza1.equals(pizza3));//this cmpares if the given two pizza objects are same

        System.out.println(pizza1==pizza3);//this determines if both are referencing to same pizza object in the memory
        System.out.println(pizza1.calcCost());

        Object obj = new Pizza('S', 4, 3);
        boolean r = obj.equals(pizza2);//though we are calling the equals method from reference type, but still the implementation will be based on the overridden version of the method in the object type
        System.out.println(r);
        System.out.println(((Pizza)obj).calcCost());//now that the calculate cost method is not available in the reference type(object class), so we in order to access it from the pizza class we need to do the downCasting
    }
}
