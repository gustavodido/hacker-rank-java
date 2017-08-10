package exercises.introduction;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class Datatypes {

    public void printIntegerDataTypeToHoldValues() {
        Scanner scanner = new Scanner(in);

        int queries = scanner.nextInt();

        IntStream.range(0, queries).forEach(i -> {
            try {
                long longValue = scanner.nextLong();
                out.format("%s can be fitted in:\n", longValue);

                if (isInRange(longValue, Byte.MIN_VALUE, Byte.MAX_VALUE)) {
                    out.println("* byte");
                }
                if (isInRange(longValue, Short.MIN_VALUE, Short.MAX_VALUE)) {
                    out.println("* short");
                }
                if (isInRange(longValue, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                    out.println("* int");
                }
                if (isInRange(longValue, Long.MIN_VALUE, Long.MAX_VALUE)) {
                    out.println("* long");
                }
            } catch(InputMismatchException e) {
                out.format("%s can't be fitted anywhere.\n", scanner.next());
            }
        });
    }

    private boolean isInRange(long longValue, long minValue, long maxValue) {
        return longValue >= minValue && longValue <= maxValue;
    }
}
