package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model;

import java.util.Date;
import java.util.Locale;

public class Lecturers {
    private int id;
    private String name;
    private String date;
    private String gender;
    private String specialize;

    public Lecturers(int id, String name, String date, String gender, String specialize) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.specialize = specialize;
    }

    public Lecturers() {

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

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Lecturers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", gender='" + gender + '\'' +
                ", specialize='" + specialize + '\'' +
                '}';
    }
}
