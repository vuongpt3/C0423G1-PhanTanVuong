package bai_7_abstractclass_and_interface.bai_tap.bai_1_implement_esizeable_interface_for_geometry_classes;

class Square implements Resizeable, Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }
}
