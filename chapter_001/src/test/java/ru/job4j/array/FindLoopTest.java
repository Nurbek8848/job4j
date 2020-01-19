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
}
