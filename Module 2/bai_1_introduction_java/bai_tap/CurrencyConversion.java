package bai_1_introduction_java.bai_tap;
import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double VND = 23000;
        double USD;
        System.out.println("Enter the amount you want to transfer");
        USD = sc.nextDouble();
        double exchange = USD * VND;
        System.out.println(USD + " USD" +" . The amount after conversion is : " + exchange + " VND");
    }
}
