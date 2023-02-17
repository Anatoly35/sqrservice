package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testNumberOfSquares() {
        SQRService service = new SQRService();
         int actual =  service.calculate(200 , 300);
         int expected = 3;
        Assertions.assertEquals(expected , actual);
    }
    @Test
    public void testNumberOfSquaresExceedMinimumLimit() {
        SQRService service = new SQRService();
        int actual =  service.calculate(10 , 99);
        int expected = 0;
        Assertions.assertEquals(expected , actual);
        }
    @Test
    public void testNumberOfSquareMinimumLimit() {
        SQRService service = new SQRService();
        int actual =  service.calculate(100 , 100);
        int expected = 1;
        Assertions.assertEquals(expected , actual);
        }
    @Test
    public void testNumberOfSquareMaximumLimit() {
        SQRService service = new SQRService();
        int actual =  service.calculate(100 , 9801);
        int expected = 90;
        Assertions.assertEquals(expected , actual);
        }
    @Test
    public void testNumberOfSquareExceedMaximumLimit() {
        SQRService service = new SQRService();
        int actual =  service.calculate(100 , 100000);
        int expected = 90;
        Assertions.assertEquals(expected , actual);
        }

}
