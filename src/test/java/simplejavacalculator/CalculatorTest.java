package simplejavacalculator;

        import org.junit.Assert;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import static java.lang.Double.NaN;

public class CalculatorTest {
    //square, oneDevidedBy, cos, sin, tan ,log , rate, abs
    @Test
    public void Testing_square_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.square, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    // squareRoot
    @Test
    public void Testing_squareRoot_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.squareRoot, 49.0);
        Assert.assertEquals((Double) 7.0, result);
    }
    //oneDevidedBy
    @Test
    public void Testing_oneDevidedBy_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.oneDevidedBy, 2.0);
        Assert.assertEquals((Double) 0.5, result);
    }
    // cos
    @Test
    public void Testing_cos_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.cos, 0.0);
        Assert.assertEquals((Double) 1.0, result);
    }
    // sin
    @Test
    public void Testing_sin_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.sin, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    // tan
    @Test
    public void Testing_tan_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, 0.0);
        Assert.assertEquals((Double) 0.0, result);
    }
    @Test
    public void Testing_tan_2() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, 90.0);
        Assert.assertEquals((Double) NaN, result);
    }
    @Test
    public void Testing_tan_3() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.tan, 1.0);
        Assert.assertEquals((Double) 1.5574077246549023, result);
    }
    // rate
    @Test
    public void Testing_rate_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.rate, 50.0);
        Assert.assertEquals((Double) 0.5, result);
    }
    // abs
    @Test
    public void Testing_abs_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.abs, -1.0);
        Assert.assertEquals((Double) 1.0, result);
    }
    // log
    @Test
    public void Testing_log_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.log, 100.0);
        Assert.assertEquals((Double) 2.0, result);
    }

    @Test
    public void Testing_NORMAL() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.NORMAL, 2.0);
        Assert.assertEquals((Double) NaN, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 3.0));
    }

    @Test
    public void Testing_add_1() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 123.0);
        Assert.assertEquals((Double) 579.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 456.0));
    }

    @Test
    public void Testing_add_2() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 123.0);
        Assert.assertEquals((Double) 123.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 0.0));
    }

    @Test
    public void Testing_minus() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.minus, 101.0);
        Assert.assertEquals((Double) 49.5, c.calculateBi(Calculator.BiOperatorModes.NORMAL, 51.5));
    }

    @Test
    public void Testing_multiply() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.multiply, 3.0);
        Assert.assertEquals((Double) 12.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,4.0 ));
    }

    @Test
    public void Testing_divide() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.divide, 24.0);
        Assert.assertEquals((Double) 8.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,3.0));
    }
    @Test

    public void Testing_power() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.xpowerofy, 5.0);
        Assert.assertEquals((Double) 125.0, c.calculateBi(Calculator.BiOperatorModes.NORMAL,3.0));
    }

    @Test
    public void Testing_equal() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 6.4);
        c.calculateBi(Calculator.BiOperatorModes.add, 2.0);
        Assert.assertEquals((Double) 11.4, c.calculateEqual(3.0));
    }
    @Test
    public void Testing_reset() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 6.4);
        Assert.assertEquals((Double) 8.4, c.calculateBi(Calculator.BiOperatorModes.add, 2.0));
        Assert.assertEquals((Double) NaN, c.reset());
    }
}

