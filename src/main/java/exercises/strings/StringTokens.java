package exercises.strings;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Stream.of;

public class StringTokens {

    private static final String REGEX = "[ !,?\\\\._'@]+";

    public void solve() {
        Scanner scanner = new Scanner(in);

        String sentence = scanner.nextLine();

        String[] tokens = sentence
                .trim()
                .split(REGEX);

        if (tokens.length == 0 || tokens[0].isEmpty()) {
            out.println("0");
        } else {
            out.println(tokens.length);
            of(tokens).forEach(out::println);
        }
    }
}
