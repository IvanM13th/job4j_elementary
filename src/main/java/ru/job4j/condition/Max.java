package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int first, int second, int third) {
        int max = first;
        if (first < max(second, third)) {
            max = max(second, third);
        }
        return max;
    }

    public static int max(int first, int second, int third, int fourth) {
        int max = first;
        if (first < max(second, third, fourth)) {
            max = max(second, third, fourth);
        }
        return max;
    }
}


