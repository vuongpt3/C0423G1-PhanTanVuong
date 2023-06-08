package bai_5_access_modifier_static_method_static_property.bai_tap.bai_2_build_class_only_write_in_java;

public class MainBuildClassOnlyWriteIn {
    public static void main(String[] args) {
        BuildClassOnlyWriteInJava student = new BuildClassOnlyWriteInJava();
        student.setName("Vương");
        student.setClasses("C0423G1");

        String name = student.getName();
        String classes = student.getClasses();

        System.out.println("Name : " + name);
        System.out.println("Classes : " + classes);
    }
}
