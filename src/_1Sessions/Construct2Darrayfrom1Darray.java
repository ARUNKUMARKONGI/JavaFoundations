package _1Sessions;
import java.util.Scanner;

public class Construct2Darrayfrom1Darray {

        public static int[][] construct2DArray(int[] original, int m, int n) {
            int totalElements = m * n;

            if (original.length != totalElements) {
                return new int[0][0]; // Impossible to construct 2D array
            }

            int[][] result = new int[m][n];
            int index = 0;

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = original[index++];
                }
            }

            return result;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the size of the original array: ");
            int size = scanner.nextInt();
            int[] original = new int[size];

            System.out.println("Enter the elements of the original array:");
            for (int i = 0; i < size; i++) {
                original[i] = scanner.nextInt();
            }

            System.out.print("Enter the number of rows (m): ");
            int m = scanner.nextInt();

            System.out.print("Enter the number of columns (n): ");
            int n = scanner.nextInt();

            int[][] result = construct2DArray(original, m, n);

            if (result.length == 0) {
                System.out.println("It is impossible to construct a 2D array with the given parameters.");
            } else {
                System.out.println("Constructed 2D Array:");
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
