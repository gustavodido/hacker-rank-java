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

public class JavaStdinAndStdoutITest {

    private static final String EXPECTED = "42\n100\n125\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(EXPECTED.getBytes());

    @Before
    public void setUp() {
        setOut(new PrintStream(outContent));
        setIn(inContent);
    }

    @Test
    public void shouldReadAndPrintThreeIntegers()  {
        JavaStdinAndStdoutI exercise = new JavaStdinAndStdoutI();

        exercise.readAndPrintThreeIntegers();

        assertThat(outContent.toString()).isEqualTo(EXPECTED);
    }

    @After
    public void tearDown() {
        setOut(out);
        setIn(in);
    }

}
