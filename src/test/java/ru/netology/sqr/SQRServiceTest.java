package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNormalRange() {
        SQRService service = new SQRService();
        int startNumber = 400;
        int endNumber = 700;
        int expected = 7;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinimumRange() {
        SQRService service = new SQRService();
        int startNumber = 9;
        int endNumber = 98;
        int expected = 0;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldKnownRange() {
        SQRService service = new SQRService();
        int startNumber = 10;
        int endNumber = 99;
        int expected = 0;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldOverKnownRange() {
        SQRService service = new SQRService();
        int startNumber = 11;
        int endNumber = 100;
        int expected = 1;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldVeryLargeRange() {
        SQRService service = new SQRService();
        int startNumber = 200;
        int endNumber = 1000000;
        int expected = 85;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldNegativeRange() {
        SQRService service = new SQRService();
        int startNumber = -200;
        int endNumber = -300;
        int expected = 0;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }

    @Test
    void shouldZeroRange() {
        SQRService service = new SQRService();
        int startNumber = 0;
        int endNumber = 200;
        int expected = 5;

        int actual = service.numberOfSquares(startNumber, endNumber);

        assertEquals(expected, actual);
    }
}

