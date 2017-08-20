package exercises.exceptionhandling;

import java.util.Scanner;

import static java.lang.Math.pow;

public class ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public void solve() {
        // Given Code
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    static class MyCalculator {
        int power(int n, int p) throws Exception {
            if (n < 0 || p < 0) throw new Exception("n or p should not be negative.");
            if (n == 0 && p == 0) throw new Exception("n and p should not be zero.");

            return (int) pow(n , p);
        }
    }
}
