package exercises.introduction;

import java.util.Scanner;

import static java.lang.String.format;
import static java.lang.System.in;
import static java.lang.System.out;

public class JavaStdinAndStdoutII {
    public void readAndPrintStringDoubleAndInteger() {
        Scanner scanner = new Scanner(in);

        int integerInput = scanner.nextInt();
        double doubleInput = scanner.nextDouble();

        scanner.nextLine();
        String stringInput = scanner.nextLine();

        out.println(format("String: %s", stringInput));
        out.println(format("Double: %s", doubleInput));
        out.println(format("Int: %s", integerInput));
    }
}
