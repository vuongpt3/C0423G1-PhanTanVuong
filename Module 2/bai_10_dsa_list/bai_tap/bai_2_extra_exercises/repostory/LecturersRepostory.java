package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory;

import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Lecturers;

import java.util.ArrayList;

public class LecturersRepostory implements iLecturersRepostory {
    public static ArrayList<Lecturers> lecturersArrayList = new ArrayList<>();

    static {
        lecturersArrayList.add(new Lecturers(1, "Chánh TV", "24/02/1996", "Nam", "Full Stack"));
        lecturersArrayList.add(new Lecturers(2, "Trung TVH ", "24/02/1997", "Nam", "Full Stack"));
        lecturersArrayList.add(new Lecturers(3, "Hải TT", "24/02/1998", "Nam", "Full Stack"));
    }

    @Override
    public ArrayList<Lecturers> display() {
        return lecturersArrayList;
    }

    @Override
    public void add(Lecturers lecturers) {
        lecturersArrayList.add(lecturers);
    }

    @Override
    public void delete(Lecturers lecturers) {
        lecturersArrayList.remove(lecturers);
    }

}
