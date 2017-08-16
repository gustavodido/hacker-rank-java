package exercises.datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class GenericsTest {
    private static final String OUTPUT = "1\n" +
            "2\n" +
            "3\n" +
            "Hello\n" +
            "World\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldSolveForFirstScenario() {
        Generics exercise = new Generics();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
    }

}