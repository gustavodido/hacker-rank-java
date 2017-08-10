package exercises.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class CurrencyFormatter {

    public void solve() {
        Scanner scanner = new Scanner(in);

        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        out.println("US: " + us);
        out.println("India: " + india);
        out.println("China: " + china);
        out.println("France: " + france);
    }
}
