package bai_5_TestDemo;

public class Student {
    private String name;
    private String classes;
    public Student(){

    }
    public Student(String name , String classes){
        name = "Jhon";
        classes = "C02";
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
