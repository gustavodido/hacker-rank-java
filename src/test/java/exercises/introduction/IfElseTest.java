package exercises.introduction;

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

public class IfElseTest {

    private static final String WEIRD = "Weird\n";
    private static final String NOT_WEIRD = "Not Weird\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private final IfElse exercise = new IfElse();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintWeirdIfNumberIsOdd()  {
        setIn(new ByteArrayInputStream("3".getBytes()));

        exercise.readAndPrintWeirdNotWeird();

        assertThat(outContent.toString()).isEqualTo(WEIRD);
    }

    @Test
    public void shouldPrintNotWeirdIfNumberIsEvenAndBetween2And5()  {
        setIn(new ByteArrayInputStream("2".getBytes()));

        exercise.readAndPrintWeirdNotWeird();

        assertThat(outContent.toString()).isEqualTo(NOT_WEIRD);
    }

    @Test
    public void shouldPrintWeirdIfNumberIsEvenAndBetween6And20()  {
        setIn(new ByteArrayInputStream("6".getBytes()));

        exercise.readAndPrintWeirdNotWeird();

        assertThat(outContent.toString()).isEqualTo(WEIRD);
    }

    @Test
    public void shouldPrintNotWeirdIfNumberIsGreaterThan20()  {
        setIn(new ByteArrayInputStream("22".getBytes()));

        exercise.readAndPrintWeirdNotWeird();

        assertThat(outContent.toString()).isEqualTo(NOT_WEIRD);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}