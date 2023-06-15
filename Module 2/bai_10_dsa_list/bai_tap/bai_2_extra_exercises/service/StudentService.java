package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.service;


import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Student;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory.StudentRepostory;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private final StudentRepostory studentRepostory = new StudentRepostory();
    Student[] students = studentRepostory.display().toArray(new Student[0]);

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
        System.out.println("Nhập tên học viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh của học viên");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính học viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập tên lớp của học viên");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm của học viên");
        double point = scanner.nextDouble();
        Student student = new Student(id, name, date, gender, className, point);
        studentRepostory.add(student);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id học viên muốn xóa");
        int studentID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < StudentRepostory.studentsArrayList.size(); i++) {
            if (StudentRepostory.studentsArrayList.get(i).getId() == studentID) {
                StudentRepostory.studentsArrayList.remove(i);
                break;
            }
        }
    }
}
