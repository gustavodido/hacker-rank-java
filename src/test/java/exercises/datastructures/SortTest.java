package exercises.datastructures;

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

public class SortTest {
    private static final String INPUT = "5\n" +
            "33 Rumpa 3.68\n" +
            "85 Ashis 3.85\n" +
            "56 Samiha 3.75\n" +
            "19 Samara 3.75\n" +
            "22 Fahim 3.76\n";

    private static final String OUTPUT = "Ashis\n" +
            "Fahim\n" +
            "Samara\n" +
            "Samiha\n" +
            "Rumpa\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        Sort exercise = new Sort();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}