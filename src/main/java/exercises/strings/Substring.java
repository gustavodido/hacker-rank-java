package exercises.strings;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Substring {

    public void solve() {
        Scanner scanner = new Scanner(in);

        String word = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        out.println(word.substring(startIndex, endIndex));
    }
}
