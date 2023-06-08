package bai_6_inheritane.bai_tap.bai_3_class_point_and_moveablePoint;

public class MovablePoint extends Point{
    public float xSpeed;
    public float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }

    public float getXSpeed() {

        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {

        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {

        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {

        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {

        return new float[]{xSpeed, ySpeed};
    }

    public MovablePoint move() {
        float newX = getX() + xSpeed;
        float newY = getY() + ySpeed;
        setXY(newX, newY);
        return this;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }
}
