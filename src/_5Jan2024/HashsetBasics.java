package _5Jan2024;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class HashsetBasics {
        public static void main(String[] args) {

            HashSet<Integer> set1 = new HashSet<>();
            set1.add(100);
            set1.add(200);
            set1.add(50);
            System.out.println("Original Hash Set: " + set1);
            //Collections.reverse(set1); //reverse doesnt work on hashset
            // Creating an Array
            Integer[] arr = new Integer[set1.size()];
            set1.toArray(arr);

           // int[] arr = set1.stream().mapToInt(Integer::intValue).toArray();
           /* int index = 0;
            for (int ele : set1) {
                arr[index++] = ele;
            }*/
            System.out.println("Array elements: ");
            for(int ele : arr){
                System.out.println(ele);
            }
            //alternative
            System.out.println(Arrays.toString(arr));

            //converting hashset to treeset
            //hashset has better performance fast, compared to treeset
            //constant time, treeset takes logn time
            //treeset stores the data in sorted order.

            TreeSet<Integer> t = new TreeSet<>(set1);
            System.out.println("TreeSet elements: ");
            for(int element : t){
                System.out.println(element);
            }
            Iterator<Integer> p = t.iterator();
            while(p.hasNext()) {
                System.out.println(p.next());
            }
        }

    }
