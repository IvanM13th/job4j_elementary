package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int postLength = post.length;
        int indexStart = word.length - postLength;
        int indexPost = 0;
        for (int index = indexStart; index < word.length; index++) {
             if (word[index] != post[indexPost]) {
                 result = false;
             }
             indexPost++;
        }
        return result;
    }
}
