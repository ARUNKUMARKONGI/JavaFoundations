package _3Jan2024;


import java.util.Scanner;

public class UniqueElements {

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
        int[] countArray = new int[1000000];
        for (int num : array) {
            countArray[num]++;
        }
        for (int num : array) {
            if (countArray[num] == 1) {
                System.out.print(num + " ");
            }
            else
                System.out.println("No Unique Element");
        }
    }
}
