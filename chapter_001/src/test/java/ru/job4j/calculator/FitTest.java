package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double inMan = 180;
        double expectedMan = 92;
        double outMan = Fit.manWeight(inMan);
        Assert.assertEquals(expectedMan, outMan, 0.1);
    }
    @Test
    public void womanWeight() {
        double inWoman = 160;
        double expectedWoman = 57.5;
        double outWoman = Fit.womanWeight(inWoman);
        Assert.assertEquals(expectedWoman, outWoman, 0.1);
    }
}
