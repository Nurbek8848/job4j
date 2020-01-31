package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void max2() {
        int inFirst = 15;
        int inSecond = 10;
        int expected = 15;
        int out = Max.max(inFirst, inSecond);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void max3() {
        int inFirst = 15;
        int inSecond = 20;
        int inThird = 17;
        int expected = 20;
        int out = Max.max(inFirst, inSecond, inThird);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void max4() {
        int inFirst = 15;
        int inSecond = 20;
        int inThird = 17;
        int inFourth = 40;
        int expected = 40;
        int out = Max.max(inFirst, inSecond, inThird, inFourth);
        Assert.assertEquals(expected, out);
    }

}
