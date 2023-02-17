package ru.netology.sqr;

public class SQRService {

    public int calculate(int mininimumNumber , int maximumNumber) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {

            int Square = i * i;
            if (Square >= mininimumNumber) {

                if (Square <= maximumNumber) {
                    counter++;


                }
            }
            
        }
        return counter;

    }
}
