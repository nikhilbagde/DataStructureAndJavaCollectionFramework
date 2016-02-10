package CH6;

import java.util.ArrayList;

/**
 * Created by Nikhil on 1/18/2016.
 */
public class Excercise6_3 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Karen");
        myList.add("Don");
        myList.add("Mark");

        ArrayList<String> temp = new ArrayList<String>(myList); //copy constructor : shollow copy
        //meaning that actually elements are not copied only reference is copied.

        ArrayList<String> sameList = myList;
        myList.add(1,"Countney");

        System.out.print("myList Array.\n");
        for (String a:myList) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Temp Array.\n");
        for (String a:temp) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("sameList Array.\n");
        for (String a:sameList) {
            System.out.print(a + " ");
        }
    }
}
