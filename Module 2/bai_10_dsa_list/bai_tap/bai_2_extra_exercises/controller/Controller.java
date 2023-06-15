package bai_10_dsa_list.bai_tap.bai_2_extra_exercises.controller;

import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.repostory.StudentRepostory;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.service.LecturersService;
import bai_10_dsa_list.bai_tap.bai_2_extra_exercises.service.StudentService;

import java.util.Scanner;

public class Controller {
    public static StudentService studentService = new StudentService();
    public static LecturersService lecturersService = new LecturersService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Nhập chức năng " +
                    "\n1. Thêm mới giảng viên hoặc học viên" +
                    "\n2. Xóa giảng viên hoặc học viên" +
                    "\n3. Xem danh sách giảng viên hoặc sinh viên" +
                    "\n4. Thoát" +
                    "\n Chọn chức năng :");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Bạn muốn thêm mới giảng viên hay học viên" +
                            "\n1. Thêm mới học viên" +
                            "\n2. Thêm mới giảng viên");
                    int select = Integer.parseInt(scanner.nextLine());
                    if (select == 1) {
                        studentService.add();
                    }
                    if (select == 2) {
                        lecturersService.add();
                    } else {
                        break;
                    }
                    break;
                case 2:
                    System.out.println("Bro muốn xóa giảng viên hay học viên" +
                            "\n1. Xóa học viên" +
                            "\n2. Xóa giảng viên");
                    int select1 = Integer.parseInt(scanner.nextLine());
                    if (select1 == 1) {
                        studentService.delete();
                        System.out.println("Danh sách sau khi xóa");
                        studentService.display();
                    }
                    if (select1 == 2) {
                        lecturersService.delete();
                        System.out.println("Danh sách sau khi xóa");
                        lecturersService.display();
                    }

                    break;
                case 3:
                    System.out.println("Bro muốn xem danh sách nào" +
                            "\n1. Danh sách học viên" +
                            "\n2.Danh sách giảng viên");
                    int select2 = Integer.parseInt(scanner.nextLine());
                    if (select2 == 1) {
                        studentService.display();
                    }
                    if (select2 == 2) {
                        lecturersService.display();
                    }
                    break;
                case 4:
                    System.out.println("Đã thoát");
                    break;
                default:
                    System.out.println("Nhập sai chức năng");
            }
        } while (flag);
    }
}
