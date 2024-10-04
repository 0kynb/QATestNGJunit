package ru.netology.service;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {

    @org.junit.Test
    public void testGetcashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void testTruthfulcondition() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public  void testAddforcashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);
    }
}
