package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }
}
