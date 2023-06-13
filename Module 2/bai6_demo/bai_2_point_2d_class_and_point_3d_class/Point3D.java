package bai6_demo.bai_2_point_2d_class_and_point_3d_class;

import java.util.Arrays;

public class Point3D extends Point2D {
    public float z ;
    public Point3D(float x, float y , float z){
        super(x , y);
        this.z = z;
    }
    public Point3D(){

    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y , float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{x ,y ,z};
    }
    @Override
    public String toString(){
        return  "( X = " + x + " Y = " + y + " Z = " + z + " )";
    }
}
