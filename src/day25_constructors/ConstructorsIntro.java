package day25_constructors;

public class ConstructorsIntro {

    public ConstructorsIntro (){
        // we can have more than one constructors, we need to overload, else will get compile error
        System.out.println("Object is created by using no argument constructor");

    }

    public ConstructorsIntro(int a){
        //when we define the constructor, compiler will not define
        System.out.println("Object is created by using int argument constructor");
        //so as soon as the object is created the constructor will get executed,(one there is one constructor), but when there are more than one then we have to choose which constructor to use
    }

    public static void main(String[] args) {

       // new ConstructorsIntro();// when we have not defined the constructor by ourselves then the compiler will do so and that will be called the default constructor or no argument constructor, so here by giving new keyword and name of the class we can define an object

        ConstructorsIntro obj1 = new ConstructorsIntro(10);

        ConstructorsIntro obj2 = new ConstructorsIntro(10);

        //now that we chose the second constructor, so it will be executed with the object (with each object separately, as three times here)As memory allocation for each object is different that is why constructor has to run for each object separately

        ConstructorsIntro obj3 = new ConstructorsIntro();
        // here the first constructor is going to execute




    }
}
