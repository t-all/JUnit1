import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MathTest {
    int a, b, expected;

    public MathTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Rule
    public TestRule timeout = new Timeout(100);

    @Parameterized.Parameters
    public static Collection numbers() {
        return Arrays.asList(new Object[] [] {{2, 3, 5}, {2, 9, 11}, {3, 3, 6}});
    }

    @Test
    public void add() throws InterruptedException {
//        int a = 5;
//        int b = 13;
//        int expected = 18;
        int actual = Math.add(a,b);
        assertEquals(expected, actual);
    }

    @Ignore
    @Test(expected = ArithmeticException.class)
    public void div() throws InterruptedException {
        int actual = Math.div(10,0);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}