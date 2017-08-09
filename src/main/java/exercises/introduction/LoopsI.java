package exercises.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class LoopsI {
    public void printMultiplesForInput() {
        Scanner scanner = new Scanner(in);

        int giveNumber = scanner.nextInt();

        IntStream.rangeClosed(1, 10).forEach(i -> {
            out.format("%d x %d = %d\n", giveNumber, i, giveNumber * i);
        });
    }
}
