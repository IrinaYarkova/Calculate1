package Calculate.Operator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    Subtraction Sub = new Subtraction();

    @Test
    public void subtractPositiveNumbers () {

        assertEquals(100, Sub.subtract(156.25f, 56.25f),0);
    }

    @Test
    public void subtractNegativeNumbers () {
        assertEquals(-100, Sub.subtract(-156.25f, -56.25f),0);
    }

    @Test
    public void subtractNegativeAndPositiveNumbers () {
        assertEquals(-600, Sub.subtract(-568.25f, 31.75f),0);
    }

    @Test
    public void subtractPositiveAndNegativeNumbers () {
        assertEquals(200, Sub.subtract(50.25f, -149.75f),0);
    }

    @Test
    public void subtractNullAndNegativeNumber () {
        assertEquals(149.75, Sub.subtract(0, -149.75f),0);
    }

    @Test
    public void subtractNullAndPositiveNumber () {
        assertEquals(-149.75, Sub.subtract(0, 149.75f),0);
    }

    @Test
    public void subtractPositiveNumberAndNull () {
        assertEquals(120.369, Sub.subtract(120.369f, 0),0.00001);
    }

    @Test
    public void subtractNegativeNumberAndNull () {
        assertEquals(-120.369, Sub.subtract(-120.369f, 0),0.00001);
    }
}