package simplejavacalculator;

        import org.junit.Assert;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import static java.lang.Double.NaN;

public class CalculatorTest {
    //square
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


}

