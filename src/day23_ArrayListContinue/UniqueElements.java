package day23_ArrayListContinue;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");
        
        // fid the unique element

        for (String each : names) {
            if (names.indexOf(each)==names.lastIndexOf(each)){
                System.out.println(each);
                //break; if we want to find the first unique we add break
            }
            
        }


    }
}
