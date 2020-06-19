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

/**
 * Calculator Operation that can be used.
 */
public class Calculator {

    public enum BiOperatorModes {
        /**Checks if number is NORMAL.*/
        NORMAL,
        /**ADDs two numbers.*/ADD,
        /**Subtracts one number from another.*/MINUS,
        /**Multiplies two numbers.*/MULTIPLY,
        /**Divides one number by another.*/DIVIDE,
        /**Calculates one number to the power of another.*/XPOWEROFY
    }
    public enum MonoOperatorModes {
        /**Calculates a number to the power of 2.*/
        SQUARE,
        /**Calculates SQUARE root of a number.*/
        SQUAREROOT,
        /** Calculates inverse of a number.*/
        ONEDEVIDEDBY,
        /**Calculate COS of a number.*/
        COS,
        /**Calculates SIN of a number.*/
        SIN,
        /**Calculates TAN of a number.*/
        TAN,
        /**Calculates LOG10 of a number.*/
        LOG,
        /**Calculates rate.*/
        RATE,
        /**Calculates ABSolute value of a number.*/
        ABS
    }

    /**First number to perform calculations on.*/
    private Double num1;
    /**Second number to perform calculations on.*/
    private Double num2;
    /**Operation to perform, default normal.*/
    private BiOperatorModes mode = BiOperatorModes.NORMAL;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.NORMAL) {
            return num2;
        }
        if (mode == BiOperatorModes.ADD) {
            if (num2 != 0) {
                return num1 + num2;
            }

            return num1;
        }
        if (mode == BiOperatorModes.MINUS) {
            return num1 - num2;
        }
        if (mode == BiOperatorModes.MULTIPLY) {
            return num1 * num2;
        }
        if (mode == BiOperatorModes.DIVIDE) {
            return num1 / num2;
        }
        if (mode == BiOperatorModes.XPOWEROFY) {
            return pow(num1,num2);
        }

        // never reach
        throw new RuntimeException("Should not reach");

    }

    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.NORMAL) {
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
        return calculateBi(BiOperatorModes.NORMAL, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.NORMAL;

        return NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode == MonoOperatorModes.SQUARE) {
            return num * num;
        }
        if (newMode == MonoOperatorModes.SQUAREROOT) {
            return Math.sqrt(num);
        }
        if (newMode == MonoOperatorModes.ONEDEVIDEDBY) {
            return 1 / num;
        }
        if (newMode == MonoOperatorModes.COS) {
            return Math.cos(num);
        }
        if (newMode == MonoOperatorModes.SIN) {
            return Math.sin(num);
        }
        if (newMode == MonoOperatorModes.TAN) {
            if (num == 0 || num % 180 == 0) {
                return 0.0;
            }
            if (num % 90 == 0 && num % 180 != 0) {
                return NaN;
            }

            return Math.tan(num);
        }
        if (newMode == MonoOperatorModes.LOG) {
            return log10(num);
        }
        if (newMode == MonoOperatorModes.RATE) {
           return num / 100;
        }
        if (newMode == MonoOperatorModes.ABS) {
            return Math.abs(num);
        }

        // never reach
        throw new RuntimeException("Should not reach");
        //throw new Error();
    }

}
