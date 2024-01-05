package _5Jan2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExampleandAdvantage {

        public static void main(String[] args) {
            // Create a list
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);

            // Using Iterator to iterate through the list and remove even numbers
            Iterator<Integer> iterator = numbers.iterator();
            while (iterator.hasNext()) {
                int cur = iterator.next();

                // Remove even numbers
                if (cur % 2 == 0) {
                    iterator.remove();
                }
            }
            System.out.println("List after removing even numbers: " + numbers);
        }
    }
    /*List<Integer> filteredNumbers = numbers.stream()
            .filter(n -> n % 2 != 0)
            .collect(Collectors.toList());
*/
   /*
   The iterator allows us to remove elements (even numbers in this case) from the collection while iterating. This is achieved using the remove() method of the Iterator. If we were using a traditional for loop,
        removing elements during iteration would result in a ConcurrentModificationException

        Iterator provides a uniform way to access elements across different types of collections (List, Set, Map). Regardless of the specific implementation of the collection,
         you use the same set of methods (hasNext() and next()) to access elements.

         Iterators are the foundation for the enhanced for loop (for-each loop) in Java. The enhanced for loop simplifies the process
         of iterating over elements in a collection, and it internally uses iterators.

         For large collections, iterators can be more memory-efficient and faster than using indices with a regular loop.
          It avoids the need to create an additional copy of the collection (as done in for-each loop).
         */