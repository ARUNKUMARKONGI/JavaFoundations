package _5Jan2024;
import java.util.LinkedList;

public class LinkedListBasics {
        public static void main(String[] args) {
            LinkedList<Integer> llist = new LinkedList<>();

            llist.add(5);
            llist.add(10);
            llist.add(15);
            llist.add(20);
            llist.add(10);

            System.out.println("Initial LinkedList: " + llist);

            llist.addFirst(2);
            llist.addLast(25);
            llist.add(3, 12);
            System.out.println("LinkedList after adding elements: " + llist);

            System.out.println("Element at index 2: " + llist.get(2));

            llist.set(1, 8);  //replace
            System.out.println("LinkedList after updating element at index 1: " + llist);

            llist.removeFirst();
            llist.removeLast();
            llist.remove(Integer.valueOf(15)); // Remove by value
            System.out.println("LinkedList after removing elements: " + llist);

            System.out.println("Does LinkedList contain 20? " + llist.contains(20));

            llist.removeFirstOccurrence(10);

            System.out.println(llist);
            llist.removeIf(n -> n % 2 == 0);
            System.out.println(llist);

           /* System.out.println("Is LinkedList empty? " + llist.isEmpty());
            llist.clear();*/
        }
    }
