package _3Jan2024;
import java.util.Scanner;
public class TrailingZeroes {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                int s = 0;
                while (n > 0) {
                    s = s + (n / 5);
                    n = n / 5;
                }
                System.out.println(s);
            }
        }

//This is because every multiple of 5 contributes one trailing zero,
// and the loop counts how many multiples of 5 are present in the factorial.
