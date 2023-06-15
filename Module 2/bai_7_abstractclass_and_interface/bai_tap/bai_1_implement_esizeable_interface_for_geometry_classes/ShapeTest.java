package bai_7_abstractclass_and_interface.bai_tap.bai_1_implement_esizeable_interface_for_geometry_classes;

import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println(rectangle);
        rectangle.resize(50);
        System.out.println(rectangle);

        Square square = new Square(5);
        System.out.println(square);
        square.resize(20);
        System.out.println(square);

        Circle circle = new Circle(5);
        System.out.println(circle);
        circle.resize(40);
        System.out.println(circle);

        Shape[] shape = new Shape[3];
        shape[0] = rectangle;
        shape[1] = square;
        shape[2] = circle;

        System.out.println();
        System.out.println();
        for (Shape value : shape) {
            value.resize(Math.random() * 99 + 1);
        }
        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
    }
}
