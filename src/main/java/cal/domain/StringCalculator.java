package cal.domain;

import cal.domain.Operator;

import java.util.Map;
import java.util.TreeMap;

public class StringCalculator {
    private static final Map<String, Operator<Double, Double, Double>> OPERATORS = new TreeMap<>();

    static {
        OPERATORS.put("+", (num1, num2) -> num1 + num2);
        OPERATORS.put("-", (num1, num2) -> num1 - num2);
        OPERATORS.put("*", (num1, num2) -> num1 * num2);
        OPERATORS.put("/", (num1, num2) -> num1 / num2);
    }

    public static double calculate(String operator, double num1, double num2){
        return OPERATORS.get(operator).calculate(num1, num2);
    }
}
