package bai_4_classes_and_objects_in_java.thuc_hanh;
import java.util.Scanner;

public class MainRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height");
        double height = scanner.nextDouble();
        System.out.println("Enter width");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width ,height);
        System.out.println("Your Retangle " + rectangle.Display());
        System.out.println("Perimeter is : " + rectangle.Perimeter());
        System.out.println("Area :  " + rectangle.Area());
    }
}
