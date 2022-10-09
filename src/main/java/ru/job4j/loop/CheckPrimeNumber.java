package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean primeNumber = number > 1;
        for (int index = 2; index < number; index++) {
          if ((number % index) == 0) {
               primeNumber = false;
               break;
          }
        }
        return primeNumber;
    }
}
