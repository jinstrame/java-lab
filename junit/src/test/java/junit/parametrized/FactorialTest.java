package junit.parametrized;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@SuppressWarnings("WeakerAccess")
@RunWith(Parameterized.class)
public class FactorialTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 1 }, { 1, 1 }, { 2, 2 }, { 3, 6 } });
    }

    @Parameter
    public int fInput;

    @Parameter(1)
    public int fExpected;

    @Test
    public void factorialTest() throws Exception {
        assertThat(Factorial.fact(fInput), is(fExpected));
    }
}