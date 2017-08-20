package exercises.exceptionhandling;

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

public class ExceptionHandlingTryCatchTest {

    @Test
    public void shouldSolveForFirstScenario() {
        final String input = "10\n3\n";
        final String output = "3\n";

        testExerciseFor(input, output);
    }

    @Test
    public void shouldSolveForSecondScenario() {
        final String input = "10\nHello\n";
        final String output = "java.util.InputMismatchException\n";

        testExerciseFor(input, output);
    }

    @Test
    public void shouldSolveForThirdScenario() {
        final String input = "10\n0\n";
        final String output = "java.lang.ArithmeticException: / by zero\n";

        testExerciseFor(input, output);
    }

    @Test
    public void shouldSolveForForthScenario() {
        final String input = "23.323\n0\n";
        final String output = "java.util.InputMismatchException\n";

        testExerciseFor(input, output);
    }

    private void testExerciseFor(String input, String output) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ByteArrayInputStream inContent = new ByteArrayInputStream(input.getBytes());

        setOut(new PrintStream(outContent));
        setIn(inContent);

        ExceptionHandlingTryCatch exercise = new ExceptionHandlingTryCatch();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(output);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }

}