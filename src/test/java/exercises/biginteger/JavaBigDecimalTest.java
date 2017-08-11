package exercises.biginteger;

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

public class JavaBigDecimalTest {
    private static final String INPUT = "9\n" +
            "-100\n" +
            "50\n" +
            "0\n" +
            "56.6\n" +
            "90\n" +
            "0.12\n" +
            ".12\n" +
            "02.34\n" +
            "000.000\n";

    private static final String OUTPUT = "90\n" +
            "56.6\n" +
            "50\n" +
            "02.34\n" +
            "0.12\n" +
            ".12\n" +
            "0\n" +
            "000.000\n" +
            "-100\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaBigDecimal exercise = new JavaBigDecimal();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}