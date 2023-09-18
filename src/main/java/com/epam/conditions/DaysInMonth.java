package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 0) {
            System.out.println("invalid date");
        } else {
            switch(month) {
                case (1):
                case (3):
                case (5):
                case (8):
                case (10):
                case (12):
                    System.out.println(31);
                    break;
                case (4):
                case (6):
                case (7):
                case (9):
                case (11):
                    System.out.println(30);
                    break;
                case (2):
                    if(isLeapYear(year)) {
                        System.out.println(29);
                    } else {
                        System.out.println(28);
                    }
                    break;
                default:
                    System.out.println("invalid date");
                    break;
            }
        }


    }

    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
