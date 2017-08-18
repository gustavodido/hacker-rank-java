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

public class JavaMapTest {
    private static final String INPUT = "3\n" +
            "uncle sam\n" +
            "99912222\n" +
            "tom\n" +
            "11122222\n" +
            "harry\n" +
            "12299933\n" +
            "uncle sam\n" +
            "uncle tom\n" +
            "harry\n";

    private static final String OUTPUT = "uncle sam=99912222\n" +
            "Not found\n" +
            "harry=12299933\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        JavaMap exercise = new JavaMap();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}