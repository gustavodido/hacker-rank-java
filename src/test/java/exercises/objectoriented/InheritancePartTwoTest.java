package exercises.objectoriented;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class InheritancePartTwoTest {
    private static final String OUTPUT = "My superclass is: exercises.objectoriented.InheritancePartTwo$Arithmetic\n" +
            "42 13 20\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldSolveForFirstScenario() {
        InheritancePartTwo exercise = new InheritancePartTwo();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
    }

}