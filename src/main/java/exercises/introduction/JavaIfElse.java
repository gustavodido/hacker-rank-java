package exercises.introduction;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class JavaIfElse {
    private static final String WEIRD = "Weird";
    private static final String NOT_WEIRD = "Not Weird";

    public void readAndPrintWeirdNotWeird() {
        Scanner scanner = new Scanner(in);

        int number = scanner.nextInt();
        if (isOdd(number)) {
            out.println(WEIRD);
        } else {
            if (isInRange(number, 2, 5)) {
                out.println(NOT_WEIRD);
            } else if (isInRange(number, 6, 20)) {
                out.println(WEIRD);
            } else {
                out.println(NOT_WEIRD);
            }
        }
    }

    private boolean isInRange(int number, int from, int to) {
        return number >= from && number <= to;
    }

    private boolean isOdd(int number) {
        return number % 2 == 1;
    }
}
