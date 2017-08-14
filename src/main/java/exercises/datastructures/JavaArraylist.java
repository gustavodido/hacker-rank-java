package exercises.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.out;

public class JavaArraylist {

    private static final String ERROR_MESSAGE = "ERROR!";

    public void solve() {
        Scanner scan = new Scanner(System.in);


        List<List<Integer>> arrays = new ArrayList<>();

        int length = parseInt(scan.nextLine());
        for (int i = 0; i < length; i++) {
            arrays.add(readArrayInLine(scan));
        }

        scan.nextLine();
        int queries = parseInt(scan.nextLine());

        for (int i = 0; i < queries; i++) {
            int x = scan.nextInt() - 1;
            int y = scan.nextInt() - 1;

            printElementAt(arrays, x, y);

        }
    }

    private List<Integer> readArrayInLine(Scanner scan) {
        List<Integer> currentArray = new ArrayList<>();

        int currentLength = scan.nextInt();
        for (int j = 0; j < currentLength; j++) {
            currentArray.add(scan.nextInt());
        }
        return currentArray;
    }

    private void printElementAt(List<List<Integer>> arrays, int x, int y) {
        if (x < arrays.size()) {
            if (y < arrays.get(x).size()) {
                out.println(arrays.get(x).get(y));
            }
            else {
                out.println(ERROR_MESSAGE);
            }
        }
        else {
            out.println(ERROR_MESSAGE);
        }
    }
}
