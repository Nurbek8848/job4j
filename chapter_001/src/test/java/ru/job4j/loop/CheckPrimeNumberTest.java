package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        boolean prime = CheckPrimeNumber.check(5);
        assertThat(prime, is(true));
    }
    @Test
    public void when4(){
        boolean prime = CheckPrimeNumber.check(4);
        assertThat(prime, is(false));
    }
}
