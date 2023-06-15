package model_mvc.service;

import model_mvc.model.Student;
import model_mvc.repostory.StudentRepostory;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private final StudentRepostory studentRepostory = new StudentRepostory();

    Student[] students = studentRepostory.display();
    @Override
    public void display() {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính");
        String gender = scanner.nextLine();
        System.out.println("Nhập tên lớp");
        String className = scanner.nextLine();
        Student student = new Student(id , name,gender,className);
        studentRepostory.add(student);
    }

    @Override
    public void delete() {

    }
}
