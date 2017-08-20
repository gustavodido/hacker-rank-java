package exercises.exceptionhandling;

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

public class ExceptionHandlingTest {
    private static final String INPUT = "3 5\n" +
            "2 4\n" +
            "0 0\n" +
            "-1 -2\n" +
            "-1 3\n";

    private static final String OUTPUT = "243\n" +
            "16\n" +
            "java.lang.Exception: n and p should not be zero.\n" +
            "java.lang.Exception: n or p should not be negative.\n" +
            "java.lang.Exception: n or p should not be negative.\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        ExceptionHandling exercise = new ExceptionHandling();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }

}