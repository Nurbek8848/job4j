package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        boolean condition = first > second;
        int result = condition ? first : second;
        return result;
    }
    public static int max(int first, int second, int third) {
        int tempMax = max(first, second);
        boolean condition = max(first, second) > third;
        int result = condition ? tempMax : third;
        return result;
    }
    public static int max(int first, int second, int third, int fourth) {
        int tempMax = max(first, second, third);
        boolean condition = max(first, second, third) > fourth;
        int result = condition ? tempMax : fourth;
        return result;
    }
}
