package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (allequal(first, second, third)) {
            return third;
        }
        if (first >= second && first >= third) {
            result = first;
        }
        if (second >= first && second >= third) {
            result = second;
        }
        return result;
    }

    private static boolean allequal(int first, int second, int third) {
        return first == second && first == third;
    }
}