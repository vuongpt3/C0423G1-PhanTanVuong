package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.service;

import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.model.Lecturers;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory.LecturersRepostory;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory.StudentRepostory;

import java.util.Scanner;

public class LecturersService implements ILecturersService {
    private final LecturersRepostory lecturersRepostory = new LecturersRepostory();
    Lecturers[] lecturers = lecturersRepostory.display().toArray(new Lecturers[0]);

    @Override
    public void display() {
        for (int i = 0; i < lecturers.length; i++) {
            System.out.println(lecturers[i]);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id giảng viên");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên giảng viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh giảng viên");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính giảng viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập chuyên môn của giảng viên");
        String specialize = scanner.nextLine();
        Lecturers lecturers = new Lecturers(id, name, date, gender, specialize);
        lecturersRepostory.add(lecturers);
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id giảng viên mà bạn muốn xóa");
        int lecturersID = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < StudentRepostory.studentsArrayList.size(); i++) {
            if (StudentRepostory.studentsArrayList.get(i).getId() == lecturersID) {
                StudentRepostory.studentsArrayList.remove(i);
                break;
            } else {
                System.out.println("Không có học viên mang ID này");
                break;
            }

        }
    }
}
