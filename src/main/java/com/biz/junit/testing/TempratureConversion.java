package com.biz.junit.testing;

import java.util.Scanner;

public class TempratureConversion {
    public static void main(String[] args) {
        try {
            Scanner scan=new Scanner(System.in);
            System.out.println("enter temp in c or f");
            int tem = scan.nextInt();
            char t =scan.next().charAt(0);

            if (t != 'f' && t != 'F' && t != 'c' && t != 'C') {
                System.out.println("enter correct input");
               main(args);
                return;
            }
            tem = temperaturConversion(tem, t);
            System.out.println("coverted temp is " + tem);
            scan.close();
        } catch (Exception e) {
            System.out.println("temperature in format 4545 c");
        }

    }
    public static int temperaturConversion(int tem, char t) {
        int conver;
        if (t == 'c' || t == 'C') {
            conver = (tem * 9 / 5) + 32;
        } else if (t == 'f' || t == 'F') {
            conver = (tem - 32) * 5 / 9;
        } else {
            System.out.println("Enter correct input");
            return 0;
        }
        return conver;
    }
}
