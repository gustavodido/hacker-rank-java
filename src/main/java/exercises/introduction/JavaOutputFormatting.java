package exercises.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class JavaOutputFormatting {
    public void readFormatAndPrintTheInput() {
        Scanner scanner = new Scanner(in);

        out.println("================================");

        IntStream.range(0, 3).forEach(i -> {
            String key = scanner.next();
            int value = scanner.nextInt();

            out.format("%-15s%03d\n", key, value);
        });

        out.println("================================");
    }
}
