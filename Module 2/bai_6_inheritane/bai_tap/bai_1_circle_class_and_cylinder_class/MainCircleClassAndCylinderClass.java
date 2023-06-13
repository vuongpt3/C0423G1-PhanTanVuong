package bai_6_inheritane.bai_tap.bai_1_circle_class_and_cylinder_class;

public class MainCircleClassAndCylinderClass {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Red");
        circle.setRadius(5.0);
        circle.setColor("Rainbow");
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.getArea());
        System.out.println(circle.toString());

        System.out.println();

        Cylinder cylinder = new Cylinder(3.0, "Blue", 10.0);
        System.out.println("Cylinder radius: " + cylinder.getRadius());
        System.out.println("Cylinder color: " + cylinder.getColor());
        System.out.println("Cylinder height: " + cylinder.getHeight());
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println(cylinder.toString());
    }
}
