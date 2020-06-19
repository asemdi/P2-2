package simplejavacalculator;

        import org.junit.Assert;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import static java.lang.Double.NaN;

public class CalculatorTest {
    @Test
    public void Testing0() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.square, 5.0);
        Assert.assertEquals((Double) 25.0, result);
    }
    @Test
    public void Testing1() {
        Calculator c = new Calculator();
        Double result = c.calculateMono(Calculator.MonoOperatorModes.log, 100.0);
        Assert.assertEquals((Double) 2.0, result);
    }

}

