class Main {
    public static char Met(int n, String word) {
        if (n >= 1 && n <= word.length()) {
            return word.charAt(n - 1);
        } else {
            return '\0';
        }
    }

}
class Solution {
    public static void main(String[] args) {
        Main obj = new Main();
        char result = obj.Met(7, "GRIET COLLEGE");
        System.out.println("Result: " + result);
    }
}