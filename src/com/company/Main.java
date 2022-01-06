package com.company;

public class Main {
    public static void main(String[] args) {
        double areaOfCircle = AreaCalculator.area(5.0);
        double areaOfCircle2 = AreaCalculator.area(-1);
        double areaOfRectangle = AreaCalculator.area(5.0,4.0);
        double areaOfRectangle2 = AreaCalculator.area(-1.0,4.0);
        System.out.println("Area of circle = " + String.format("%.5f",areaOfCircle));
        System.out.println("Area of circle = " + String.format("%.2f",areaOfCircle2));
        System.out.println("Area of rectangle= " + String.format("%.2f",areaOfRectangle));
        System.out.println("Area of rectangle = " + String.format("%.2f",areaOfRectangle2));





////      boolean result = LeapYear.isLeapYear(1924);
//        boolean result = TeenNumberchecker.hasTeen(23, 15, 42);
//        boolean result2 = TeenNumberchecker.isTeen(13);
//        System.out.println(result);
//        System.out.println(result2);
    }
}
