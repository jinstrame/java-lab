package junit.parametrized;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class MulDivTest {
    @Test
    public void mul() throws Exception {
        assertThat(MulDiv.mul(5,5), is(25));
    }


    @Ignore
    @Test
    public void div() throws Exception {
        assertThat(MulDiv.div(25,5), is(5));
    }

}