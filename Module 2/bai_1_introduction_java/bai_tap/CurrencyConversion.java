package bai_1_introduction_java.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vietNamDong = 23000;
        double doLa;
        System.out.println("Enter the amount you want to transfer");
        doLa = sc.nextDouble();
        double exchange = doLa * vietNamDong;
        System.out.println(doLa + " USD" + " . The amount after conversion is : " + exchange + " VND");
    }
}
