package Class;

import com.company.printNumberinWords;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println(i + " divisible by both 3 and 5");
                if (count == 5) {
                    System.out.println("Break!");
                    break;
                }
            }

        }
        System.out.println("Sum of all the number " + sum);
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
}
