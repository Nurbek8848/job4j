package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int i, j;
        for (i = word.length - 1, j = post.length - 1; j > 0; i--, j--) {
            if (word[i] == post[j]) {
                result = true;
                break;
            }
        }
        return result;
    }
}
