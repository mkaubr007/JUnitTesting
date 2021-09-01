package com.biz.junit.testing;

import java.util.Scanner;

public class DayOfWeek {
    public static int dayOfWeek(double m, double d, double y) {
        double y0 = y - ((14 - m) / 12);
        double x = y0 + (y0 / 4) - (y0 / 100) + (y0 / 400);
        double m0 = m + 12 * ((14 - m) / 12) - 2;
        double d0 = (d + x + (31 * m0 / 12)) % 7;
        return (int)d0;
    }

    public static void main(String[] args) {

        //take input from user
        String array[] = {"Sun","Mon","Tue","Wed","Thus","Fri","Sat"};
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter month:");
        int month=scanner.nextInt();
        System.out.println("Enter date");
        int date=scanner.nextInt();
        System.out.println("Enter year");
        int year=scanner.nextInt();
        int result = DayOfWeek.dayOfWeek(month,date,year);//call method by class name
        System.out.println(array[result]);
        scanner.close();
    }

}

