package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenMonoHorizontal() {
        char[][] input = new char[][] {
                {' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 1);
        assertThat(result, is(true));
    }
    @Test
    public void whenNoMonoHorizontal() {
        char[][] input = new char[][] {
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '},
                {'X', 'X', ' ', 'X'},
                {' ', ' ', ' ', ' '}
        };
        boolean result = MatrixCheck.monoHorizontal(input, 2);
        assertThat(result, is(false));
    }
    @Test
    public void whenMonoVertical() {
        char[][] input = new char[][] {
                {' ', ' ', ' ', 'X'},
                {' ', ' ', ' ', 'X'},
                {' ', ' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.monoVertical(input, 3);
        assertThat(result, is(true));
    }
    @Test
    public void whenNoMonoVertical() {
        char[][] input = new char[][] {
                {' ', ' ', ' ', ' '},
                {' ', ' ', 'X', ' '},
                {' ', ' ', 'X', ' '}
        };
        boolean result = MatrixCheck.monoVertical(input, 2);
        assertThat(result, is(false));
    }
    @Test
    public void whenDiagonal() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expect = {'X', 'X', 'X'};
        assertThat(result, is(expect));
    }
    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(false));
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        assertThat(result, is(true));
    }
}
