package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory;

import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Student;

import java.util.ArrayList;

public class StudentRepostory implements IStudentRepostory {
    static public ArrayList<Student> studentsArrayList = new ArrayList<>();

    static {
        studentsArrayList.add(new Student(1, "Phan Tấn Vương", "14/02/2001", "Nam", "C04", 5.0));
        studentsArrayList.add(new Student(2, "Bùi Hữu Hải", "14/02/2001", "Nam", "C04", 5.0));
        studentsArrayList.add(new Student(3, "Nguyễn Đình Thôi", "14/02/2001", "Nam", "C04", 5.0));
    }

    @Override
    public ArrayList<Student> display() {
        return studentsArrayList;
    }

    @Override
    public void add(Student student) {
        studentsArrayList.add(student);
    }

    @Override
    public void delete(Student student) {
        studentsArrayList.remove(student);
    }

}
