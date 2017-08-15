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

public class JavaStackTest {
    private static final String INPUT = "{}()\n" +
            "({()})\n" +
            "{}(\n" +
            "[]\n" +
            "]\n" +
            "[\n" +
            "{{{}[]}()}";

    private static final String OUTPUT = "true\n" +
            "true\n" +
            "false\n" +
            "true\n" +
            "false\n" +
            "false\n" +
            "true\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaStack exercise = new JavaStack();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}