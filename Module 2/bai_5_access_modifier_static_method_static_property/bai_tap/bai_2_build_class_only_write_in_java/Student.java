package bai_5_access_modifier_static_method_static_property.bai_tap.bai_2_build_class_only_write_in_java;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "Vương";
        classes = "C0323G1";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    public String getName() {

        return name;
    }

    public String getClasses() {

        return classes;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Alice");
        student.setClasses("C03");

        String name = student.getName();
        String classes = student.getClasses();

        System.out.println("Name : " + name);
        System.out.println("Classes : " + classes);
    }
}
