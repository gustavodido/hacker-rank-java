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

public class StringTokensTest {
    private static final String INPUT = "He is a very very good boy, isn't he?\n";

    private static final String OUTPUT = "10\n" +
            "He\n" +
            "is\n" +
            "a\n" +
            "very\n" +
            "very\n" +
            "good\n" +
            "boy\n" +
            "isn\n" +
            "t\n" +
            "he\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    private final StringTokens exercise = new StringTokens();

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
    public void shouldSolveForThirdTestCase() {
        String testLeadingSpaces = "           YES      leading spaces        are valid,    problemsetters are         evillllll\n";

        ByteArrayInputStream thirdTestCaseinContent = new ByteArrayInputStream(testLeadingSpaces.getBytes());
        setIn(thirdTestCaseinContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo("8\n" +
                "YES\n" +
                "leading\n" +
                "spaces\n" +
                "are\n" +
                "valid\n" +
                "problemsetters\n" +
                "are\n" +
                "evillllll\n");
    }

    @Test
    public void shouldSolveForNinthTestCase() {
        String testJustSpaces = "                        ";

        ByteArrayInputStream thirdTestCaseinContent = new ByteArrayInputStream(testJustSpaces.getBytes());
        setIn(thirdTestCaseinContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo("0\n");
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}