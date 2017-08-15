package exercises.datastructures;

import java.util.HashSet;
import java.util.Scanner;

import static java.lang.System.out;

public class JavaHashset {

    public static final String DUMMY_SEPARATOR = "dummy";

    public void solve() {
        // Given code

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        // Custom code

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + DUMMY_SEPARATOR +  pair_right[i]);
            out.println(set.size());
        }
    }

}
