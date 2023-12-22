package _1nextsession;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
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
            Set<Integer> dup = new HashSet<>();
            for (int num : a) {
                if (!set.add(num)) {
                    dup.add(num);
                }
            }
            for (long i : dup) {
                System.out.print(i + " ");
            }
        }
    }
