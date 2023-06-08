package bai_4_classes_and_objects_in_java.bai_tap.bai3_demo_fan_class;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    public int speed;
    public boolean on;
    public double radius;
    public String color;
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "Blue";
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return on;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public String toString(){
        if (on){
            return "Speed : " + speed + " Color : " + color + " . Radius : " + radius + " - Fan is on";
        }else {
            return "Color : " + color + " . Radius : " + radius + " - Fan is off";
        }
    }

}
