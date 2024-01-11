package day30_InheritanceContinue.phone;

public class TestPhoneObject {

    public static void main(String[] args) {

        IPhone ipone = new IPhone("IPhone14", "Pro", 900, "Gold");

        Samsung samsung = new Samsung("Galaxy S22", "Medium", 800,"Black");

        Nokia nokia = new Nokia("Brick", "Small", 400, "Silver");

        ipone.call(911);
        samsung.call(911);
        nokia.call(911);
        System.out.println("=================================================================");
        System.out.println(ipone);
        System.out.println(samsung);
        System.out.println(nokia);

        System.out.println("=================================================================");

        //now testing methods which are not inherited, but specific to these each child class

        ipone.facetime(614895718);

        nokia.selfDefence();

        samsung.freeze();

    }
}
