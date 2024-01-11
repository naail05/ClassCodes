package day32_finalKeyword.finalKeyword;

import day27_accessModifiers.Car;

import java.time.LocalDate;

//final method

class CydeoStudent{
    public final void language(){
        System.out.println("Java Programming");
    }
}





public class FinalKeyword  extends CydeoStudent{// making this class as the subclass of CydeoStudent for overriding purposes.

/*
    @Override
    public void language() { as we have made it final, so we wont be able to override it
        System.out.println("Python programming");
    }
*/
    public static void main(String[] args) {
         char gender = 'M';
        System.out.println(gender);// M
         //as long as it doesnt have final keyword, we can reassign it

        gender = 'F';// here a new value is assigned and old value is gone

        System.out.println(gender);// F

        //if we make a variable final then we wont be able to change or reassign it, as it will give compile error

        System.out.println("------------------------------------------");

        final   LocalDate dateOfBirth = LocalDate.of(2021, 12, 24);
       // dateOfBirth = LocalDate.of(2024,12,24); now we wont be able to change it


        System.out.println("------------------------------------------");

        new CydeoStudent().language();//here we will get java programming

        new FinalKeyword().language();//now here we will get the overridden value, which is "Python programming", before applying final keyword, as after applying the keyword we will wont be able to override

        System.out.println("------------------------------------------");
        //garbage collection

        String name = "James";// inorder to make this object eligible for garbage collection, we have two ways,
        // 1) to make it unreferenced
        name = null;//so it will be eligible for garbage collection
        System.out.println(name);
        //2) can reference it to another object
        name = "Danial";
        System.out.println(name);
        //so if we want an object to ot be eligible for garbage collection, we can make it final
        final  String name1 = "Naail";//this can not be reassigned and changed, so will not be eligible for garbage collection
    }
}
