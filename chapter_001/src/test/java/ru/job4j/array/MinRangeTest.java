package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;


public class MinRangeTest {
    @Test
    public void min2() {
        assertThat(MinRange.findMin(new int[] {1, 0, 4, 6, 7, 2, 8}, 2, 6), is(2));
    }
    @Test
    public void min5() {
        assertThat(MinRange.findMin(new int[] {1, 2, 3, 4, 9, 5, 6, 10}, 4, 7), is(5));
    }
    @Test
    public void minFirst() {
        assertThat(MinRange.findMin(new int[] {-1, 0, 3, 6, -3, 9, -4}, 0, 3), is(-1));
    }
   }
