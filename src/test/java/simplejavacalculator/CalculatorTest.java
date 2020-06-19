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
    @Test
    public void Testing_log_1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.log, 100.0);
        Assert.assertEquals((Double) 2.0, result);
    }

}

