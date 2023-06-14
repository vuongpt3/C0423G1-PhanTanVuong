package bai_8_cleancode_and_refactoring.thuc_hanh.bai_3_refactoring_method_excaption;

public class Circle {
    public static double getVolume(int radius, int height) {
//        double baseArea = getArea(radius);
//        double perimeter = getPerimeter(radius);
        double volume = getPerimeter(radius) * height * 2 * getArea(radius);
        return volume;
    }

    private static double getArea(int radius) {
        return Math.PI * radius * radius;
    }

    private static double getPerimeter(int radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        System.out.println("Area : " + getArea(10));
        System.out.println("Perimeter : " + getPerimeter(10));
        System.out.println("Volume : " + getVolume(20, 10));
    }
}
