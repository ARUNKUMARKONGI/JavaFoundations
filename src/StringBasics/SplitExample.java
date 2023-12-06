package StringBasics;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");

        // Print the array of words
        System.out.println("Words in the sentence: " + Arrays.toString(words));
    }
}

