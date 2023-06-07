package bai_4_classes_and_objects_in_java.bai_tap.bai_2_construct_the_stopwatch_class;

import java.util.Scanner;
import java.util.Timer;
import java.util.*;

public class MainStopWatch {
    public static void main(String[] args) {
        GetElapsedTime getElapsedTime = new GetElapsedTime();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Start Time");
        int start = scanner.nextInt();

        if (start == 1) {
            System.out.println("Current Time : " + getElapsedTime.getStartTime());
        }
        System.out.println("Enter End Time");
        int end = scanner.nextInt();
        if (end == 2) {
            System.out.println("Current Time : " + getElapsedTime.getEndTime());
        }
        System.out.println("Enter Distance");
        int distance = scanner.nextInt();
        if (distance == 3) {
            System.out.println("Elapsed time in milliseconds is : " + getElapsedTime.getElapsedTime());
        }
    }
}
