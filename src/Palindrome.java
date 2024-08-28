import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sn.nextLine();

        // Flag to keep track of whether the word is a palindrome
        boolean isPalindrome = true;

        // Loop to compare characters from start and end moving towards the center
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;  // If any characters don't match, it's not a palindrome
                break;  // No need to check further
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("This word is a palindrome.");
        } else {
            System.out.println("This word is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        sn.close();
    }
}
