package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {
    @Test
    public void answer() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void answer1() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void answer2() {
        String in = "";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(expected, out);
    }

}
