package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit /= 10;
        }
        int sum = lastDigit + firstDigit;
        return sum;
    }
}
