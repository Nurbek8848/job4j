package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
   public void area() {
        Point a = new Point(1, 1);
        Point b = new Point(1, 3);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        double expected = 2;
        double result = triangle.area();
        Assert.assertEquals(expected, result, 0.1);

    }
}
