package com.company;

public class Main {
    public static void main(String[] args) {
       boolean result = PlayingCat.isCatPlaying(true, 10);
        boolean result2 =PlayingCat.isCatPlaying(false, 36);
        boolean result3 = PlayingCat.isCatPlaying(false, 35);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
