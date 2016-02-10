package CH6;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Nikhil on 1/17/2016.
 */
public class LeanArrayListAPI {
    public static void main(String[] args) {

        //Public ArrayList(int initial capacity)
        ArrayList<String> fruits = new ArrayList<String>(100);
        // Size with 100
        ArrayList<String> fruits1 = new ArrayList<String>();
        //This is defualt one and it has size of 10..
        String[] fruit2 = new String[10]; //with new
        double[] fruit3 = new double[200]; //with primitive
        String[] fruit4 = {"Banana", "Apple", "Mango"}; //different approach without new

        //public ArrayList(Collection<?extents E> c)
        //copy constructor
        ArrayList<String> newArray = new ArrayList<String>(fruits1);
        //this newArray will have 110% of size of given collection
        // ...Note: new array list object doens't actually copy all elements from fruit list
        //but only copies the references to the elements of fruits

        //Clone
        ArrayList<String> stringArray = new ArrayList<String>();
        stringArray.add("Nikhil");

        ArrayList<Integer> intArray = (   ArrayList<Integer>  ) stringArray.clone();
        System.out.println(intArray.get(0));
        ArrayList<String> CopyArray = new ArrayList<String>(stringArray);
        System.out.println(CopyArray.get(0));

        //Copy array and not the arraylist boss
        String[] copyArray1 = new String[10];
        copyArray1[0]="one";
        copyArray1[1]="two";
        copyArray1[2]="three";
        String[] toCopyArray = new String[10];
        System.arraycopy(copyArray1, 0,toCopyArray,0, 3 );

        for(String s: toCopyArray){
            System.out.print(s + " ");
        }
        System.out.println();
        for (int i = 0; i < toCopyArray.length; i++) {
            System.out.print(toCopyArray[i] + " ");
        }
        System.out.println();
        int i=0;
        while(toCopyArray[i]!= null){
            System.out.print(toCopyArray[i]+" ");
            i++;
        }
        System.out.println(toCopyArray.length);


        //How will you remove element from the array
        String[] arrayofString = new String[10];
        arrayofString[0]="1";
        arrayofString[1]="2";
        arrayofString[2]="3";
        arrayofString[3]="4";
        arrayofString[4]="5";
        arrayofString[5]="6";
        arrayofString[6]="7";
        arrayofString[7]="8";
        System.out.println();

        for (String a: arrayofString) {
            System.out.print(a + " ");
        }
        // Now If someone want to remove element at position 2.
        // Now what ?
        //try {
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);
            System.out.println("\n\nEnter the position you want to remove element from: ");
            int position = new Scanner(System.in).nextInt();
            for (int j = position ; j < arrayofString.length-1; j++) {
                arrayofString[j]=arrayofString[j+1];
            }
            arrayofString[arrayofString.length-1]=null;

        for (String a: arrayofString) {
            System.out.print(a + " ");
        }
        /*}catch(IOException e){
            System.out.println(e);
        }*/

        //Now if I want to add element at position specified by user to Array.
        // How will I do it?
        System.out.println("\n\nEnter the position you want to add element in: ");
        position = new Scanner(System.in).nextInt();

        System.out.println("\n\nEnter the element: ");
        String element = new Scanner(System.in).next();
        for (int j = arrayofString.length-1; j > position ; j--) {
            arrayofString[j] = arrayofString[j-1];
        }
        arrayofString[position]=element;
        for (String a: arrayofString) {
            System.out.print(a + " ");
        }

    }
}
