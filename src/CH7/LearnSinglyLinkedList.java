package CH7;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nikhil on 1/18/2016.
 */
public class LearnSinglyLinkedList {
    public static void main(String[] args) {
        List<String> myLinkedList = new LinkedList<>();
        System.out.println(myLinkedList.isEmpty());
        myLinkedList.add("Yes");
        myLinkedList.add("No");
        myLinkedList.add("May Be");
        System.out.println(myLinkedList);
        myLinkedList.add("Simple");
        System.out.println(myLinkedList);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.contains("Nikhil"));
        System.out.println(myLinkedList.lastIndexOf("Simple"));
        List<String> myNewList = myLinkedList;
        System.out.println(myLinkedList.equals(myNewList));

        List<String> duplicateList = new LinkedList<>();
        duplicateList.add("Yes");
        duplicateList.add("No");
        duplicateList.add("May Be");
        duplicateList.add("Simple");
        System.out.println(duplicateList.equals(myLinkedList));

        LinkedList<String> myLinkedList2 = new LinkedList<>();
        myLinkedList2.addFirst("First");
        myLinkedList2.addFirst("Second");
        myLinkedList2.addFirst("Third");
        myLinkedList2.addFirst("Four");
        myLinkedList2.addFirst("Five");
        System.out.println(myLinkedList2);
        myLinkedList2.addLast("Six");
        System.out.println(myLinkedList2);

        String [] a= new String[myLinkedList2.size()];
        myLinkedList2.toArray(a);
        for (String aa:a) {
            System.out.print(aa+ " ");

        }



    }
}
