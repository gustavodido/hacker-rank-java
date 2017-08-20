package exercises.advanced;

import org.junit.After;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.System.setIn;
import static java.lang.System.setOut;
import static org.assertj.core.api.Assertions.assertThat;

public class FactoryPatternTest {

    @Test
    public void shouldSolveForFirstScenario() {
        final String input = "cake\n";
        final String output = "The factory returned class exercises.advanced.FactoryPattern$Cake\n" +
                "Someone ordered a Dessert!\n";

        testExerciseFor(input, output);
    }

    @Test
    public void shouldSolveForSecondScenario() {
        final String input = "pizza\n";
        final String output = "The factory returned class exercises.advanced.FactoryPattern$Pizza\n" +
                "Someone ordered a Fast Food!\n";

        testExerciseFor(input, output);
    }

    private void testExerciseFor(String input, String output) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());

        setOut(new PrintStream(outContent));
        setIn(inContent);

        FactoryPattern exercise = new FactoryPattern();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(output);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }

}