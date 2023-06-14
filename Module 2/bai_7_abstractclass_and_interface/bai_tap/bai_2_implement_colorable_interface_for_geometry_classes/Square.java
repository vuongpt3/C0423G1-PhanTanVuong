package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Square implements Shape {
    private final double SIDE;

    public Square(double side) {
        this.SIDE = side;
    }

    public double getArea() {
        return SIDE * SIDE;
    }

    public void howToColor() {
        System.out.println("Color all foure side. ");
    }
}