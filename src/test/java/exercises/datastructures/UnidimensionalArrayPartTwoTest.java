package exercises.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

@SuppressWarnings("Duplicates")
public class UnidimensionalArrayPartTwoTest {
    private static final String INPUT = "5\n" +
            "5 3\n" +
            "0 0 0 0 0\n" +
            "6 5\n" +
            "0 0 0 1 1 1\n" +
            "6 3\n" +
            "0 0 1 1 1 0\n" +
            "3 1\n" +
            "0 1 0\n" +
            "9 4\n" +
            "0 1 1 0 0 1 0 0 1\n";

    private static final String OUTPUT = "YES\n" +
            "YES\n" +
            "NO\n" +
            "NO\n" +
            "YES\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    private UnidimensionalArrayPartTwo exercise = new UnidimensionalArrayPartTwo();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @Test
    public void shouldSolveForFifthTestCase() throws FileNotFoundException {
        String input = "3\n" +
                "11 5\n" +
                "0 1 1 1 0 0 0 0 0 0 1\n" +
                "11 5\n" +
                "0 1 1 1 0 0 1 1 1 0 1\n" +
                "11 5\n" +
                "0 1 1 1 1 0 1 1 1 0 1\n";

        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());

        setIn(inContent);

        exercise.solve();

        String output = "YES\n" +
                "YES\n" +
                "NO\n";

        setOut(new PrintStream(output));

        assertThat(outContent.toString()).isEqualTo(output);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}