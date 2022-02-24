package ru.netology.sqr;

public class SQRService {

    public int numberOfSquares(int startNumber, int endNumber) {
        int value = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startNumber && i * i <= endNumber) {
//                if (i * i <= endNumber) {
                value++;
            }
        }
        return value;
    }
}

