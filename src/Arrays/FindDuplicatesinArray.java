package Arrays;
import java.util.Scanner;
public class FindDuplicatesinArray {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the size of the array (N): ");
            int N = scanner.nextInt();

            int[] array = new int[N];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }

            int duplicate = findDuplicateNumber(array);
            System.out.println("Duplicate Element: " + duplicate);
        }

        public static int findDuplicateNumber(int[] array) {
            int slow = array[0];
            int fast = array[0];

            // Phase 1: Detect the intersection point of the two pointers
            do {
                slow = array[slow];
                fast = array[array[fast]];
            } while (slow != fast);

            // Phase 2: Find the entrance to the cycle (duplicate element)
            slow = array[0];
            while (slow != fast) {
                slow = array[slow];
                fast = array[fast];
            }

            return slow;
        }
    }
//The code uses Floyd's Tortoise and Hare algorithm
