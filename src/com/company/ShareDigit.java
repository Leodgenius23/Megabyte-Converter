package com.company;

public class ShareDigit {
    public static boolean hasSharedDigit(int x, int y){
        if((x < 10) || (x > 99) || (y < 10) || (y > 99)){
            return false;
        }
        int xLastDigit = x % 10;
        int yLastDigit = y % 10;

        int xFirstDigit = x;
        while(xFirstDigit >= 10){
            xFirstDigit /= 10;
        }
        int yFirstDigit = y;
        while(yFirstDigit >= 10){
            yFirstDigit /= 10;
        }

        if((xFirstDigit == yFirstDigit) || (xFirstDigit == yLastDigit) || (xLastDigit == yLastDigit) || (xLastDigit == yFirstDigit)) {
            return true;
        }
        return false;
    }
    }