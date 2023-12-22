package _1nextsession;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsingHashSet {
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
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : array) {
            if (!seenNumbers.contains(num)) {
                seenNumbers.add(num);
                uniqueSet.add(num);
            } else {
                uniqueSet.remove(num);
            }
        }

        for (int uniqueNum : uniqueSet) {
            System.out.print(uniqueNum + " ");
        }
    }
}
// Input: 3 1 3 4 2

// Iteration 1: array[0] = 3
// seenNumbers: {3}, uniqueSet: {3}

// Iteration 2: array[1] = 1
// seenNumbers: {3, 1}, uniqueSet: {3, 1}

// Iteration 3: array[2] = 3
// seenNumbers: {3, 1}, uniqueSet: {1} (removed 3 as it's no longer unique)

// Iteration 4: array[3] = 4
// seenNumbers: {3, 1, 4}, uniqueSet: {1, 4}

// Iteration 5: array[4] = 2
// seenNumbers: {3, 1, 4, 2}, uniqueSet: {1, 4, 2}

// Unique Elements: 1 4 2
