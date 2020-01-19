package ru.job4j.array;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class SquareTest {
    @Test
    public void when3Then149() {
        int bound = 3;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expected = new int[] {1, 4, 9};
        assertThat(rst, is(expected));
    }
    @Test
    public void when5() {
        int bound = 5;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expected = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expected));
    }
    @Test
    public void when4() {
        int bound = 4;
        Square square = new Square();
        int[] rst = square.calculate(bound);
        int[] expected = new int[] {1, 4, 9, 16};
        assertThat(rst, is(expected));
    }

}
