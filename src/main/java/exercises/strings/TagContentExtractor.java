package exercises.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class TagContentExtractor {

    private static final String PATTERN = "<(.+)>([^<>]+)</\\1>";

    public void solve() {
        Scanner scanner = new Scanner(in);

        int queries = Integer.parseInt(scanner.nextLine());

        range(0, queries).forEach(i -> {
            String sentence = scanner.nextLine();

            Pattern r = Pattern.compile(PATTERN);

            Matcher m = r.matcher(sentence);
            boolean hasValidContent = false;

            while(m.find()) {
                out.println(m.group(2));
                hasValidContent = true;
            }

            if (!hasValidContent) {
                out.println("None");
            }
        });
    }
}
