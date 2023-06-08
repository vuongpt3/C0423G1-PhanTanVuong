package bai_6_test_demo.bai_tap.bai_1_circle_class_and_cylinder_class;

public class Cylinder extends Circle{
    public double height ;
    public Cylinder(double radius , String color , double height){
        super(radius ,color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolum(){
        return super.getArea() * height;
    }
    @Override
    public String toString(){
        return "Cylinder ( Radius = " + radius + " Color = " + color + " Height = " + height + " )";
    }
}
