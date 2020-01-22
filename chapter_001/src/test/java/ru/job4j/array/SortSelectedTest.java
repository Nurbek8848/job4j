package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void sort3() {
        int[] input = new int[] {3, 2, 1};
        int[] out = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3};
        assertThat(out, is(expected));
    }
    @Test
    public void sort5() {
        int[] input = new int[] {3, 2, 1, 5, 4};
        int[] out = SortSelected.sort(input);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(out, is(expected));
    }

}
