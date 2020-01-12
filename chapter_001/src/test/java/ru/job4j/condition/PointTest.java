package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        int inX1 = 0;
        int inX2 = 2;
        int inY1 = 0;
        int inY2 = 0;
        double expected = 2;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance2() {
        int inX1 = 1;
        int inX2 = 5;
        int inY1 = 4;
        int inY2 = 2;
        double expected = 4.47;
        double out = Point.distance(inX1, inY1, inX2, inY2);
        Assert.assertEquals(expected, out, 0.1);
    }
}
