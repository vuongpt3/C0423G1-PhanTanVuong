package bai_15_exception_andling_and_debug.bai_1_using_illegaltriangleexception_class;

import java.util.Scanner;

public class IllegalTriangleException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter First Edge");
            int firstEdge = scanner.nextInt();
            System.out.println("Enter Second Edge");
            int secondEdge = scanner.nextInt();
            System.out.println("Enter Third Edge");
            int thirdEdge = scanner.nextInt();

            if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0 || firstEdge + secondEdge <= thirdEdge || secondEdge + thirdEdge <= firstEdge || thirdEdge + firstEdge <= secondEdge) {
                throw new IllegalArgumentException("Invalid edge value");
            }

            System.out.println("Valid edge value");

        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
