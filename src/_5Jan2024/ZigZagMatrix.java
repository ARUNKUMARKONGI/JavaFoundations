package _5Jan2024;
import java.util.Scanner;

public class ZigZagMatrix {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[][] matrix = new int[N][M];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            printZigZagOrder(matrix, N, M);
        }

        private static void printZigZagOrder(int[][] matrix, int N, int M) {
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    for (int j = 0; j < M; j++) {
                        System.out.print(matrix[i][j] + " ");
                    }
                } else {
                    for (int j = M - 1; j >= 0; j--) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
            }
        }
    }
