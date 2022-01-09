package com.company;

public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int checker = number % 10;
            if (checker % 2 == 0) {
                sum += checker;
            }
            number /= 10;        }
        return sum;
    }
}
