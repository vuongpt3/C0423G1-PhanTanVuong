package bai_6_inheritane.bai_tap.bai_3_class_point_and_moveablePoint;

public class MainMovablePointAndPoint {
    public static void main(String[] args) {
        Point point = new Point(2.5f, 3.5f);
        System.out.println("Point: " + point.toString());

        MovablePoint movablePoint = new MovablePoint(1.0f, 2.0f, 0.5f, 1.5f);
        System.out.println("MovablePoint: " + movablePoint.toString());
        movablePoint.move();
        System.out.println("MovablePoint after move: " + movablePoint.toString());
    }
}
