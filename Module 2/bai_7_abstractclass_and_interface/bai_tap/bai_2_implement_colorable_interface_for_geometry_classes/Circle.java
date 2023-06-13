package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
