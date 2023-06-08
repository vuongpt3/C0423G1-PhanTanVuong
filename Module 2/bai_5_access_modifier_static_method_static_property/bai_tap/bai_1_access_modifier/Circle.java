package bai_5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        radius = 1.0;
        color = "Red";
    }


    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        double radius = circle.getRadius();
        double area = circle.getArea();

        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);
    }
}
