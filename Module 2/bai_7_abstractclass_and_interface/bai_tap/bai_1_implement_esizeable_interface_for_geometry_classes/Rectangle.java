package bai_7_abstractclass_and_interface.bai_tap.bai_1_implement_esizeable_interface_for_geometry_classes;

class Rectangle implements Resizeable, Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void resize(double percent) {
        width *= (1 + percent / 100);
        height *= (1 + percent / 100);
    }
}
