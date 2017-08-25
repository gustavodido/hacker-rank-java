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

public class JavaAnnotationsTest {
    private static final String INPUT = "3\n" +
            "SENIOR 75\n" +
            "JUNIOR 45\n" +
            "SENIOR 40\n";

    private static final String OUTPUT = "Senior Member\n" +
            "Spend: 75\n" +
            "Budget Left: 25\n" +
            "Junior Member\n" +
            "Spend: 45\n" +
            "Budget Left: 5\n" +
            "Senior Member\n" +
            "Spend: 40\n" +
            "Budget Left: 60\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaAnnotations exercise = new JavaAnnotations();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }

}