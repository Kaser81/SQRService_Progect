package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void numberOfSquares() {
        SQRService service = new SQRService();
        int startNumber = 400;
        int endNumber = 700;
        int expected = 7;

        int actual = service.numberOfSquares( startNumber, endNumber);

        assertEquals(expected, actual);
    }
}

