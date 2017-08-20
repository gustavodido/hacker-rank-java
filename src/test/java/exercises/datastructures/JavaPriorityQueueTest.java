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

public class JavaPriorityQueueTest {
    private static final String INPUT = "12\n" +
            "ENTER John 3.75 50\n" +
            "ENTER Mark 3.8 24\n" +
            "ENTER Shafaet 3.7 35\n" +
            "SERVED\n" +
            "SERVED\n" +
            "ENTER Samiha 3.85 36\n" +
            "SERVED\n" +
            "ENTER Ashley 3.9 42\n" +
            "ENTER Maria 3.6 46\n" +
            "ENTER Anik 3.95 49\n" +
            "ENTER Dan 3.95 50\n" +
            "SERVED\n";

    private static final String OUTPUT = "Dan\n" +
            "Ashley\n" +
            "Shafaet\n" +
            "Maria\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaPriorityQueue exercise = new JavaPriorityQueue();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}