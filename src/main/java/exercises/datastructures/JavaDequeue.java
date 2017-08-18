package exercises.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Math.max;
import static java.lang.System.out;

public class JavaDequeue {

    public void solve() {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deck = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();

        int largest = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deck.add(num);
            set.add(num);

            if (deck.size() == m) {
                largest = max(largest, set.size());

                int first = deck.remove();
                if (!deck.contains(first)) {
                    set.remove(first);
                }
            }
        }

        out.println(largest);
    }


}
