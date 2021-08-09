package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;https://github.com/JuliaNeup/CashbackHackService/blob/junit4/src/test/java/ru/netology/service/CashbackHackServiceTest.java

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

   @Test
   public void shouldReturn0IfAmountIs1000() {
       int amount = 1000;

       int actual = service.remain(amount);
       int expected = 0;

        assertEquals(actual, expected);

   }

    @Test
    public void shouldCalculateIfAmountCorrect() {
        int amount = 3200;

        int actual = service.remain(amount);
        int expected = 800;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateIfAmountZero() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

}
