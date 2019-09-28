package Calculate.Operator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    Addition Add = new Addition();

    @Test
    public void addPositiveNumbers () {
        assertEquals(200, Add.add(156.25f, 43.75f),0);
    }

    @Test
    public void addNegativeNumbers () {
        assertEquals(-200, Add.add(-156.25f, -43.75f),0);
    }

    @Test
    public void addNegativeAndPositiveNumbers () {
        assertEquals(-500, Add.add(-531.75f, 31.75f),0);
    }

    @Test
    public void addPositiveAndNegativeNumbers () {
        assertEquals(-100, Add.add(50.25f, -150.25f),0);
    }

    @Test
    public void addNullAndNegativeNumber () {
        assertEquals(-149.75, Add.add(0, -149.75f),0);
    }

    @Test
    public void addNullAndPositiveNumber () {
        assertEquals(149.75, Add.add(0, 149.75f),0);
    }

    @Test
    public void addPositiveNumberAndNull () {
        assertEquals(120.369, Add.add(120.369f, 0),0.00001);
    }

    @Test
    public void addNegativeNumberAndNull () {
        assertEquals(-120.369, Add.add(-120.369f, 0),0.00001);
    }
}