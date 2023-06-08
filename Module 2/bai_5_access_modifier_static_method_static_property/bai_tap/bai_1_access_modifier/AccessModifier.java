package bai_5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier;

public class AccessModifier {
    private double radius;
    private String color;

    public AccessModifier() {
        radius = 1.0;
        color = "red";
    }

    public AccessModifier(double r) {
        radius = r;
        color = "red";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
