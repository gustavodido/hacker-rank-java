package exercises.strings;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class StringReverse {

    public void solve() {
        Scanner scanner = new Scanner(in);

        String word = scanner.nextLine();

        boolean isPalindrome = true;
        for(int i = 0; i < word.length() / 2; i++) {
            char startChar = word.charAt(i);
            char endChar = word.charAt(word.length() - i - 1);

            if (startChar != endChar) {
                isPalindrome = false;
            }
        }

        out.println(isPalindrome ? "Yes" :  "No");
    }

}
