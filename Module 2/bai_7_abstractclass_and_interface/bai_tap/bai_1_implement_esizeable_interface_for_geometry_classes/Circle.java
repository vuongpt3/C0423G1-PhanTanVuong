package bai_7_abstractclass_and_interface.bai_tap.bai_1_implement_esizeable_interface_for_geometry_classes;

class Circle implements Resizeable, Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
}
