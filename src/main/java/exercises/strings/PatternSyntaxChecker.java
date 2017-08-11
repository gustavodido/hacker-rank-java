package exercises.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class PatternSyntaxChecker {

    private static final String VALID = "Valid";
    private static final String INVALID = "Invalid";

    public void solve() {
        Scanner scanner = new Scanner(in);

        int queries = Integer.parseInt(scanner.nextLine());

        range(0, queries)
                .forEach(i -> {
                    String pattern = scanner.nextLine();

                    try {
                        Pattern.compile(pattern);
                        out.println(VALID);
                    } catch (PatternSyntaxException e) {
                        out.println(INVALID);
                    }
                });
    }
}
