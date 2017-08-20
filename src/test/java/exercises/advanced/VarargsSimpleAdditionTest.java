package exercises.advanced;

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

public class VarargsSimpleAdditionTest {
    private static final String INPUT = "1\n" +
            "2\n" +
            "3\n" +
            "4\n" +
            "5\n" +
            "6\n";

    private static final String OUTPUT = "1+2=3\n" +
            "1+2+3=6\n" +
            "1+2+3+4+5=15\n" +
            "1+2+3+4+5+6=21\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        VarargsSimpleAddition exercise = new VarargsSimpleAddition();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}
