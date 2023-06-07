package bai_4_classes_and_objects_in_java.thuc_hanh;
import java.util.Scanner;

public class Rectangle {
    double heght , width ;
    public Rectangle(double heght , double width){
        this.heght = heght;
        this.width = width;
    }
    public double Area(){
        return this.width * this.heght;
    }
    public double Perimeter(){
        return (this.heght + this.width) * 2;
    }
    public String Display(){
        return "Rectangle " + " width = " + width + " height = " + heght;
    }

}
