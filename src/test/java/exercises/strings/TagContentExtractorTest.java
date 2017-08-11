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

public class TagContentExtractorTest {
    private static final String INPUT = "4\n" +
            "<h1>Nayeem loves counseling</h1>\n" +
            "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>\n" +
            "<Amee>safat codes like a ninja</amee>\n" +
            "<SA premium>Imtiaz has a secret crush</SA premium>\n";

    private static final String OUTPUT = "Nayeem loves counseling\n" +
            "Sanjay has no watch\n" +
            "So wait for a while\n" +
            "None\n" +
            "Imtiaz has a secret crush\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        TagContentExtractor exercise = new TagContentExtractor();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}