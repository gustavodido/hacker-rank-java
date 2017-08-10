package exercises.introduction;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class StdinAndStdoutI {
    public void solve() {
        Scanner scanner = new Scanner(in);

        out.println(scanner.nextInt());
        out.println(scanner.nextInt());
        out.println(scanner.nextInt());
    }
}
