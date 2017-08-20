package exercises.objectoriented;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class MethodOverridingSuperTest {
    private static final String OUTPUT = "Hello I am a motorcycle, I am a cycle with an engine.\n" +
            "My ancestor is a cycle who is a vehicle with pedals.\n" ;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldSolveForFirstScenario() {
        MethodOverridingSuper exercise = new MethodOverridingSuper();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
    }

}