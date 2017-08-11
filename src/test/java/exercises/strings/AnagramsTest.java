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

public class AnagramsTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final Anagrams exercise = new Anagrams();

    private static final String ANAGRAMS = "Anagrams\n";
    private static final String NOT_ANAGRAMS = "Not Anagrams\n";

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldSolveForFirstScenario() {
        String input = "anagram\n" +
                "margana\n";

        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        setIn(inContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(ANAGRAMS);
    }

    @Test
    public void shouldSolveForSecondScenario() {
        String input = "anagram\n" +
                "marganaa\n";

        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        setIn(inContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(NOT_ANAGRAMS);
    }

    @Test
    public void shouldSolveForThirdScenario() {
        String input = "hello\n" +
                "Hello\n";

        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());
        setIn(inContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(ANAGRAMS);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}