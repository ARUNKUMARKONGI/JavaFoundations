/*U need to find a factorial of given non negative integer number.

input format:
----------------
enter a non negative integer.

Output Format:
------------------
Print factorial of N.
Note: Since the result can be very large, u need to apply result % 1000000007 for every iteration.
      to overflowing the integer range. (Use long to store factorial result.)

Print appropriate error messages as given in the test cases below if user enters
any other value apart from non negative integer.

Constraints:
---------------
0 <= N <= 10^6

Test Case examples:
--------------------
Input= 7
output=
5040

input= 10
Output=
3628800

input=12
output=
479001600

input=14
output=
178290591


*/

package Loops;
import java.util.Scanner;

public class BigFact {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {
                int n = sc.nextInt();
                if (n < 0) {
                    System.out.println("Please enter a non-negative integer.");
                } else {
                    long fact = 1;
                    int i = 1;

                    while (i <= n) {
                        fact = (fact * i) % 1000000007;
                        i++;
                    }
                    System.out.println(fact);
                }
            } else {
                System.out.println("Please enter a only numbers.");
            }
        }
    }
/*10000000007 is chosen because it is close to the maximum value of a 32-bit signed integer (2^31 - 1)
intermediate results in calculations are less likely to exceed the integer range

Factorials of larger numbers can grow very quickly, and using an int data type might lead to overflow,
where the result exceeds the maximum representable value for an int.
By using a long data type, the program can handle larger results before encountering overflow.*/

