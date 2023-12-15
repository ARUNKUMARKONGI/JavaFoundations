package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
public class CommaSeparated {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the list of strings
            System.out.print("Enter the list of strings (comma-separated): ");
            String[] strings = scanner.nextLine().split(",");

            // Read the list of indices
            System.out.print("Enter the list of indices (comma-separated): ");
            int[] indices = Arrays.stream(scanner.nextLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            // Create a new list excluding strings at the specified indices
            List<String> result = removeStringsAtIndex(strings, indices);

            // Print the result
            System.out.println("Output: " + result);
        }

        public static List<String> removeStringsAtIndex(String[] strings, int[] indices) {
            List<Integer> indicesToRemove = Arrays.stream(indices).boxed().collect(Collectors.toList());

            List<String> result = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                if (!indicesToRemove.contains(i)) {
                    result.add(strings[i]);
                }
            }

            return result;
        }
    }
