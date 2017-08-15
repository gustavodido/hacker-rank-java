package exercises.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

public class JavaList {

    private static final String INSERT_COMMAND = "Insert";

    public void solve() {
        Scanner scan = new Scanner(in);

        int length = parseInt(scan.nextLine());

        List<Integer> list = new ArrayList<>(length);

        range(0, length).forEach(i -> list.add(scan.nextInt()));
        scan.nextLine();

        int queries = parseInt(scan.nextLine());

        range(0, queries).forEach(i -> processQuery(scan, list));

        out.println(list.stream()
                .map(Object::toString)
                .collect(joining(" ")));
    }

    private void processQuery(Scanner scan, List<Integer> list) {
        String command = scan.nextLine();
        int index = scan.nextInt();

        if (command.equals(INSERT_COMMAND)) {
            int value = scan.nextInt();
            list.add(index, value);
        } else {
            list.remove(index);
        }

        if (scan.hasNextLine()) {
            scan.nextLine();
        }
    }
}
