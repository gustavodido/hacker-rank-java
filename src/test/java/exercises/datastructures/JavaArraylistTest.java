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

public class JavaArraylistTest {
    private static final String INPUT = "5\n" +
            "5 41 77 74 22 44\n" +
            "1 12\n" +
            "4 37 34 36 52\n" +
            "0\n" +
            "3 20 22 33\n" +
            "5\n" +
            "1 3\n" +
            "3 4\n" +
            "3 1\n" +
            "4 3\n" +
            "5 5\n";

    private static final String OUTPUT = "74\n" +
            "52\n" +
            "37\n" +
            "ERROR!\n" +
            "ERROR!\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaArraylist exercise = new JavaArraylist();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}