package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean isValid = false;
        if (!name.isEmpty() && !Character.isUpperCase((name.charAt(0))) && !Character.isDigit(name.charAt(0))) {
            isValid = true;
        }

        if (isValid) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isSpecialSymbol(code) || !isUpperLatinLetter(code) || !isLowerLatinLetter(code) || !Character.isDigit(code)) {
                    isValid = true;
                } else {
                    isValid = false;
                    break;
                }
            }
        }
        return isValid;
    }

    public static boolean isSpecialSymbol(int code) {
        if (code == 36 || code == 95) {
            return true;
        }
        return false;
    }

    public static boolean isUpperLatinLetter(int code) {
        if (code >= 65 && code <= 90) {
            return true;
        }
        return false;
    }

    public static boolean isLowerLatinLetter(int code) {
        if (code >= 97 && code <= 122) {
            return true;
        }
        return false;
    }
}
