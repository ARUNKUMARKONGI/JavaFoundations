package _3Jan2024;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairswithGivenSumUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }
        int k = sc.nextInt();
        int count = countPairsWithSumK(array, k);
        System.out.println("Number of pairs with sum " + k + ": " + count);
    }

    private static int countPairsWithSumK(int[] nums, int target) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int complement = target - num;   //1,5,7,-1 . suppose k=6. possible complement is 6-1=5, 5 key exists in hashmap.
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);  //getorDefault mandatory if hashmap is null for the value
        }
        return count;
    }
}




/*
    Input reading:

        input: "1 5 7 -1"
        array: [1, 5, 7, -1]
        k: 6
        Initialize variables:

        count: 0
        map: {}
        Loop through the array:

        Iteration 1: num = 1

        complement = 6 - 1 = 5
        map is empty, so no complement found.
        Update map: {1=1}
        Iteration 2: num = 5

        complement = 6 - 5 = 1
        map contains complement (1), increment count by the frequency of 1 in the map (count += 1).
        Update map: {1=1, 5=1}
        Iteration 3: num = 7

        complement = 6 - 7 = -1
        map is empty, so no complement found.
        Update map: {1=1, 5=1, 7=1}
        Iteration 4: num = -1

        complement = 6 - (-1) = 7
        map contains complement (7), increment count by the frequency of 7 in the map (count += 1).
        Update map: {1=1, 5=1, 7=1, -1=1}
        After the loop, the final count is 2.

        Print the result:

        Output: "Number of pairs with sum 6: 2"*/
