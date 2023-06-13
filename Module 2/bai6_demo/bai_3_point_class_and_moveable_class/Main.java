package bai6_demo.bai_3_point_class_and_moveable_class;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4,6);
        System.out.println("Point : " + point.toString());

        MoveablePoint moveablePoint = new MoveablePoint(7,8,9,10);
        System.out.println("Moveable : " + moveablePoint.toString());
        moveablePoint.move();
        System.out.println("Moveable after move : " + moveablePoint.toString());
    }
}
