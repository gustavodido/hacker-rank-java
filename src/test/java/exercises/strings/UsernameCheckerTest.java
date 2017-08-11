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

public class UsernameCheckerTest {
    private static final String INPUT = "12\n" +
            "alpha_naheed\n" +
            "xahidbuffon\n" +
            "nagib@007\n" +
            "123Swakkhar\n" +
            "Gus\n" +
            "GustavoGustavoGustavoGustavoGustavoGustavo\n" +
            "_temp\n" +
            "a2345678\n" +
            "a234567\n" +
            "a23456789\n" +
            "a23456789012345678901234567890\n" +
            "a234567890123456789012345678901\n";

    private static final String OUTPUT = "Valid\n" +
            "Valid\n" +
            "Invalid\n" +
            "Invalid\n" +
            "Invalid\n" +
            "Invalid\n" +
            "Invalid\n" +
            "Valid\n" +
            "Invalid\n" +
            "Valid\n" +
            "Valid\n" +
            "Invalid\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        UsernameChecker exercise = new UsernameChecker();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}