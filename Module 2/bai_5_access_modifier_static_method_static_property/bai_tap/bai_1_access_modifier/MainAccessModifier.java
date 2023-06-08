package bai_5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier;

import bai_5_access_modifier_static_method_static_property.bai_tap.bai_1_access_modifier.AccessModifier;

public class MainAccessModifier {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier(3.5);

        double radius = accessModifier.getRadius();
        double area = accessModifier.getArea();

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}
