package bai_6_test_demo.bai_tap.class_oint_and_moveablepoint;

public class MainPoint {
    public static void main(String[] args) {
        Point point = new Point(3.0f , 5.0f);
        System.out.println("Point : " + point);
        MovablePoint movablePoint = new MovablePoint(3.0f, 5.0f ,7.0f,9.0f);
        System.out.println("Movable Point : " + movablePoint);
    }
}
