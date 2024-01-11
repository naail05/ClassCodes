package day13_CustomMethods;

public class ReturnMethodIntro {

    public static void main(String[] args) {
       // sum1(12,13);// this can not be used the data out side the refered method unless you print it in the mentioned method and the reason is the usage of void method


       int total= sum(12,13);// we can store the outcome in this case result in a variable as it gives us/ returns a data
        System.out.println(total);

        int Total = square(4);
        System.out.println(Total);

        System.out.println(cube(3));



    }






    public static int sum (int num1, int num2 ){
        int result = num1+num2;
        return result;



    }

    public static int square (int number){
        int result= number*number;
        return result;

    }

    public static int cube (int number){
       // int result= number*number*number;
       // return result;
        //or
        int result = square(number)*number;// here we are calling the square method here and multiplying it with number to get the cube, means thats the benefit of return method as it gives us data, which can further be used
        return result;}


}
