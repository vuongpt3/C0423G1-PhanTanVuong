package bai_6_test_demo.bai_tap.bai_1_circle_class_and_cylinder_class;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0 , "Red");
        circle.setRadius(3.0);
        circle.setColor("Yellow");

        double radius = circle.getRadius();
        String color = circle.getColor();
        double area = circle.getArea();
        String show = circle.toString();

        System.out.println("Radius : " + radius);
        System.out.println("Color : " + color);
        System.out.println("Area : " + area);
        System.out.println(show.toString());

        Cylinder cylinder = new Cylinder(5.0 , "Blue" , 10);
        cylinder.setRadius(5.0);
        cylinder.setColor("Blue");
        cylinder.setHeight(10);

        double radius1 = cylinder.getRadius();
        String color1 = cylinder.getColor();
        double height = cylinder.getHeight();
        double volum = cylinder.getVolum();
        String show1 = cylinder.toString();

        System.out.println("Radius : " + radius1);
        System.out.println("Color : " + color1);
        System.out.println("Height : " + height);
        System.out.println("Volum : " + volum);
        System.out.println("Infor : " + show1.toString() );
    }
}
