package InputOutput;
import java.util.Scanner;

public class hasNextIntExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] values = new int[20];
        int count = 0;
        while (sc.hasNextInt() && count < 20) {
            values[count] = sc.nextInt();
            count++;
        }
        int sum = 0;
        for (int i : values) {
            sum += i;
        }
        System.out.println("Sum of the entered values: " + sum);
        sc.close();
    }
}
