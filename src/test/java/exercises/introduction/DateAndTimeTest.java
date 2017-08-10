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

public class DateAndTimeTest {
    private static final String INPUT = "08 05 2015\n";
    private static final String OUTPUT = "WEDNESDAY\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldPrintMultiplesForInput() {
        DateAndTime exercise = new DateAndTime();

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}