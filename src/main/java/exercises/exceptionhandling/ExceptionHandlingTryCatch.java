package exercises.exceptionhandling;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;

public class ExceptionHandlingTryCatch {
    public void solve() {
        Scanner scan = new Scanner(in);

        try {

            int x = parseInt(scan.next());
            int y = parseInt(scan.next());

            out.println(x / y);
        } catch(NumberFormatException nbe) {
            out.println("java.util.InputMismatchException");
        } catch (ArithmeticException ae) {
            out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
