package FuramaResort.service;

import FuramaResort.model.Person.Employee;
import FuramaResort.repository.EmployeeRepository;
import FuramaResort.utils.ReadAndWrite;
import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private final String FILE_PATH = "C:\\C0423G1-PhanTanVuong\\Module 2\\FuramaResort\\data\\employee.csv";
    public static final String ID_EMPLOYEE = "(NV - \\d{0,9)";
    EmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public void display() {
        List<Employee> employeeList = employeeRepository.display();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }


    @Override
    public void addEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Thêm dữ liệu Employee==========");
        while (true){
            try {
                System.out.println("Nhập ID nhân viên ( Định dạng NV-XXXX");
                String id = scanner.nextLine().trim();
                if ((!id.matches("[^NV-[0-9]{4}$]")));
                throw new InvalidEmployeeCodeException("Id lỗi định dạng , sửa lại");
            }catch (InvalidPropertiesFormatException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập họ tên nhân viên");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh nhân viên");
        String date = scanner.nextLine();
        System.out.println("Nhập giới tính nhân viên");
        String gender = scanner.nextLine();
        System.out.println("Nhập CMND nhân viên");
        String idNumber = scanner.nextLine();
        System.out.println("Nhập số điện thoại nhân viên");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập Email nhân viên");
        String email = scanner.nextLine();
        System.out.println("Nhập trình độ nhân viên");
        String qualification = scanner.nextLine();
        System.out.println("Nhập vị trí của nhân viên");
        String position = scanner.nextLine();
        System.out.println("Nhập lương của nhân viên");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id,name,date,gender,idNumber,phoneNumber,email,qualification,position,salary);
        employeeRepository.addEmployee(employee);
    }

    @Override
    public void editEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID của nhân viên muốn chỉnh sửa");
       String id = scanner.nextLine();
        Employee employee = employeeRepository.findEmployeeById(id);
        System.out.println(employee);
        if (employee != null) {
                System.out.println("Bạn muốn chỉnh sửa dữ liệu gì của nhân viên : " + id + " ? " +
                        "\n1. Họ và tên" +
                        "\n2. Ngày sinh" +
                        "\n3. Giới tính" +
                        "\n4. Số CMND" +
                        "\n5. Số điện thoại" +
                        "\n6. Email" +
                        "\n7. Trình độ" +
                        "\n8. Chức vụ" +
                        "\n9. Lương");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1 :
                        System.out.println("Mời nhập tên mới thay thế cho" + employee.getFullName());
                        String nameNew = scanner.nextLine();
                        employee.setFullName(nameNew);
                        System.out.println("Chỉnh sửa tên hoàn tất");
                        System.out.println(employee);
                        break;
                    case 2 :
                        System.out.println("Mời nhập ngày sinh mới thay thế cho : " + employee.getFullName());
                        String dateNew = scanner.nextLine();
                        employee.setDateOfBirth(dateNew);
                        System.out.println("Chỉnh sửa ngày sinh hoàn tất");
                        System.out.println(employee);
                        break;
                    case 3 :
                        System.out.println("Mời nhập giới tính mới thay thế cho " + employee.getFullName());
                        String genderNew = scanner.nextLine();
                        employee.setGender(genderNew);
                        System.out.println("Chỉnh sửa giới tính hoàn tất");
                        System.out.println(employee);
                        break;
                    case 4 :
                        System.out.println("Mời nhập số CMND mới thay thế cho " + employee.getFullName());
                        String idNumberNew = scanner.nextLine();
                        employee.setIdNumber(idNumberNew);
                        System.out.println("Chỉnh sửa CMND hoàn tất");
                        System.out.println(employee);
                        break;
                    case 5 :
                        System.out.println("Mời nhập số điện mới thay thế cho : " + employee.getFullName());
                        String phoneNumberNew = scanner.nextLine();
                        employee.setPhoneNumber(phoneNumberNew);
                        System.out.println("Chỉnh sửa số điện thoại hoàn tất");
                        System.out.println(employee);
                        break;
                    case 6 :
                        System.out.println("Mời nhập Email mới thay thế cho " + employee.getFullName());
                        String emailNew = scanner.nextLine();
                        employee.setEmail(emailNew);
                        System.out.println("Chỉnh sửa Email hoàn tất");
                        System.out.println(employee);
                        break;
                    case 7 :
                        System.out.println("Mời nhập trình độ mới thay thế cho " + employee.getFullName());
                        String qualificationNew = scanner.nextLine();
                        employee.setQualification(qualificationNew);
                        System.out.println("Chỉnh sửa trình độ hoàn tất");
                        System.out.println(employee);
                        break;
                    case 8 :
                        System.out.println("Mời nhập vị trí mới thay thế cho " + employee.getFullName());
                        String positionNew = scanner.nextLine();
                        employee.setPosition(positionNew);
                        System.out.println("Chỉnh sửa vị trí nhân viên hoàn tất");
                        System.out.println(employee);
                        break;
                    case 9 :
                        System.out.println("Mời nhập lương  mới thay thế cho " + employee.getFullName());
                        int salaryNew = scanner.nextInt();
                        employee.setSalary(salaryNew);
                        System.out.println("Chỉnh sửa lương cho nhân viên hoàn tất");
                        System.out.println(employee);
                        break;
                }
                employeeRepository.editEmployee(id,employee);
        }
    }
}
