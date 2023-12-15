package _1Sessions;
import java.util.Scanner;
public class CommaSeparated {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Read the list of strings
            System.out.print("Enter the list of strings (comma-separated): ");
            String[] strings = scanner.nextLine().split(",");

            // Read the list of indices
            System.out.print("Enter the list of indices (comma-separated): ");
            String[] indicesStr = scanner.nextLine().split(",");
            int[] indices = new int[indicesStr.length];
            for (int i = 0; i < indicesStr.length; i++) {
                indices[i] = Integer.parseInt(indicesStr[i]);
            }

            // Create a new array excluding strings at the specified indices
            String[] result = removeStringsAtIndex(strings, indices);

            // Print the result
            System.out.print("Output: ");
            for (String str : result) {
                System.out.print(str + ",");
            }
        }

        public static String[] removeStringsAtIndex(String[] strings, int[] indices) {
            boolean[] shouldRemove = new boolean[strings.length];

            // Mark indices to be removed
            for (int index : indices) {
                shouldRemove[index] = true;
            }

            int newSize = strings.length - indices.length;
            String[] result = new String[newSize];

            // Create the new array excluding strings at the specified indices
            int resultIndex = 0;
            for (int i = 0; i < strings.length; i++) {
                if (!shouldRemove[i]) {
                    result[resultIndex] = strings[i];
                    resultIndex++;
                }
            }

            return result;
        }
    }
