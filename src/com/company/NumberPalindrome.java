package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int trick = number;
        if(number < 0){
            number *= -1;
        }
        int reverse = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number = number / 10;
        }
        System.out.println(trick);
        if(trick < 0){
            trick *= -1;
        }
        if( reverse == trick){
            return true;
        }
        return false;
    }

}

