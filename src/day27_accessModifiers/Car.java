package day27_accessModifiers;

public class Car {

    public String make, model, color;
    public int year;
    public double price;
    public static int wheels = 4;
    // lets suppose there are other classes that are correlated with this car class
    public class CarEngine{// this object is correlated with car that is why we created it inside the car class, so this becomes the inner class and the car class becomes the outer class
        // here we can not creat anything that is static and not related to the object as
      // static int a;

        public void method (){// this is the method of the inner class and has the ability to access all the elements of the outer class
            System.out.println(make);
            System.out.println(wheels);
        }

    }// this is an example of nested class

    public static class StaticInnerClass{
       // this only accepts the static member of the outer class
        public void method (){
            System.out.println(wheels);
        }
    }
}
