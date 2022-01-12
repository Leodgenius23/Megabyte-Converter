package com.company;

public class NumberToWords {
    public static void numberToWords(int number){
        //Invalid Option
        if(number < 0){
            System.out.println("Invalid Value");
        }
        //Variable declaration
        int reverse, num, lastDigit, value, total = 0;

        //moving number
        reverse = reverse(number);
        value = getDigitCount(reverse);
        num = getDigitCount(number);

        //Converting int to words
        while(reverse != 0){
            lastDigit = reverse % 10;
            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            reverse /= 10;
        }

        //controlling the zeroes
        if(value != num){
            total = num - value;
            // dealing with the zeroes
            for(int i = 0;i < total;i++){
                System.out.println("Zero");
            }
        }else if(number == 0){
            System.out.println("Zero");
        }
    }
    public static int reverse(int number){
        int lastDigit = 0;
        int reverse = 0;
        while(number != 0){
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }else if(number == 0){
            return 1;
        }
        int lastDigit = 0;
        int count = 0;
        while(number != 0){
            lastDigit = number % 10;
            count++;
            number /= 10;
        }
        return count;
    }


//    public static void numberToWords(int number) {
//
//        //Variable declaration
//        int reverse, lastDigit, num, total, value = 0;
//
//        //Invalid Option
//        if(number < 0) {
//            System.out.println("Invalid Value");
//        }
//
//        //moving Number
//        reverse = reverse(number);
//        value = getDigitCount(reverse);
//        num = getDigitCount(number);
//
//
//        //converting the int to words
//        while(reverse != 0){
//            lastDigit = reverse % 10;
//            switch (lastDigit){
//                case 0:
//                    System.out.println("Zero");
//                    break;
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//                default:
//                    break;
//            }
//            reverse /= 10;
//        }
//        //for controlling the zeroes
//        if(value != num){
//            total = num - value;
//            //control the zero
//            for(int i = 0; i < total; i++){
//                System.out.println("Zero");
//            }
//        }else if(number == 0){
//            System.out.println("Zero");
//        }
//    }
//    public static int getDigitCount(int number) {
//        if (number < 0) {
//            return -1;
//        } else if (number == 0) {
//            return 1;
//        }
//        int count = 0;
//        while (number != 0) {
//            int lastDigit = number % 10;
//            count++;
//            number /= 10;
//        }
//        return count;
//    }
//
//    public static int reverse(int number) {
//        int lastDigit = 0;
//        int reverse = 0;
//        while (number != 0) {
//            lastDigit = number % 10;
//            reverse = (reverse * 10) + lastDigit;
//            number /= 10;
//        }
//        return reverse;
//    }
//
}
