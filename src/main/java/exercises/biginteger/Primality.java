package exercises.biginteger;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Primality {

    public void solve() {
        Scanner scanner = new Scanner(in);
        BigInteger number = scanner.nextBigInteger();
        out.println(number.isProbablePrime(1) ? "prime" : "not prime");
    }
}
