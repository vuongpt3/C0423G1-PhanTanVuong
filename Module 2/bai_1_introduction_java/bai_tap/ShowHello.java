package bai_1_introduction_java.bai_tap;
import java.util.Scanner;

public class ShowHello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name here");
        String name = input.nextLine();
        System.out.println("Hello : " + name);
    }
}
