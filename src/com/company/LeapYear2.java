package com.company;

public class LeapYear2 {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }
        if (year >= 1 && year <= 9999) {
            int d;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    d = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    d = 30;
                    break;
                case 2:
                    if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                        d = 29;
                    } else {
                        d = 28;
                    }
                    break;
                default:
                    d = 0;
                    break;

            }
            return d;

        }
        return -1;
    }
}
//         int d;
//            if (month == 1 || month == 3 || month == 5 || month == 7
//                    || month == 8 || month == 10 || month == 12) {
//                d = 31;
//            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//                d = 30;
//            } else if (year % 4 == 0 && month == 2) {
//                d = 29;
//            } else if (month == 2) {
//                d = 28;
//            } else {
//                d = 0;
//            }
//            return d;
//        }
//        return -1;

