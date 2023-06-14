package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Rectangle implements Shape {
    private final double WIDTH;
    private final double HEIGHT;

    public Rectangle(double WIDTH, double HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    public double getArea() {
        return WIDTH * HEIGHT;
    }
}
