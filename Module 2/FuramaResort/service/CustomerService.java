package FuramaResort.service;

import FuramaResort.model.Person.Customer;
import FuramaResort.repository.CustomerRepository;
import FuramaResort.utils.FormatException;

import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public void display() {
        List<Customer> customerList = customerRepository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() {
        String id;
        String name;
        String date;
        String gender;
        String idNumber;
        String phoneNumber;
        String email;
        String customerType;
        String address;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập mã Khách hàng ( Định dạng KH-XXXX)");
            try {
                id = scanner.nextLine();
                if (id.matches("^(KH-\\d{4})$")) {
                    break;
                }
                throw new FormatException("Lỗi định dạng , Nhập lại!!!!!!!!!!!");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Nhập tên khách hàng");
            try {
                name = scanner.nextLine();
                if (name.matches("^[A-Z][a-z]+(\\s[A-Za-z]+)+$")) {
                    break;
                }
                throw new FormatException("Lỗi định dạng , Nhập lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Nhập ngày sinh khách hàng");
            try {
                Calendar calendar = Calendar.getInstance();
                int yearNow = calendar.get(Calendar.YEAR);
                System.out.println("Nhập ngày ");
                int day = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tháng ");
                int month = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập năm");
                int year = Integer.parseInt(scanner.nextLine());
                if (yearNow - year >= 18 && day > 0 && day < 32 && month > 0 && month < 13 && year > 0) {
                    date = day + "-" + month + "-" + year + "";
                    break;
                }
                throw new FormatException("Em gái chưa 18 hoặc nhập sai ngày tháng năm , Nhập lại đê");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập giới tính khách hàng");
        gender = scanner.nextLine();
        while (true) {
            System.out.println("Nhập số CMND khách hàng ( 9 or 12 number)");
            try {
                idNumber = scanner.nextLine();
                if (idNumber.matches("^\\d{9}$") || idNumber.matches("^\\d{12}$")) {
                    break;
                }
                throw new FormatException("Nhập thiếu số , Nhập lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            System.out.println("Nhập số điện thoại khách hàng");
            try {
                phoneNumber = scanner.nextLine();
                if (phoneNumber.matches("^(0\\d{9})$")) {
                    break;
                }
                throw new FormatException("Số điện thoại là 10 số và bắt đầu từ 0 , Nhập lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập Email khách hàng");
        email = scanner.nextLine();
        while (true) {
            System.out.println("Nhập loại khách" +
                    "\n1. Diamond" +
                    "\n2. Platinum" +
                    "\n3. Gold" +
                    "\n4. Silver" +
                    "\n5. Member");
            try {
                customerType = scanner.nextLine();
                if (customerType.equalsIgnoreCase("Diamond") || customerType.equalsIgnoreCase("Platinum") || customerType.equalsIgnoreCase("Gold") || customerType.equalsIgnoreCase("Silver") || customerType.equalsIgnoreCase("Member")) {
                    break;
                }
                throw new FormatException("Nhập không đúng loại , Nhập lại");
            } catch (FormatException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập địa chỉ của khách hàng");
        address = scanner.nextLine();
        Customer customer = new Customer(id, name, date, gender, idNumber, phoneNumber, email, customerType, address);
        customerRepository.addCustomer(customer);
    }

    @Override
    public void editCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID khách hàng muốn chỉnh sửa");
        String id = scanner.nextLine();
        Customer customer = customerRepository.findCustomerByID(id);
        System.out.println(customer);
        if (customer != null) {
            System.out.println("Bạn muốn sửa gì" +
                    "\n1. Tên khách hàng" +
                    "\n2. Ngày sinh khách hàng" +
                    "\n3. Giới tính khách hàng" +
                    "\n4. Số CMND khách hàng" +
                    "\n5. Số điện thoại khách hàng" +
                    "\n6. Email khách hàng" +
                    "\n7. Loại khách hàng" +
                    "\n8. Địa  chỉ khách hàng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhập tên mới khách " + customer.getFullName() + " , Tên hiện tại của khách là : " + customer.getFullName());
                    String namecustomer = scanner.nextLine();
                    customer.setFullName(namecustomer);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 2:
                    System.out.println("Nhập ngày sinh mới cho khách " + customer.getFullName());
                    String date = scanner.nextLine();
                    customer.setDateOfBirth(date);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 3:
                    System.out.println("Nhập giới tính mới khách " + customer.getFullName() + " đang là : " + customer.getGender());
                    String gender = scanner.nextLine();
                    customer.setGender(gender);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 4:
                    System.out.println("Nhập tên khách thay thế cho " + customer.getFullName());
                    String idNumber = scanner.nextLine();
                    customer.setIdNumber(idNumber);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 5:
                    System.out.println("Nhập số điện thoại mới cho khách " + customer.getFullName());
                    String phoneNumber = scanner.nextLine();
                    customer.setPhoneNumber(phoneNumber);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 6:
                    System.out.println("Nhập email mới cho khách " + customer.getFullName());
                    String email = scanner.nextLine();
                    customer.setEmail(email);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 7:
                    System.out.println("Nhập loại mới cho khách " + customer.getFullName());
                    String customerType = scanner.nextLine();
                    customer.setCustomerType(customerType);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                case 8:
                    System.out.println("Nhập địa mới cho khách " + customer.getFullName() + " , Địa chỉ hiện tại đang ở : " + customer.getAddress());
                    String address = scanner.nextLine();
                    customer.setAddress(address);
                    System.out.println("Chỉnh sửa hoàn tất");
                    break;
                default:
                    System.out.println("Chọn sai rồi bro");
            }
            customerRepository.editCustomer(id, customer);
        }
    }

}
