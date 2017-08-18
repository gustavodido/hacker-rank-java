package exercises.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class JavaBitSetTest {
    private static final String INPUT = "5 4\n" +
            "AND 1 2\n" +
            "SET 1 4\n" +
            "FLIP 2 2\n" +
            "OR 2 1\n";

    private static final String OUTPUT = "0 0\n" +
            "1 0\n" +
            "1 1\n" +
            "1 2\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaBitSet exercise = new JavaBitSet();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}