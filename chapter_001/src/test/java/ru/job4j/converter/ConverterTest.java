package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int inRtoEU = 140;
        int expectedRtoEU = 2;
        int outRtoEU = Converter.rubleToEuro(inRtoEU);
        Assert.assertEquals(expectedRtoEU, outRtoEU);
    }
    @Test
    public void rubleToDollar() {
        int inRtoUSD = 180;
        int expectedRtoUSD = 3;
        int outRtoUSD = Converter.rubleToDollar(inRtoUSD);
        Assert.assertEquals(expectedRtoUSD, outRtoUSD);
    }
    @Test
    public void euroToRuble() {
        int inEUtoR = 2;
        int expectedEUtoR = 140;
        int outEUtoR = Converter.euroToRuble(inEUtoR);
        Assert.assertEquals(expectedEUtoR, outEUtoR);
    }
    @Test
    public void dollarToRuble() {
        int inUSDtoR = 3;
        int expectedUSDtoR = 180;
        int outUSDtoR = Converter.dollarToRuble(inUSDtoR);
        Assert.assertEquals(expectedUSDtoR, outUSDtoR);
    }
}
