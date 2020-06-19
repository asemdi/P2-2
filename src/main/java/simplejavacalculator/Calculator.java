/*
 * @name        Simple Java Calculator
 * @file        Calculator.java
 * @author      SORIA Pierre-Henry
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import static java.lang.Double.NaN;
import static java.lang.Math.log10;
import static java.lang.Math.pow;

public class Calculator {

    public enum BiOperatorModes {
        /* Checks if number is normal */normal,
        /* Adds two numbers */add,
        /* Subtracts one number from another */minus,
        /* Multiplies two numbers */multiply,
        /* Divides one number by another*/divide,
        /* Calculates one number to the power of another */xpowerofy
    }
    public enum MonoOperatorModes {
        /* Calculates a number to the power of 2*/square,
        /* Calculates square root of a number */squareRoot,
        /* Calculates inverse of a number */oneDevidedBy,
        /* Calculate cos of a number */cos,
        /* Calculates sin of a number */sin,
        /* Calculates tan of a number*/tan ,
        /* Calculates log10 of a number */log ,
        /*  */rate,
        /* Calculates absolute value of a number */abs
    }

    private Double num1, /* Second number to perform calculations on */ num2;
    private  /* Specifies what calculation to perform */BiOperatorModes mode = BiOperatorModes.normal;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.normal) {
            return num2;
        }
        if (mode == BiOperatorModes.add) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.minus) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.multiply) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.divide) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.xpowerofy) {
            return pow(num1,num2);
        }

        // never reach
        throw new Error();
    }

    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;

        return NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode == MonoOperatorModes.square) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.squareRoot) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.oneDevidedBy) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.cos) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.sin) {
            return Math.sin(num);
        }
        if (newMode == MonoOperatorModes.tan) {
            if (num == 0 || num % 180 == 0) {
                return 0.0;
            }
            if (num % 90 == 0 && num % 180 != 0) {
                return NaN;
            }

            return Math.tan(num);
        }
        if (newMode == MonoOperatorModes.log) {
            return log10(num);
        }
        if (newMode == MonoOperatorModes.rate) {
           return num / 100;
        }
        if (newMode == MonoOperatorModes.abs){
            return Math.abs(num);
        }

        // never reach
        throw new Error();
    }

}
