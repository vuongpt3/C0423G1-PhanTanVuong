package bai6_demo.bai_3_point_class_and_moveable_class;

public class Point {
    float x;
    float y;
    public Point(float x , float y){
        this.x = x;
        this.y = y;
    }
    public Point(){

    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{ x, y};
    }
    @Override
    public String toString(){
        return "X = " + x + " Y = " + y;
    }
}
