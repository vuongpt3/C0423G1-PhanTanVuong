package model_mvc.controller;

import model_mvc.service.StudentService;
import java.util.Scanner;

public class StudentController {
    private static StudentService studentService = new StudentService();
    public static void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Nhập chứ năng : " +
                    "\n1.Hiển thị" +
                    "\n2.Thêm" +
                    "\n3.Xóa" +
                    "\n4.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    System.out.println("Hiển thị dữ liệu");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("Thêm dữ liệu");
                    studentService.add();
                default:
                    System.out.println("Out");
            }
        }while (true);
    }

}
