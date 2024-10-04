package ru.netology.service;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testTruthfulcondition() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testGetcashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public  void testAddforcashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }
}
