package _1nextsession;

import java.util.Scanner;

public class PairsWithSumusingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int count = countPairsWithSumK(array, k);
        System.out.println("Number of pairs with sum " + k + ": " + count);
    }

    private static int countPairsWithSumK(int[] nums, int target) {
        int count = 0;
        int[] res = new int[10000];
        //1,5,7,-1 . suppose k=6. possible complement is 6-1=5, 5 key exists in hashmap.
        for (int num : nums) {
            int complement = target - num;
            count += res[complement];
            res[num]++;
        }

        return count;
    }
}
// Input: 1 5 7 -1, Target: 6

// Iteration 1: num = 1
// complement = 6 - 1 = 5
// res[5] is 0, count remains 0, res[1] is updated to 1

// Iteration 2: num = 5
// complement = 6 - 5 = 1
// res[1] is 1, count becomes 1, res[5] is updated to 1

// Iteration 3: num = 7
// complement = 6 - 7 = -1
// res[-1] is 0, count remains 1, res[7] is updated to 1

// Iteration 4: num = -1
// complement = 6 - (-1) = 7
// res[7] is 1, count becomes 2, res[-1] is updated to 1

// Final count is 2

