package HashsetProblems;
import java.util.*;
public class CommaSeparated {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the list of strings (comma-separated): ");
            String[] strings = scanner.nextLine().split(",");

            // Read the list of indices
            System.out.print("Enter the list of indices (comma-separated): ");
            String[] indicesStr = scanner.nextLine().split(",");
            int[] indices = new int[indicesStr.length];
            for (int i = 0; i < indicesStr.length; i++) {
                indices[i] = Integer.parseInt(indicesStr[i]);
            }
            /*int[] indices = Arrays.stream(scanner.nextLine().split(","))
                    .mapToInt(Integer::parseInt)
                    .toArray();*/
            // Create a new list excluding strings at the specified indices
            List<String> result = removeStringsAtIndex(strings, indices);

            // Print the result
            System.out.println("Output: " + result);
        }

        public static List<String> removeStringsAtIndex(String[] strings, int[] indices) {
            Set<Integer> indicesToRemove = new HashSet<>();
            for (int index : indices) {
                indicesToRemove.add(index);
            }

            List<String> result = new ArrayList<>();
            for (int i = 0; i < strings.length; i++) {
                if (!indicesToRemove.contains(i)) {
                    result.add(strings[i]);
                }
            }

            return result;
        }
    }

   /* The contains method of HashSet has an average time complexity of O(1) for the check,
        which is much faster than iterating over a list or array to find the presence of an element.*/