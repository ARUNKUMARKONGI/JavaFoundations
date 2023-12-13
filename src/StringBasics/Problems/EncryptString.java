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
            StringBuilder newName = new StringBuilder();

            for (char c : name.toString().toCharArray()) {
                if (Character.isLetter(c)) {
                    int location = alpha.indexOf(Character.toLowerCase(c));
                    char newChar = alpha.charAt((location + 1) % 26);
                    if (Character.isUpperCase(c)) {
                        newChar = Character.toUpperCase(newChar);
                    }
                    newName.append(newChar);
                } else {
                    newName.append(c);
                }
            }

            return newName;
        }
    }


