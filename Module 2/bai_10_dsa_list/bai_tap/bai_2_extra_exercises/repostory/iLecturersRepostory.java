package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory;

import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Lecturers;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Student;

import java.util.ArrayList;

interface iLecturersRepostory {
    ArrayList<Lecturers> display();

    void add(Lecturers lecturers);

    void delete(Lecturers lecturers);

}
