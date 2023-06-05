package bai_2_loop_in_java.bai_tap;

import java.util.Scanner;

public class DisplayType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("display types \n 1 . Print the rectangle \n 2 . Print the square triangle \n 3 . Print isosceles triangle \n 4 . Exit ");
        int select = input.nextInt();
        switch (select) {
            case 1:
                System.out.println("Enter width");
                int length = input.nextInt();
                System.out.println("Enter length");
                int width = input.nextInt();
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.println("*");
                        }
                    }
                break;
            default:
                System.out.println("Are you Oke");
        }
    }
}
