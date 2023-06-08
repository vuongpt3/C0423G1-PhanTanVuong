package bai_5_TestDemo;

public class AccessModifier {
    private double radius;
    private String color;

    public AccessModifier() {
        radius = 1.0;
        color = "red";
    }

    public AccessModifier(double radius) {
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
        AccessModifier circle = new AccessModifier();
        double radius = circle.getRadius();
        double area = circle.getArea();

        System.out.println("Radius : " + radius);
        System.out.println("Area : " + area);
    }
}
