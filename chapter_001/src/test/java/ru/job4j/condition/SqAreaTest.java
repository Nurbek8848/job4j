package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void square() {
        int inP = 4;
        int inK = 1;
        int expected = 1;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.1);
    }
}
