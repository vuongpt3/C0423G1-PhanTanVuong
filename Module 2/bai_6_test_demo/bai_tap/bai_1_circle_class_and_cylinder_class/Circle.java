package bai_6_test_demo.bai_tap.bai_1_circle_class_and_cylinder_class;

public class Circle {
    public double radius;
    public String color;
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString(){
        return "Cirle ( Radius = " + radius + " Color = " + color + " )";
    }
}
