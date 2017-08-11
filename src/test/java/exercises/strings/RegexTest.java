package exercises.strings;

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

public class RegexTest {
    private static final String INPUT = "000.12.12.034\n" +
            "121.234.12.12\n" +
            "23.45.12.56\n" +
            "00.12.123.123123.123\n" +
            "122.23\n" +
            "Hello.IP\n";

    private static final String OUTPUT = "true\n" +
            "true\n" +
            "true\n" +
            "false\n" +
            "false\n" +
            "false\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    private final Regex exercise = new Regex();;

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
    public void shouldSolveForSecondTestCase() {
        String secondTestInput = "12.12.12.12\n" +
                "13.13.13.112\n" +
                "VUUT.12.12\n" +
                "111.111.11.111\n" +
                "1.1.1.1.1.1.1\n" +
                ".....\n" +
                "1...1..1..1\n" +
                "0.0.0.0\n" +
                "255.0.255.0\n" +
                "266.266.266.266\n" +
                "00000.000000.0000000.00001\n" +
                "0023.0012.0012.0034";

        ByteArrayInputStream secondTestCaseinContent = new ByteArrayInputStream(secondTestInput.getBytes());
        setIn(secondTestCaseinContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo("true\n" +
                "true\n" +
                "false\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false\n" +
                "true\n" +
                "true\n" +
                "false\n" +
                "false\n" +
                "false\n");
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}