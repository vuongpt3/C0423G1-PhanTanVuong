package bai_4_classes_and_objects_in_java.bai_tap.bai3_demo_fan_class;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);

        System.out.println("Fan 1 : " + fan1.toString());
        System.out.println("Fan 2 : " + fan2.toString());
    }
}
