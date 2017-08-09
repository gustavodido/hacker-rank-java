package exercises.introduction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.System.in;
import static java.lang.System.out;
import static org.assertj.core.api.Assertions.assertThat;

public class JavaStdinAndStdoutITest {

    private static final String EXPECTED = "42\n100\n125\n";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayInputStream inContent = new ByteArrayInputStream(EXPECTED.getBytes());

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        System.setIn(inContent);
    }

    @Test
    public void shouldReadAndPrintThreeIntegers() throws IOException {
        JavaStdinAndStdoutI exercise = new JavaStdinAndStdoutI();

        exercise.readAndPrintThreeIntegers();

        outContent.close();
        assertThat(outContent.toString()).isEqualTo(EXPECTED);
    }

    @After
    public void tearDown() {
        System.setOut(out);
        System.setIn(in);
    }

}
