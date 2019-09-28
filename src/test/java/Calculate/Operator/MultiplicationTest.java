package Calculate.Operator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    Multiplication Multiply = new Multiplication();

    @Test
    public void subtractPositiveNumbers () {
        assertEquals(97.6, Multiply.multiply(15.25f, 6.4f),0.1);
    }

    @Test
    public void subtractNegativeNumbers () {
        assertEquals(97.6, Multiply.multiply(-15.25f, -6.4f),0.1);
    }

    @Test
    public void subtractNegativeAndPositiveNumbers () {
        assertEquals(-12.375, Multiply.multiply(-8.25f, 1.5f),0.1);
    }

    @Test
    public void subtractPositiveAndNegativeNumbers () {
        assertEquals(-7.35, Multiply.multiply(5.25f, -1.4f),0.1);
    }

    @Test
    public void subtractNullAndNegativeNumber () {
        assertEquals(0, Multiply.multiply(0, -149.75f),0.1);
    }

    @Test
    public void subtractNullAndPositiveNumber () {
        assertEquals(0, Multiply.multiply(0, 149.75f),0.1);
    }

    @Test
    public void subtractPositiveNumberAndNull () {
        assertEquals(0, Multiply.multiply(120.369f, 0),0.1);
    }

    @Test
    public void subtractNegativeNumberAndNull () {
        assertEquals(0, Multiply.multiply(-120.369f, 0),0.1);
    }

}