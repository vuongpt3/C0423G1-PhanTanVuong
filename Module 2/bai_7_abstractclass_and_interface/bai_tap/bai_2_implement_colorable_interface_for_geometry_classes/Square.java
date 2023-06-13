package bai_7_abstractclass_and_interface.bai_tap.bai_2_implement_colorable_interface_for_geometry_classes;

class Square implements Shape{
 private double side;
 public Square(double side){
     this.side = side;
 }
 public double getArea(){
     return side * side;
 }
 public void howToColor(){
     System.out.println("Color all foure side. ");
 }
}