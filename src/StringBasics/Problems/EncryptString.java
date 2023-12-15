package StringBasics.Problems;
import java.util.Scanner;
public class EncryptString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //System.out.println("Enter a name: ");
            String name = scanner.nextLine().trim();

            StringBuilder result = encryptName(new StringBuilder(name));
            System.out.println(result);

            scanner.close();
        }

        private static StringBuilder encryptName(StringBuilder name) {
            String alpha = "abcdefghijklmnopqrstuvwxyz";
            StringBuilder str = new StringBuilder();

            for (char c : name.toString().toCharArray()) {
                if (Character.isLetter(c)) {
                    int loc = alpha.indexOf(Character.toLowerCase(c));
                    char ch = alpha.charAt((loc + 1) % 26);
                    if (Character.isUpperCase(c)) {
                        ch = Character.toUpperCase(ch);
                    }
                    str.append(ch);
                } else {
                    str.append(c);
                }
            }
            return str;
        }
    }


