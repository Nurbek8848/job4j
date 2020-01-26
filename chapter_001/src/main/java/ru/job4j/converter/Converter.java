package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int dollarToRuble(int value) {
        return value * 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int inRtoEU = 140;
        int expectedRtoEU = 2;
        int outRtoEU = rubleToEuro(140);
        boolean passedRtoEU = expectedRtoEU == outRtoEU;
        int inRtoUSD = 120;
        int expectedRtoUSD = 2;
        int outRtoUSD = rubleToDollar(120);
        boolean passedRtoUSD = expectedRtoUSD == outRtoUSD;
        int inEUtoR = 2;
        int expectedEUtoR = 140;
        int outEUtoR = euroToRuble(2);
        boolean passedEUtoR = expectedEUtoR == outEUtoR;
        int inUSDtoR = 2;
        int expectedUSDtoR = 120;
        int outUSDtoR = dollarToRuble(2);
        boolean passedUSDtoR = expectedUSDtoR == outUSDtoR;
        System.out.println("140 rubles are 2 euro. Test result: " + passedRtoEU);
        System.out.println("120 rubles are 2 dollars. Test result: " + passedRtoUSD);
        System.out.println("2 euro are  140 rubles. Test result: " + passedEUtoR);
        System.out.println("2 dollars are  120 rubles. Test result: " + passedUSDtoR);
    }
}
