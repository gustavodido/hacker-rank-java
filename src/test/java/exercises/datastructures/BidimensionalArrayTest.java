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

public class BidimensionalArrayTest {
    private static final String INPUT = "1 1 1 0 0 0\n" +
            "0 1 0 0 0 0\n" +
            "1 1 1 0 0 0\n" +
            "0 0 2 4 4 0\n" +
            "0 0 0 2 0 0\n" +
            "0 0 1 2 4 0\n";

    private static final String OUTPUT = "19\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(INPUT.getBytes());

    private BidimensionalArray exercise = new BidimensionalArray();

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldSolveForFirstScenario() {
        exercise.solve();

        assertThat(outContent.toString()).isEqualTo(OUTPUT);
    }

    @Test
    public void shouldSolveForThirdTestCase() {
        String thirdTestCaseInput = "-1 -1 0 -9 -2 -2\n" +
                "-2 -1 -6 -8 -2 -5\n" +
                "-1 -1 -1 -2 -3 -4\n" +
                "-1 -9 -2 -4 -4 -5\n" +
                "-7 -3 -3 -2 -9 -9\n" +
                "-1 -3 -1 -2 -4 -5\n";

        ByteArrayInputStream thirdTestCaseInContent = new ByteArrayInputStream(thirdTestCaseInput.getBytes());
        setIn(thirdTestCaseInContent);

        exercise.solve();

        assertThat(outContent.toString()).isEqualTo("-6\n");
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }
}