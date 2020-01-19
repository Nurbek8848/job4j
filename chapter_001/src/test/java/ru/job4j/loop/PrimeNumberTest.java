package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber pNum = new PrimeNumber();
        int count = pNum.calc(5);
        assertThat(count, is(3));
    }
    @Test
    public void when11() {
        PrimeNumber pNum = new PrimeNumber();
        int count = pNum.calc(11);
        assertThat(count, is(5));
    }
    @Test
    public void when2() {
        PrimeNumber pNum = new PrimeNumber();
        int count = pNum.calc(2);
        assertThat(count, is(1));
    }
}
