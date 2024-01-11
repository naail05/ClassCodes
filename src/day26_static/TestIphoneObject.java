package day26_static;

public class TestIphoneObject {

    public static void main(String[] args) {

Iphone iphone = new Iphone ("Iphone 14", "Black", 1000);

        System.out.println(iphone.color);
        System.out.println(iphone.price);
        System.out.println(iphone.model);// through the object we can access any instances


        iphone.printPhoneInfo();// through this object we can access the instance method, which is printPhoneInfo in this case

        System.out.println(iphone.brand);// every object is created from class, this means that if the class has its own member, then those can be shared by all the objects as well as brand in this case, which is static, but is shared by the object

        System.out.println(iphone.OS);// though they can be called, but still we will get error , as stated depend upon the class and do not depend on  the object, so here intellij is giving warning as this step is not necessary , the right way is through the class name

        System.out.println(Iphone.isTouchScreen);
        System.out.println(Iphone.isExpensiveToFix);
        System.out.println(Iphone.hasBattery);// so here we can call them without any error





    }
}
