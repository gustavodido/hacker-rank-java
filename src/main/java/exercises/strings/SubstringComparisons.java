package exercises.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class SubstringComparisons {

    public void solve() {
        Scanner scanner = new Scanner(in);

        String word = scanner.nextLine();
        int length = scanner.nextInt();

        List<String> subStrings = generateSubstringList(word, length);

        String smallest = "";
        String largest = "";

        for (String substring : subStrings) {
            if (isLexicographicallySmaller(smallest, substring)) {
                smallest = substring;
            }
            if (isLexicographicallyLarger(largest, substring)) {
                largest = substring;
            }
        }

        out.println(smallest);
        out.println(largest);
    }

    private boolean isLexicographicallyLarger(String largest, String substring) {
        return largest.equals("") || substring.compareTo(largest) > 0;
    }

    private boolean isLexicographicallySmaller(String smallest, String current) {
        return smallest.equals("") || current.compareTo(smallest) <= 0;
    }

    private List<String> generateSubstringList(String word, int length) {
        List<String> subStrings = new ArrayList<>();

        for(int i = 0; i <= word.length() - length; i++) {
            subStrings.add(word.substring(i, i + length));
        }
        return subStrings;
    }
}
