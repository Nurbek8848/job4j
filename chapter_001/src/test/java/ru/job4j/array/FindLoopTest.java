package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {
    @Test
    public void when5() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int el = 5;
        int expected = 0;
        int out = findLoop.indexOf(input, el);
        assertThat(out, is(expected));
    }
    @Test
    public void when3() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {4, 3, 43, 5, 6, 56};
        int el = 3;
        int start = 2;
        int finish = 5;
        int expected = -1;
        int out = findLoop.indexOf(input, el, start, finish);
        assertThat(out, is(expected));
    }
    @Test
    public void when1() {
        FindLoop findLoop = new FindLoop();
        int[] input = new int[] {101, 10, 11, 1, 111, 1};
        int el = 1;
        int start = 0;
        int finish = 4;
        int expected = 3;
        int out = findLoop.indexOf(input, el, start, finish);
        assertThat(out, is(expected));

    }
}
