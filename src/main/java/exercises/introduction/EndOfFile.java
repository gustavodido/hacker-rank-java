package exercises.introduction;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class EndOfFile {

    public void readLinesAndPrintUntilEOF() {
        Scanner scanner = new Scanner(in);

        int currentLine = 1;
        while(scanner.hasNextLine()) {
            out.format("%d %s\n", currentLine, scanner.nextLine());
            currentLine++;
        }
    }

}
