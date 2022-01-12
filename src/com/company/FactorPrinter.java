package com.company;

import javax.crypto.spec.PSource;

public class FactorPrinter {
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int i = 1;
        int sum = 0;
        while(i <= number){
            if(number % i == 0){
                System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of factors = " + sum);
    }
}
