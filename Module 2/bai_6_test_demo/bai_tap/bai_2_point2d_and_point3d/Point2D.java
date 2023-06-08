package bai_6_test_demo.bai_tap.bai_2_point2d_and_point3d;

public class Point2D {
    public float x;
    public float y ;
    public Point2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public Point2D(float x , float y){
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
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x, y} ;
    }
    @Override
    public String toString() {
        return "Point2D ( x = " + x + " y = " + y + " )";
    }
}
