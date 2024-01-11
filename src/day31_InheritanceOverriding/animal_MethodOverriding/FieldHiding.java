package day31_InheritanceOverriding.animal_MethodOverriding;


    class A{
        public  int a = 100;

    }

    public class FieldHiding extends A{

        public int a = 300;


        public static void main(String[] args) {


            System.out.println(new FieldHiding().a);// here as a is an instance variable that is why we created an object first through (new FieldHiding().a)

            // here the parent class will hide the variable and will not inherit it to the child class, this is called field hiding


        }

    }