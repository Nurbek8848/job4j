package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class EndsWithTest {
    @Test
    public void  whenEndWithPrefixThenTrue() {
        char[] inWord = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] inPost = new char[] {'l', 'o'};
        boolean out = EndsWith.endsWith(inWord, inPost);
        assertThat(out, is(true));
    }
    @Test
    public void  whenNotEndWithPrefixThenFalse() {
        char[] inWord = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] inPost = new char[] {'l', 'a'};
        boolean out = EndsWith.endsWith(inWord, inPost);
        assertThat(out, is(false));
    }
}
