package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Circle implements Shape {
    private final double RADIUS;

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    public double getArea() {
        return Math.PI * RADIUS * RADIUS;
    }
}
