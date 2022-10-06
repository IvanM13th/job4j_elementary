package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (number % 3 == 0 && number % 2 == 0) {
            rsl = "the number can be divided by 6.";
        } else if (number % 3 == 0 && number % 2 != 0) {
            rsl = "the number can be divided by 3, but non even.";
        } else if (number % 3 != 0 && number % 2 == 0) {
            rsl = "the number can't be divided by 3, but even.";
        } else {
            rsl = "the number can't be divided by 3 and not even.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkNumber(24));
    }
}
