package model_mvc.repostory;

import model_mvc.model.Student;

public interface IStudentRepostory {
    Student[] display();
    void add(Student student);
    void delete();
}
