package day35_polymorphism_intro.transportation;

public interface AutoPark {

    boolean hasAutoPark =true;//it is public static and final by default, so need to be initialized here as we can not have constructor and static block in an interface

    void authPark();
}
/*
 Create an interface named AutoPark

				abstract methods:
					autoPark();
 */