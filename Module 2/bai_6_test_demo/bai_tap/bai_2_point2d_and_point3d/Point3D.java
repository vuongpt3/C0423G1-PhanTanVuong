package bai_6_test_demo.bai_tap.bai_2_point2d_and_point3d;

public class Point3D extends Point2D {
    public float z ;
    public Point3D(){
        z = 0.0f;
    }
    public Point3D( float x , float y , float z){
        super(x , y);
        this.z = z;
    }


    public void setZ(float z) {
        this.z = z;
    }
    public void setXY(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[] {x, y, z};
    }
    @Override
    public String toString(){
        return "Point 3D ( x = " + x + " y = " + y + " z = " + z + " ) ";
    }
}
