package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void check() {
        ArrayChar arrayChar = new ArrayChar();
        char[] inWord = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] inPref = new char[] {'H', 'e'};
        boolean result = arrayChar.startsWith(inWord, inPref);
        assertThat(result, is (true));
    }
    @Test
    public void check1() {
        ArrayChar arrayChar = new ArrayChar();
        char[] inWord = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] inPref = new char[] {'H', 'e', 'i'};
        boolean result = arrayChar.startsWith(inWord, inPref);
        assertThat(result, is (false));
    }
    @Test
    public void check2() {
        ArrayChar arrayChar = new ArrayChar();
        char[] inWord = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] inPref = new char[] {'h', 'e', 'l', 'l', 'o'};
        boolean result = arrayChar.startsWith(inWord, inPref);
        assertThat(result, is (false));
    }
}
