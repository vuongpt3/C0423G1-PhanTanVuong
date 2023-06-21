package bai_15_exception_andling_and_debug.bai_1_using_illegaltriangleexception_class;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter the first edge");
            int firstEdge = scanner.nextInt();
            System.out.println("Enter the second edge");
            int secondEdge = scanner.nextInt();
            System.out.println("Enter the third edge");
            int secondThird = scanner.nextInt();

            if (firstEdge <= 0 || secondEdge <= 0 || secondThird <= 0 || firstEdge + secondEdge <= secondThird || firstEdge + secondThird <= secondEdge || secondEdge + secondThird <= firstEdge) {
                throw new IllegalArgumentException("Invalid edge values");
            }

            System.out.println("Valid edge values");


        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
