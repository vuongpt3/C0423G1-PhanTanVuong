package FuramaResort.service;

import FuramaResort.model.Person.Employee;
import FuramaResort.repository.EmployeeRepository;
import FuramaResort.utils.FormatException;
import FuramaResort.utils.ReadAndWrite;
import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

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
        String id;
        String name;
        String date;
        String gender;
        String idNumber;
        String phoneNumber;
        String email;
        String qualification;
        String position;
        String salary;
        while (true) {
            try {
                System.out.println("Nhập ID nhân viên ( Định dạng NV-XXXX");
                id = scanner.nextLine().trim();
                if ((id.matches("^NV-[0-9]{4}$"))) {
                    break;
                }
                throw new FormatException("Id lỗi định dạng , sửa lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Nhập họ tên nhân viên");
            try {
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]+(\\s[A-Z][a-z]+)+$")) {
                    break;
                }
                throw new FormatException("lỗi định dạng");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Nhập ngày tháng năm sinh nhân viên");
            Calendar calendar = Calendar.getInstance();
            int year1 = calendar.get(Calendar.YEAR);
            System.out.println("Nhập ngày");
            int date1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tháng");
            int monnth1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập năm");
            int year = Integer.parseInt(scanner.nextLine());
            try {
                if (year1 - year > 18 && (date1 > 0 || date1 < 32) && (monnth1 > 0 || monnth1 < 13) && year > 0){
                    date = (date1 + "-" + monnth1 + "-"+ year);
                    break;
                }
                throw new FormatException("Lỗi nhập , em gái chưa 18 hoặc nhập sai ngày tháng năm , Nhập lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }


//        System.out.println("Nhập giới tính nhân viên");
//         gender = scanner.nextLine();
//        System.out.println("Nhập CMND nhân viên");
//         idNumber = scanner.nextLine();
//        System.out.println("Nhập số điện thoại nhân viên");
//         phoneNumber = scanner.nextLine();
//        System.out.println("Nhập Email nhân viên");
//         email = scanner.nextLine();
//        System.out.println("Nhập trình độ nhân viên");
//         qualification = scanner.nextLine();
//        System.out.println("Nhập vị trí của nhân viên");
//         position = scanner.nextLine();
//        System.out.println("Nhập lương của nhân viên");
//         salary = scanner.nextLine();
//        Employee employee = new Employee(id, name, date, gender, idNumber, phoneNumber, email, qualification, position, salary);
//        employeeRepository.addEmployee(employee);
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
            switch (choose) {
                case 1:
                    System.out.println("Mời nhập tên mới thay thế cho" + employee.getFullName());
                    String nameNew = scanner.nextLine();
                    employee.setFullName(nameNew);
                    System.out.println("Chỉnh sửa tên hoàn tất");
                    System.out.println(employee);
                    break;
                case 2:
                    System.out.println("Mời nhập ngày sinh mới thay thế cho : " + employee.getFullName());
                    String dateNew = scanner.nextLine();
                    employee.setDateOfBirth(dateNew);
                    System.out.println("Chỉnh sửa ngày sinh hoàn tất");
                    System.out.println(employee);
                    break;
                case 3:
                    System.out.println("Mời nhập giới tính mới thay thế cho " + employee.getFullName());
                    String genderNew = scanner.nextLine();
                    employee.setGender(genderNew);
                    System.out.println("Chỉnh sửa giới tính hoàn tất");
                    System.out.println(employee);
                    break;
                case 4:
                    System.out.println("Mời nhập số CMND mới thay thế cho " + employee.getFullName());
                    String idNumberNew = scanner.nextLine();
                    employee.setIdNumber(idNumberNew);
                    System.out.println("Chỉnh sửa CMND hoàn tất");
                    System.out.println(employee);
                    break;
                case 5:
                    System.out.println("Mời nhập số điện mới thay thế cho : " + employee.getFullName());
                    String phoneNumberNew = scanner.nextLine();
                    employee.setPhoneNumber(phoneNumberNew);
                    System.out.println("Chỉnh sửa số điện thoại hoàn tất");
                    System.out.println(employee);
                    break;
                case 6:
                    System.out.println("Mời nhập Email mới thay thế cho " + employee.getFullName());
                    String emailNew = scanner.nextLine();
                    employee.setEmail(emailNew);
                    System.out.println("Chỉnh sửa Email hoàn tất");
                    System.out.println(employee);
                    break;
                case 7:
                    System.out.println("Mời nhập trình độ mới thay thế cho " + employee.getFullName());
                    String qualificationNew = scanner.nextLine();
                    employee.setQualification(qualificationNew);
                    System.out.println("Chỉnh sửa trình độ hoàn tất");
                    System.out.println(employee);
                    break;
                case 8:
                    System.out.println("Mời nhập vị trí mới thay thế cho " + employee.getFullName());
                    String positionNew = scanner.nextLine();
                    employee.setPosition(positionNew);
                    System.out.println("Chỉnh sửa vị trí nhân viên hoàn tất");
                    System.out.println(employee);
                    break;
                case 9:
                    System.out.println("Mời nhập lương  mới thay thế cho " + employee.getFullName());
                    String salaryNew = scanner.nextLine();
                    employee.setSalary(salaryNew);
                    System.out.println("Chỉnh sửa lương cho nhân viên hoàn tất");
                    System.out.println(employee);
                    break;
            }
            employeeRepository.editEmployee(id, employee);
        }
    }
}
