package ru.job4j.calculator;

/**
 * Calculator Class for calculating arithmetic operations + - * /.
 * @author Nurbek
 * @since 19.01.2020
 * @version 1
 */
public class Calculator {
    /**
     * Constructor, output of the results of arithmetic operations.
     * @param args - arg.
     */
    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiple(2, 1);
        subtrack(10, 5);
    }
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "/" + second + " = " + result);
    }
    public static void multiple(double first, double second) {
        double result =  first * second;
        System.out.println(first + "*" + second + " = " + result);
    }
    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "-" + second + " = " + result);
    }
 }
