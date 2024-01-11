package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;
    //above are some static variables, how if we dont initialize them directly as public static a = 100;
    // but in future we will have static variables, where we will not be able to assign their values straight as the above ones, that is where we will need static blocks an initializers

    //public static ExcelSheet; let suppose we need some data from an excelSheet and we have the variable, we can not really assign the data directly in this case, we need to go through different steps as read the file, get the file and get the sheet of that excel file, so in such cases we need static block as static initializer where we will need a block. this is the only method that can be used to initialized the static variables


    static {

        a=100;
        b = 20.5;
        c = "Java";

    }


  /*  public static void main(String[] args) {


        a=100;
        b = 20.5;
        c = "Java";

    }
*/
/*
    public StaticInitializationBlock(){
        a =100;
        b = 20.5;
        c = "Java";

    }// this will only get executed when an object is created else will not be executed.
*/
}
