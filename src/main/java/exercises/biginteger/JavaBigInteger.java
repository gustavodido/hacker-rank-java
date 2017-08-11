package exercises.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class JavaBigInteger {

    public void solve() {
        Scanner scanner = new Scanner(in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        out.println(firstNumber.add(secondNumber));
        out.println(firstNumber.multiply(secondNumber));
    }
}
