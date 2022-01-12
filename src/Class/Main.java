package Class;

import com.company.*;

public class Main {

//        if(num < 10){
//            return -1;
//        }
//        int sum = 0;
//        if(num > 0) {
//            while (num > 0) {
//                int digit = num % 10;
//                sum += digit;
//                num /= 10;
//            }
//        }else{
//            return -1;
//        }
//
//        return sum;
//    }
    public static void main(String[] args) {
        int result = NumberToWords.getDigitCount(1234);
        System.out.println(result);
        System.out.println("**********************************");
        int result1 = NumberToWords.reverse(-37683);
        System.out.println(result1);
        System.out.println("**********************************");
        NumberToWords.numberToWords(100);


















//        boolean result2 = LastDigitChecker.hasSameLastDigit(26,45,56);
//        System.out.println(result2);
//        int result = sumDigits(125);
//        System.out.println(result);
//     boolean result = ShareDigit.hasSharedDigit(15,55);
//        System.out.println(result);
//        int result = EvenDigitSum.getEvenDigitSum(-22);
//        System.out.println("Sum of the even digits = " + result);
////       boolean result = NumberPalindrome.isPalindrome(-1221);
//        int result = FirstLastDigitSum.sumFirstAndLastDigit(121);
//        System.out.println(result);
    }

//    private static int sumDigits(int number){
//        if(number < 10){
//            return -1;
//        }
//        int sum = 0;
//        while(number > 0){
//            //get the least significant digit
//            int digit = number % 10;
//            sum += digit;
//
//            //drop the least significant digit
//            number /= 10;
//        }
//        return sum;
//    }
//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//        while(number <= finishNumber){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//            count ++;
//            System.out.println(number + " is an Even Number");
//            if(count==5){
//                break;
//            }
//
//        }S
//        System.out.println("The total number of Even Number is " +
//                count);
//    }


//        boolean result = IsEvenNumber.isEvenNumber(2);
//        System.out.println(result);
//        int count = 0;
//        int sum = 0;
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                System.out.println(i + " divisible by both 3 and 5");
//                if (count == 5) {
//                    System.out.println("Break!");
//                    break;
//                }
//            }
//
//        }
//        System.out.println("Sum of all the number " + sum);
//        int count = 0;
//        for(int j = 1; j <=50; j++){
//            if(isPrime(j)) {
//                count++;
//                System.out.println(j + " is a prime number");
//                if (count == 3) {
//                    break;
//                }
//            }
//        }

//        System.out.println("***************************");
//        for(int i = 2;i <= 8;i++){
//            System.out.println("10,000 at 2% interest = " +
//                    String.format("%.1f" ,CalculateInterest.calculateInterest(10000.0, i)));
//        }
//        System.out.println("******************************");
//        System.out.println("******************************");
//        for(int i = 8;i >= 2;i--){
//            System.out.println("10,000 at 2% interest = " +
//                    String.format("%.1f" ,CalculateInterest.calculateInterest(10000.0, i)));
//        }
//    }
//
//    public static boolean isPrime(int n) {
//        if (n == 1) {
//            return false;
//        }
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//        return true;
    }

