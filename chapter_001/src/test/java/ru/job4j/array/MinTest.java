package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MinTest {
    @Test
    public void lastMin() {
        assertThat(Min.min(new int[] {5, 9, 10, 3,}), is(3));
    }
    @Test
    public void firstMin() {
        assertThat(Min.min(new int[] {1, 5, 3, 2}), is(1));
    }
    @Test
    public void middleMin() {
        assertThat(Min.min(new int[] {3, 4, 5, 20, 0}), is(0));
    }
}
