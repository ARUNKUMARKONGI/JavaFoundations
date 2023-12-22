package _1nextsession;
import java.util.Scanner;

public class DuplicateNumberAnyRange {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the length of the array: ");
            int n = scanner.nextInt();
            int[] nums = new int[n + 1]; //n+1 if index starts from 1

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            int result = findDuplicate(nums);
            System.out.println("The repeated number is: " + result);
        }
        public static int findDuplicate(int[] nums) {
            int len = nums.length;
            int[] cnt = new int[len + 1];
            for (int i = 0; i < len; i++) {
                cnt[nums[i]]++;
                if (cnt[nums[i]] > 1) {
                    return nums[i];
                }
            }
            return 0;
        }
    }



//this approach takes extra count memory space complexity O(n)
// Input: 3 1 3 4 2

// Iteration 1: nums[0] = 3
// cnt[3] is incremented to 1, no duplicate found

// Iteration 2: nums[1] = 1
// cnt[1] is incremented to 1, no duplicate found

// Iteration 3: nums[2] = 3
// cnt[3] is incremented to 2, duplicate found, returns 3

// Final result: 3 (the first duplicate encountered in the array)
