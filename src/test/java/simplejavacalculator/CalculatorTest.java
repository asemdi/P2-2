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

    @Test
    public void Testing_add() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.add, 123.0);
        Assert.assertEquals((Double) 579.0, c.calculateBi(Calculator.BiOperatorModes.normal, 456.0));
    }

    @Test
    public void Testing_minus() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.minus, 101.0);
        Assert.assertEquals((Double) 49.5, c.calculateBi(Calculator.BiOperatorModes.normal, 51.5));
    }

    @Test
    public void Testing_multiply() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.multiply, 3.0);
        Assert.assertEquals((Double) 12.0, c.calculateBi(Calculator.BiOperatorModes.normal,4.0 ));
    }

    @Test
    public void Testing_divide() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.divide, 24.0);
        Assert.assertEquals((Double) 8.0, c.calculateBi(Calculator.BiOperatorModes.normal,3.0));
    }
    @Test

    public void Testing_power() {
        Calculator c = new Calculator();
        c.calculateBi(Calculator.BiOperatorModes.xpowerofy, 5.0);
        Assert.assertEquals((Double) 125.0, c.calculateBi(Calculator.BiOperatorModes.normal,3.0));
    }
}

