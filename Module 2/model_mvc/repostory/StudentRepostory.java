package model_mvc.repostory;

import model_mvc.model.Student;

public class StudentRepostory implements IStudentRepostory {
    static Student[] students = new Student[5];
    static {
        students[0] = new Student(1 , "Vương" , "Nam" , "C04");
        students[1] = new Student(2 , "Tấn" , "Nam" , "C04");
        students[2] = new Student(3 , "Phan" , "Nam" , "C04");
    }

    @Override
    public Student[] display() {
        return students;
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete() {

    }
}
