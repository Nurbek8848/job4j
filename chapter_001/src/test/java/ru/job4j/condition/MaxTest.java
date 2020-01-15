package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void maxLeft() {
        int inLeft = 15;
        int inRight = 10;
        int expected = 15;
        int out = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxRight() {
        int inLeft = 5;
        int inRight = 10;
        int expected = 10;
        int out = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void maxEq() {
        int inLeft = 10;
        int inRight = 10;
        int expected = 10;
        int out = Max.max(inLeft, inRight);
        Assert.assertEquals(expected, out);
    }

}
