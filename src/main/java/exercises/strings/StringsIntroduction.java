package exercises.strings;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class StringsIntroduction {

    public void solve() {
        Scanner scanner = new Scanner(in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        out.println(firstWord.length() + secondWord.length());
        out.println(firstWord.compareTo(secondWord) <= 0 ? "No" : "Yes");
        out.format("%s %s\n", capitalize(firstWord), capitalize(secondWord));
    }

    private String capitalize(String word) {
        String firstLetter = word.substring(0, 1).toUpperCase();
        if (word.length() <= 1)
            return firstLetter;

        return firstLetter + word.substring(1);
    }
}
