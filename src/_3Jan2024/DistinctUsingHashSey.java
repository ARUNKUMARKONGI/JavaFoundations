package _3Jan2024;
import java.util.*;
public class DistinctUsingHashSey {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Distinct elements in the array:");
            printDistinctElements(array);
        }

        private static void printDistinctElements(int[] array) {
            Set<Integer> set = new HashSet<>();

            for (int num : array) {
                if (set.add(num)) {
                    System.out.print(num + " ");
                }
            }
        }
    }
