package Problems;
import java.util.Scanner;
import java.util.Scanner;
public class LargestPowerof3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = findLargestPowerOf3(num);
        System.out.println("The largest power of 3 less than " + num + " is: " + result);
    }

    private static int findLargestPowerOf3(int num) {
        int power = 0;
        int base = 3;

        while (Math.pow(base, power) < num) {
            power++;
        }
        return (int) Math.pow(base, power - 1);
    }
}

 /* int power = (int) (Math.log(num) / Math.log(3));
        return (int) Math.pow(3, power);*/