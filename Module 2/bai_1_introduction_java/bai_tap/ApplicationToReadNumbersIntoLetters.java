package bai_1_introduction_java.bai_tap;

import java.util.Scanner;

public class ApplicationToReadNumbersIntoLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ask for the number to read : ");
        int number = sc.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number <= 10) {
            String world = checkUnit(number);
            System.out.println(world);
        } else if (number < 20) {
            String world = checkUnits1(number);
            System.out.println(world);
        } else if (number < 100) {
            int ten = number / 10;
            int unnit = number % 10;
            String word = checkDozens(ten) + " " + checkUnit(unnit);
            System.out.println(word);
        } else if (number < 999) {
            int hundred = number / 100;
            int hundredResidual = number % 100;
            System.out.println(hundredResidual);
            if (hundredResidual < 20 && hundredResidual > 10) {
                int ten = hundredResidual / 10;
                String world = checkUnit(hundred) + " hundred " + checkDozens(ten);
                System.out.println(world);
            } else if (hundredResidual > 20) {
                int ten = hundredResidual / 10;
                int unit = hundredResidual % 10;
                String world = checkUnit(hundred) + " hundred " + checkDozens(ten) + checkUnit(unit);
                System.out.println(world);
            }
        }
        sc.close();
    }

    public static String checkUnit(int units) {
        switch (units) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "";
        }
    }

    public static String checkUnits1(int units1) {
        switch (units1) {
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fiveteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eightteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String checkDozens(int dozens) {
        switch (dozens) {
            case 2:
                return "eleven";
            case 3:
                return "thirty";
            case 4:
                return "fourty";
            case 5:
                return "fivety";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
