package bai_6_test_demo.bai_tap.class_oint_and_moveablepoint;

public class Point {
    public float x;
    public float y;
    public Point(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point(float x , float y){
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public void setXY(float x ,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x ,y};
    }
    @Override
    public String toString(){
        return "Point ( x = " + x + " y = " + y + " ) ";
    }
}
