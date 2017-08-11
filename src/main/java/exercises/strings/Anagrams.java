package exercises.strings;

import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Anagrams {

    public void solve() {
        Scanner scanner = new Scanner(in);

        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();

        Map<Integer, Long> firstWordFrequencies = firstWord
                .toLowerCase()
                .chars()
                .boxed()
                .collect(groupingBy(identity(), counting()));

        Map<Integer, Long> secondWordFrequencies = secondWord
                .toLowerCase()
                .chars()
                .boxed()
                .collect(groupingBy(identity(), counting()));

        out.println(firstWordFrequencies.equals(secondWordFrequencies) ?
                "Anagrams" :
                "Not Anagrams");
    }

}
