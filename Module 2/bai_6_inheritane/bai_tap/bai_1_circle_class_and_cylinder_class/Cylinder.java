package bai_6_inheritane.bai_tap.bai_1_circle_class_and_cylinder_class;

public class Cylinder extends Circle{
    public double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getVolume() {

        return getArea() * height;
    }

    @Override
    public String toString() {

        return "Cylinder[base=" + super.toString() + ", height=" + height + "]";
    }
}
