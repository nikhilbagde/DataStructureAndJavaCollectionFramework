package CH7;

import sun.awt.image.ImageWatched;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by Nikhil on 1/19/2016.
 */
public class List_Iterator {
    public static void main(String[] args) {
        LinkedList <String> myList = new LinkedList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
        myList.add("Four");
        myList.add("Five");
        myList.add("Six");

                //Iterator: is created using myList list object.
                //lets see
                // List iterator is kind of a function to linkedList object.
                //remember that

        ListIterator<String> itrMyList = myList.listIterator();

        while(itrMyList.hasNext()){
            System.out.print(itrMyList.next() + " ");
        }
                //Special thing about linked list iterator is that they can be iterate in both ditections
                // iterator --->  <---- both direction.

                //Second appraoch to iterate.
        ListIterator<String> itr2Mylist = myList.listIterator(2);
                //this iterator will start from 2nd position.
                //**** This is different in linked list
                // we can actually start iterator from any position.
        itr2Mylist.hasPrevious();
        itr2Mylist.hasNext();
                //this will itr2 will start from 2nd index so we can
                // call previous!!

                //lets set to zero
        itr2Mylist = myList.listIterator();
                //it has again set to zero instead of '2'
        System.out.println("\n");
        System.out.println(itr2Mylist.next() + " " + itr2Mylist.next() + " " + itr2Mylist.previous());
                // difference between next() and previous:
                //next(): Its post increament -> next++ -> first returns next element and then moves to next element
                //previous(): its a pre increament -> --previous -> it first go back to previous position then it decreaments

        int j=4,
            k=9;
        System.out.println(j++);  //now J = 5, but it prints 4. as it will first print and then increment
        System.out.println(--k);  //now k = 8 it will print 8 only, as it will first drecrement and then prints.

        //to work with previous we should start with farther point..
        // so we can implement it like this,

        ListIterator<String> itr = myList.listIterator(myList.size());
        while(itr.hasPrevious())
            System.out.print(itr.previous() + " ");

        //More about iterator
        //They can add items like myList.add directly.

        itr.add("Seven"); //it will get added at 0th position as we have initiated itr without any initial index.
        System.out.println(myList);


    }
}
