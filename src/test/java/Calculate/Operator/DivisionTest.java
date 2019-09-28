package Calculate.Operator;

import Calculate.DivNullException;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    Division Div = new Division();

    @Test
    public void subtractPositiveNumbers() throws DivNullException {
        assertEquals(30.5, Div.div(15.25f, 0.5f),0.1);
    }

    @Test
    public void subtractNegativeNumbers () throws DivNullException {
        assertEquals(-30.5, Div.div(-15.25f, 0.5f),0.1);
    }

    @Test
    public void subtractNegativeAndPositiveNumbers () throws DivNullException {
        assertEquals(-30.5, Div.div(-15.25f, 0.5f),0.1);
    }

    @Test
    public void subtractPositiveAndNegativeNumbers () throws DivNullException {
        assertEquals(-30.5, Div.div(15.25f, -0.5f),0.1);
    }

    @Test
    public void subtractNullAndNegativeNumber () throws DivNullException {
        assertEquals(0, Div.div(0, -149.75f),0.1);
    }

    @Test
    public void subtractNullAndPositiveNumber () throws DivNullException {
        assertEquals(0, Div.div(0, 149.75f),0.1);
    }

    @Test(expected = DivNullException.class)
    public void subtractPositiveNumberAndNull () throws DivNullException {
        assertEquals(0, Div.div(120.369f, 0),0.1);
    }

    @Test (expected = DivNullException.class)
    public void subtractNegativeNumberAndNull () throws DivNullException {
        assertEquals(0, Div.div(-120.369f, 0),0.1);
    }

}