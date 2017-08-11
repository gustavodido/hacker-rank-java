package exercises.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.regex.Pattern.CASE_INSENSITIVE;
import static java.util.stream.IntStream.range;

public class DuplicateWords {

    public void solve() {
        Scanner scanner = new Scanner(in);
        int queries = Integer.parseInt(scanner.nextLine());

        Pattern regexp = Pattern.compile("(\\b\\w+\\b)(\\s*\\1\\b)+", CASE_INSENSITIVE);

        range(0, queries).forEach(i -> {
            String sentence = scanner.nextLine();

            Matcher matcher = regexp.matcher(sentence);

            while (matcher.find()) {
                sentence = sentence.replaceAll(matcher.group(), matcher.group(1));
            }

            out.println(sentence);
        });
    }
}
