package _1nextsession;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class DuplicateNumberUsingHashset {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n;
            System.out.print("Enter the size of the array: ");
            n = scanner.nextInt();

            int[] a = new int[n];
            Set<Integer> set = new HashSet<>();

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            System.out.print("Duplicate Element(s): ");
            List<Integer> dup = new ArrayList<>();
            for (int num : a) {
                if (!set.add(num)) {
                    dup.add(num);
                }
            }
            for (int i : dup) {
                System.out.print(i + " ");
            }
        }
    }


// Input: 3 1 3 4 2

// Iteration 1: a[0] = 3
// set: {3}, dup: {}

// Iteration 2: a[1] = 1
// set: {3, 1}, dup: {}

// Iteration 3: a[2] = 3
// set: {3, 1}, dup: {3}

// Iteration 4: a[3] = 4
// set: {3, 1, 4}, dup: {3}

// Iteration 5: a[4] = 2
// set: {3, 1, 4, 2}, dup: {3}

// Duplicate Element(s): 3
