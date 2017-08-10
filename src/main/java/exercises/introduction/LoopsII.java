package exercises.introduction;

import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Math.pow;
import static java.lang.System.in;
import static java.lang.System.out;

public class LoopsII {
    public void solve() {
        Scanner scanner = new Scanner(in);

        int queries = scanner.nextInt();

        IntStream.range(0, queries).forEach(i -> {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            IntStream.range(0, n)
                    .boxed()
                    .reduce(a, (accumulator, current) -> {
                        final int sum = accumulator + (int)pow(2, current) * b;

                        out.format(current == 0 ? "%s" : " %s", sum);
                        return sum;
                    });

            out.println();
        });
    }
}
