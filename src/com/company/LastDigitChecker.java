package com.company;

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 < 10 || num1 > 1000) ||(num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)){
            return false;
        }
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        int lastDigitNum3= num3 % 10;

        if((lastDigitNum1 != lastDigitNum2) && (lastDigitNum2 != lastDigitNum3) && (lastDigitNum1 != lastDigitNum3)){
            return false;
        }
        return true;
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
