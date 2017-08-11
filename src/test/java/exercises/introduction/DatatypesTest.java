package exercises.introduction;

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

public class DatatypesTest {
    private static final String INPUT = "6\n" +
            "1\n" +
            "-150\n" +
            "150000\n" +
            "1500000000\n" +
            "213333333333333333333333333333333333\n" +
            "-100000000000000";

    private static final String OUTPUT = "1 can be fitted in:\n" +
            "* byte\n" +
            "* short\n" +
            "* int\n" +
            "* long\n" +
            "-150 can be fitted in:\n" +
            "* short\n" +
            "* int\n" +
            "* long\n" +
            "150000 can be fitted in:\n" +
            "* int\n" +
            "* long\n" +
            "1500000000 can be fitted in:\n" +
            "* int\n" +
            "* long\n" +
            "213333333333333333333333333333333333 can't be fitted anywhere.\n" +
            "-100000000000000 can be fitted in:\n" +
            "* long\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        Datatypes exercise = new Datatypes();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}