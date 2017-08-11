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

public class DuplicateWordsTest {
    private static final String INPUT = "5\n" +
            "Goodbye bye bye world world world\n" +
            "Sam went went to to to his business\n" +
            "Reya is is the the best player in eye eye game\n" +
            "in inthe\n" +
            "Hello hello Ab aB\n";

    private static final String OUTPUT = "Goodbye bye world\n" +
            "Sam went to his business\n" +
            "Reya is the best player in eye game\n" +
            "in inthe\n" +
            "Hello Ab\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        DuplicateWords exercise = new DuplicateWords();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}