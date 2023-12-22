package _1nextsession;

import java.util.Scanner;

public class uniqueElementsUsingCountArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();

            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            findAndPrintUniqueElements(array);
        }

        private static void findAndPrintUniqueElements(int[] array) {
            int[] countArray = new int[10000]; // Assuming a range of numbers

            for (int num : array) {
                countArray[num]++;
            }

            for (int num : array) {
                if (countArray[num] == 1) {
                    System.out.print(num + " ");
                }
            }
        }
    }

// Input: 3 1 3 4 2

// Iteration 1: array[0] = 3
// countArray: [0, 0, 0, 1, 0, ...], Unique:

// Iteration 2: array[1] = 1
// countArray: [0, 1, 0, 1, 0, ...], Unique: 1

// Iteration 3: array[2] = 3
// countArray: [0, 1, 0, 2, 0, ...], Unique: 1

// Iteration 4: array[3] = 4
// countArray: [0, 1, 0, 2, 1, ...], Unique: 1 4

// Iteration 5: array[4] = 2
// countArray: [0, 1, 1, 2, 1, ...], Unique: 1 4

// Unique Elements: 1 4
