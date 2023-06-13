package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(12, 18);
        shapes[2] = new Square(9);
        for (Shape shape : shapes) {
            System.out.println("Area : " + shape.getArea());
            System.out.println();
        }
    }
}
