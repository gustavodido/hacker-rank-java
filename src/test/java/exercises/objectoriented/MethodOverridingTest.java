package exercises.objectoriented;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class MethodOverridingTest {
    private static final String OUTPUT = "Generic Sports\n" +
            "Each team has n players in Generic Sports\n" +
            "Soccer Class\n" +
            "Each team has 11 players in Soccer Class\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldSolveForFirstScenario() {
        MethodOverriding exercise = new MethodOverriding();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
    }

}