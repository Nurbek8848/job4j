package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void maxFirst() {
        MultiMax check = new MultiMax();
        int result = check.max(50, 40, 45);
        assertThat(result, is(50));
    }
    @Test
    public void maxSecond() {
        MultiMax check = new MultiMax();
        int result = check.max(50, 90, 45);
        assertThat(result, is(90));
    }
    @Test
    public void maxThird() {
        MultiMax check = new MultiMax();
        int result = check.max(50, 90, 95);
        assertThat(result, is(95));
    }
    @Test
    public void maxEq() {
        MultiMax check = new MultiMax();
        int result = check.max(50, 50, 50);
        assertThat(result, is(50));
    }
}
