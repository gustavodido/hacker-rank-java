package exercises.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class JavaMap {

    private static final String NOT_FOUND = "Not found";

    public void solve() {
        Scanner scan = new Scanner(in);

        int entries = parseInt(scan.nextLine());

        Map<String, String> phoneBook = new HashMap<>(entries);

        range(0, entries).forEach(i -> {
            String name = scan.nextLine();
            String phone = scan.nextLine();

            phoneBook.put(name, phone);
        });

        while (scan.hasNext()) {
            String name = scan.nextLine();

            if (phoneBook.containsKey(name)) {
                out.format("%s=%s\n", name, phoneBook.get(name));
            } else {
                out.println(NOT_FOUND);
            }
        }
    }


}
