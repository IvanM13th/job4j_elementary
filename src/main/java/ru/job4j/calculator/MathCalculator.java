package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double minusAndDivision(double first, double second) {
        return minus(second, first)  + divison(second, first);
    }

    public static double summary(double first, double second) {
        return sum(first, second) + multiply(first, second) + minus(second, first) + divison(second, first);

    }

    public static void main(String[] args) {
        System.out.println("Результат суммы вычитания и деления равен " + minusAndDivision(5, 10));
        System.out.println("Сумма вычисления всех операций равна " + summary(5, 10));
    }

}
