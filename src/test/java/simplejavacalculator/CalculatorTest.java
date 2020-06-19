package simplejavacalculator;

        import org.junit.Assert;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import static java.lang.Double.NaN;

public class CalculatorTest {
    //SQUARE, ONEDEVIDEDBY, COS, SIN, TAN ,LOG , RATE, ABS
    @Test
    public void Testing_SQUARE_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUARE, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    // SQUAREROOT
    @Test
    public void Testing_SQUAREROOT_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SQUAREROOT, 49.0);
        Assert.assertEquals((Double) 7.0, result);
    }
    //ONEDEVIDEDBY
    @Test
    public void Testing_ONEDEVIDEDBY_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ONEDEVIDEDBY, 2.0);
        Assert.assertEquals((Double) 0.5, result);
    }
    // COS
    @Test
    public void Testing_COS_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.COS, 0.0);
        Assert.assertEquals((Double) 1.0, result);
    }
    // SIN
    @Test
    public void Testing_SIN_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.SIN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    // TAN
    @Test
    public void Testing_TAN_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Testing_TAN_2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void Testing_TAN_3() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.TAN, 1.0);
        Assert.assertEquals((Double) 1.5574077246549023, result);
    }
    // RATE
    @Test
    public void Testing_RATE_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.RATE, 50.0);
        Assert.assertEquals((Double) 0.5, result);
    }
    // ABS
    @Test
    public void Testing_ABS_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ABS, -1.0);
        Assert.assertEquals((Double) 1.0, result);
    }
    @Test
    public void Testing_ABS_2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.ABS,  2.0);
        Assert.assertEquals((Double) 2.0, result);
    }
    // LOG
    @Test
    public void Testing_LOG_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.LOG, 100.0);
        Assert.assertEquals((Double) 2.0, result);
    }

    @Test
    public void Testing_NORMAL() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.NORMAL, 2.0);
        Assert.assertEquals((Double) NaN, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0));
    }

    @Test
    public void Testing_ADD_1() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 123.0);
        Assert.assertEquals((Double) 579.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 456.0));
    }

    @Test
    public void Testing_ADD_2() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 123.0);
        Assert.assertEquals((Double) 123.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 0.0));
    }

    @Test
    public void Testing_MINUS() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MINUS, 101.0);
        Assert.assertEquals((Double) 49.5, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 51.5));
    }

    @Test
    public void Testing_MULTIPLY() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.MULTIPLY, 3.0);
        Assert.assertEquals((Double) 12.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,4.0 ));
    }

    @Test
    public void Testing_DIVIDE() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.DIVIDE, 24.0);
        Assert.assertEquals((Double) 8.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,3.0));
    }
    @Test

    public void Testing_power() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.XPOWEROFY, 5.0);
        Assert.assertEquals((Double) 125.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,3.0));
    }

    @Test
    public void Testing_equal() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 6.4);
        c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0);
        Assert.assertEquals((Double) 11.4, c.calculateEqual(3.0));
    }
    @Test
    public void Testing_reset() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.ADD, 6.4);
        Assert.assertEquals((Double) 8.4, c.calculateBi(Calculator.BiOperatorModes.ADD, 2.0));
        Assert.assertEquals((Double) NaN, c.reset());
    }
}

