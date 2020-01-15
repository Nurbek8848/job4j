package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    @Test
    public void triangleExist() {
        double inAB = 1.5;
        double inAC = 2.5;
        double inBC = 3.5;
        boolean result = Triangle.exist(inAB, inAC, inBC);
        assertThat(result, is(true));
    }
    @Test
    public void triangleNotExist() {
        double inAB = 1.5;
        double inAC = 2.5;
        double inBC = 6.5;
        boolean result = Triangle.exist(inAB, inAC, inBC);
        assertThat(result, is(false));
    }
}
