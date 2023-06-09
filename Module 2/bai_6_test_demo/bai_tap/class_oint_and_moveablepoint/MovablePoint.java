package bai_6_test_demo.bai_tap.class_oint_and_moveablepoint;

public class MovablePoint extends Point {
    public float xSpeed ;
    public float ySpeed;
    public MovablePoint(float x , float y , float xSpeed , float ySpeed){
        super(x , y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint( float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        xSpeed = 0.0f;
        ySpeed = 0.0f;
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

    public void setXY(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getXY() {
        return new float[] {xSpeed , ySpeed};
    }
    @Override
    public String toString(){
        return "MovablePoint ( x = " + x + " . y = " + y + " ) . Speed ( xSpeed = " + xSpeed + " . ySpeed = " + ySpeed + " ).";
    }
    public MovablePoint move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setXY(newX, newY);
        return this;
    }
}
