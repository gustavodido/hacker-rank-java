package exercises.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class UsernameChecker {

    private static final String VALID = "Valid";
    private static final String INVALID = "Invalid";

    public void solve() {
        String pattern = PatternCreation.getPattern();
        
        Scanner scanner = new Scanner(in);
        
        int queries = Integer.parseInt(scanner.nextLine());

        range(0, queries).forEach(i -> {
            String userName = scanner.nextLine();

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(userName);

            out.println(m.find() ? VALID : INVALID);
        });
    }

    private static class PatternCreation {
        static String getPattern() {
            return "^[a-zA-z][\\w]{7,29}$";
        }
    }
}
