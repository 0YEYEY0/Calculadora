package com.example.calculadora;
public class ExpressionNode {
    private String operator;
    private double value;
    private ExpressionNode left;
    private ExpressionNode right;

    public ExpressionNode(String operator) {
        this.operator = operator;
    }

    public ExpressionNode(double value) {
        this.value = value;
    }

    public double evaluate() {
        if (operator == null) {
            return value;
        } else {
            double leftValue = left.evaluate();
            double rightValue = right.evaluate();
            switch (operator) {
                case "+":
                    return leftValue + rightValue;
                case "-":
                    return leftValue - rightValue;
                case "*":
                    return leftValue * rightValue;
                case "/":
                    if (rightValue != 0) {
                        return leftValue / rightValue;
                    } else {
                        // Manejo de división por cero
                        return Double.NaN;
                    }
                case "%":
                    if (rightValue != 0) {
                        return leftValue % rightValue;
                    } else {
                        // Manejo de módulo por cero
                        return Double.NaN;
                    }
                case "**":
                    return Math.pow(leftValue, rightValue);
                case "and":
                    return (leftValue != 0 && rightValue != 0) ? 1 : 0;
                case "or":
                    return (leftValue != 0 || rightValue != 0) ? 1 : 0;
                case "not":
                    return (rightValue == 0) ? 1 : 0;
                case "xor":
                    return (leftValue != rightValue) ? 1 : 0;
                default:
                    return 0;
            }
        }
    }
}


