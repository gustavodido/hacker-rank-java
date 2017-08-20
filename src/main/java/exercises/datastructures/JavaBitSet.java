package exercises.datastructures;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

import static java.lang.System.out;
import static java.util.stream.IntStream.range;

public class JavaBitSet {

    private static final Map<String, BiConsumer<BitSet, BitSet>> BINARY_OPS = new HashMap<String, BiConsumer<BitSet, BitSet>>() {{
        put("AND", BitSet::and);
        put("OR", BitSet::or);
        put("XOR", BitSet::xor);
    }};

    private static final Map<String, BiConsumer<BitSet, Integer>> SINGLE_OPS = new HashMap<String, BiConsumer<BitSet, Integer>>() {{
        put("FLIP", BitSet::flip);
        put("SET", BitSet::set);
    }};

    public void solve() {
        Scanner in = new Scanner(System.in);

        int length = in.nextInt();
        int operations = in.nextInt();

        BitSet[] bitSets = new BitSet[]{
                new BitSet(length),
                new BitSet(length)
        };

        in.nextLine();

        range(0, operations).forEach(i -> {
            String operation = in.next();

            int set = in.nextInt() - 1;
            int param = in.nextInt();

            if (BINARY_OPS.containsKey(operation)) {
                BINARY_OPS.get(operation).accept(bitSets[set], bitSets[param - 1]);
            } else if (SINGLE_OPS.containsKey(operation)) {
                SINGLE_OPS.get(operation).accept(bitSets[set], param);
            }

            out.format("%s %s\n", bitSets[0].cardinality(), bitSets[1].cardinality());

            in.nextLine();

        });
    }
}
