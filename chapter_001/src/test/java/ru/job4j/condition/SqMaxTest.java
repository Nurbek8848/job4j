package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void maxFirst() {
        SqMax check = new SqMax();
        int result = check.max(24, 5, 20, 15);
        assertThat(result, is(24));
    }
    @Test
    public void maxSecond() {
        SqMax check = new SqMax();
        int result = check.max(24, 25, 20, 15);
        assertThat(result, is(25));
    }
    @Test
    public void maxThird() {
        SqMax check = new SqMax();
        int result = check.max(10, 5, 35, 15);
        assertThat(result, is(35));
    }
    @Test
    public void maxForth() {
        SqMax check = new SqMax();
        int result = check.max(24, 5, 20, 25);
        assertThat(result, is(25));
    }
}
