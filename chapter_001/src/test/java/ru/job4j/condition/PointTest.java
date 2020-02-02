package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void distance2() {
        Point a = new Point(1, 4);
        Point b = new Point(5, 2);
        double expected = 4.47;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.1);
    }
    @Test
    public void distance3D() {
        Point a = new Point(0, 1, 1);
        Point b = new Point(2, 1, 1);
        double expected = 2;
        double out = a.distance3D(b);
        Assert.assertEquals(expected, out, 0.1);
    }
}
