package bai6_demo.bai_3_point_class_and_moveable_class;

public class MoveablePoint extends Point {
    float xSpeed;
    float ySpeed;
    public MoveablePoint(float x, float y, float xSpeed , float ySpeed){
        super(x ,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(){

    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }
    public void setSpeed(float xSpeed , float ySpeed){
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed , ySpeed};
    }
    @Override
    public String toString(){
        return "Point = ( X = " + x + " Y = " + y + " ) . Speed ( XS = " + xSpeed + " YS = " + ySpeed + " ) ";
    }
    public MoveablePoint move(){
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setXY(newX, newY);
        return this;
    }
}
