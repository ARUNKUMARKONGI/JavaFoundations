package BasicMathProblems;

public class Gcd2 {
        public static void main(String[] args) {
            // Initialize the numbers
            int x = 12;
            int y = 8;
            int gcd = 1;
    
            for (int i = 1; i <= Math.min(x, y); i++) {
                if (x % i == 0 && y % i == 0) {
                    gcd = i;
                }
            }
    
            System.out.printf("GCD of %d and %d is: %d", x, y, gcd);
        }
}
//GCD O(min(x,y))

// Optimization: The maximum possible value for the GCD of two numbers x and y is
//  the smaller of the two numbers. If x is 12 and y is 8, the largest possible GCD can only be 8 or less. 
// Therefore, there is no need to check numbers greater than the smaller of the two numbers because they can’t possibly be a common divisor. Using Math.min(x, y) ensures that you only iterate up to the smaller of the two numbers, making the loop more efficient.