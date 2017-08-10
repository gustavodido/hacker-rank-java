package exercises.introduction;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class IntToString {

    private static final String GOOD_JOB = "Good job";

    public void solve() {
        Scanner scanner = new Scanner(in);

        int n = scanner.nextInt();

        String s = String.valueOf(n);

        if (n == Integer.parseInt(s)) {
            out.println(GOOD_JOB);
        }
    }

}
