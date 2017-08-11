package exercises.strings;

import java.util.Scanner;

import static java.lang.System.out;

public class Regex {

    public void solve() {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String IP = in.nextLine();
            out.println(IP.matches(new MyRegex().pattern));
        }
    }

    // This is really bad, but it is how hacker-rank expects the result.
    private class MyRegex {
        String pattern = "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    }
}
