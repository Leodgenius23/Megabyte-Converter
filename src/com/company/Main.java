package com.company;

public class Main {
    public static void main(String[] args) {
//      boolean result = LeapYear.isLeapYear(1924);
        boolean result = TeenNumberchecker.hasTeen(23, 15, 42);
        boolean result2 = TeenNumberchecker.isTeen(13);
        System.out.println(result);
        System.out.println(result2);
    }
}
