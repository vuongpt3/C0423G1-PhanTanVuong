package bai_7_abstractclass_and_interface.bai_tap.bai_1_implement_esizeable_interface_for_geometry_classes;

import java.util.Random;

public class ShapeTest {
    public static void main(String[] args) {
        Random random = new Random();
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Square(5);

        for (Resizeable shape : shapes) {
            Shape shapeWithArea = (Shape) shape;
            System.out.println("Before resizing - Area: " + shapeWithArea.getArea());
            double percent = random.nextInt(100) + 1;
            shape.resize(percent);
            System.out.println("After resizing (" + percent + "%) - Area: " + shapeWithArea.getArea());

            System.out.println();
        }
    }
}
