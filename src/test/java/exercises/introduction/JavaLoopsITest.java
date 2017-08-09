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

public class JavaLoopsITest {
    private static final String INPUT = "2";

    private static final String OUTPUT =
            "2 x 1 = 2\n" +
            "2 x 2 = 4\n" +
            "2 x 3 = 6\n" +
            "2 x 4 = 8\n" +
            "2 x 5 = 10\n" +
            "2 x 6 = 12\n" +
            "2 x 7 = 14\n" +
            "2 x 8 = 16\n" +
            "2 x 9 = 18\n" +
            "2 x 10 = 20\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldPrintMultiplesForInput() {
        JavaLoopsI exercise = new JavaLoopsI();

        exercise.printMultiplesForInput();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}