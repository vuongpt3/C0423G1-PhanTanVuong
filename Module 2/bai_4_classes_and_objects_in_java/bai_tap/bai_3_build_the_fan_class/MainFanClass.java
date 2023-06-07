package bai_4_classes_and_objects_in_java.bai_tap.bai_3_build_the_fan_class;

import java.util.Scanner;

public class MainFanClass {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        FanClass fan2 = new FanClass();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());

    }
}
