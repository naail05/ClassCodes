package day24_DateAndTime;

import java.time.LocalTime;

public class LocalTimeIntro {

    public static void main(String[] args) {

      LocalTime starting_time =  LocalTime.of(10,30);// this will give us the result in 24 hours format by default

        System.out.println("starting_time = " + starting_time);

        LocalTime right_now = LocalTime.now();
        System.out.println("right_now = " + right_now);

        System.out.println("----------------local time object---------------");

        LocalTime time1 = LocalTime.of(20, 5);
        System.out.println("time1 = " + time1);
        //for the LocalTime.of method we have to give the required information for hour, minutes, seconds and so and those information (arguments) need to be valid (as the maximum hour can be 24 and minutes 60

        time1 = time1.plusHours(1);

        System.out.println("time1 = " + time1);

        time1 = time1.plusMinutes(45);

        System.out.println("time1 = " + time1);


    }
}
