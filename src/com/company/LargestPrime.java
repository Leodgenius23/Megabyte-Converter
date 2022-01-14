package com.company;

// Find only the prime factors

//Find the 2 highest primes which equal number

// if the one of the primes can be simplified do so

//then print but the largest prime

public class LargestPrime {
    public static void main(String[] args){
        int result = getLargestPrime(21);
        System.out.println(result);
    }
    public static int getLargestPrime(int number) {
     if(number <= 1){
         return -1;
     }else{
         int div = 2;
         while(div < number){
             if(number % div != 0){
                 div++;
             }else{
                 number = number / div;
                 div = 2;
             }
         }
     }
     return number;
    }

}
