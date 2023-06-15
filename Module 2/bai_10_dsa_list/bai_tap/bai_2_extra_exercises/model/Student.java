package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Student {
    private int id;
    private String name;
    private String date;
    private String gender;
    private String className;
    private double point;

    public Student(int id, String name, String date, String gender, String className, double point) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.className = className;
        this.point = point;
    }

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", className='" + className + '\'' +
                ", point=" + point +
                '}';
    }
}
