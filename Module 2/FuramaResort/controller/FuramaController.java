package FuramaResort.controller;

import FuramaResort.service.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FuramaController {
    EmployeeService employeeService = new EmployeeService();
    ICustomerService customerService = new CustomerService();
    IFacilityService facilityService = new FacilityService();
    Scanner scanner = new Scanner(System.in);
    boolean flag = true;

    public void displayMainMenu() {
        try {
            System.out.println("====================Lựa chọn các chức năng trên menu====================" +
                    "\n1. Employee Management" +
                    "\n2. Customer Management" +
                    "\n3. Facility Management" +
                    "\n4. Booking Management" +
                    "\n5. Promotion Management" +
                    "\n6. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("====================Employee Management Menu====================" +
                                    "\n1. Display list Employee" +
                                    "\n2. Add new Employee" +
                                    "\n3. Edit Employee" +
                                    "\n4. Return to Menu");
                            int choose1 = Integer.parseInt(scanner.nextLine());

                            if (choose1 == 1) {
                                employeeService.display();
                                System.out.println();
                                displayMainMenu();
                                break;
                            } else if (choose1 == 2) {
                                employeeService.addEmployee();
                                System.out.println("|||||");
                                System.out.println("||||||||||");
                                System.out.println("||||||||||||||||");
                                System.out.println("||||||||||||||||||||||");
                                System.out.println("|||||||||||||||||||||||||||||| 100%");
                                System.out.println("Thêm thông tin nhân viên hoàn tất!!!!!");
                                System.out.println();
                                displayMainMenu();
                                break;
                            } else if (choose1 == 3) {
                                employeeService.editEmployee();
                                System.out.println();
                                displayMainMenu();
                                break;
                            } else if (choose1 == 4) {
                                System.out.println("====================Chào mừng về lại Menu Chính====================");
                                displayMainMenu();
                                break;
                            } else if (choose1 > 4) {
                                throw new InputMismatchException("Lựa chọn không hợp lệ");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.println("====================Customer Management Menu====================" +
                                    "\n1. Display list Customer" +
                                    "\n2. Add new Customer" +
                                    "\n3. Edit Customer" +
                                    "\n4. Return to Menu");
                            int choose2 = Integer.parseInt(scanner.nextLine());
                            if (choose2 == 1) {
                                customerService.display();
                                break;
                            } else if (choose2 == 2) {
                                customerService.addCustomer();
                                break;

                            } else if (choose2 == 3) {
                                customerService.editCustomer();
                                break;
                            } else if (choose2 == 4) {
                                displayMainMenu();
                                break;
                            } else if (choose2 > 4) {
                                throw new InputMismatchException("Lựa chọn không chính xác , chọn lại");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.println("====================Facility Management Menu====================" +
                                    "\n1. Display list facility" +
                                    "\n2. Add new facility" +
                                    "\n3. Display list facility maintenance" +
                                    "\n4. Return to Menu");
                            int choose3 = Integer.parseInt(scanner.nextLine());
                            if (choose3 == 1) {
                                facilityService.display();
                                displayMainMenu();
                                break;
                            } else if (choose3 == 2) {
                                facilityService.addFacility();
                                facilityService.display();
                                displayMainMenu();
                                break;
                            } else if (choose3 == 3) {

                                break;
                            } else if (choose3 == 4) {
                                displayMainMenu();
                                break;
                            } else if (choose3 > 4) {
                                throw new InputMismatchException("Lựa chọn sai rồi bro , mời nhập lại");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 4:
                    while (true) {
                        System.out.println("====================Booking Management Menu====================" +
                                "\n1. Add new booking" +
                                "\n2. Display list booking" +
                                "\n3. Creat new contract" +
                                "\n3. Display list contract" +
                                "\n3. Edit contract" +
                                "\n4. Return to Menu");
                        try {
                            int choose4 = Integer.parseInt(scanner.nextLine());
                            if (choose4 == 1) {

                                break;
                            } else if (choose4 == 2) {

                                break;
                            } else if (choose4 == 3) {

                                break;
                            } else if (choose4 == 4) {
                                displayMainMenu();
                                break;
                            } else if (choose4 > 4) {
                                throw new InputMismatchException("Lựa chọn sai rồi bro , chọn lại");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 5:
                    System.out.println("====================Promotion Management Menu====================" +
                            "\n1. Display list customers use service" +
                            "\n2. Display list customers get voucher" +
                            "\n3. Return to Menu");
                    while (true) {
                        try {
                            int choose5 = Integer.parseInt(scanner.nextLine());
                            if (choose5 == 1) {

                                break;
                            }
                            if (choose5 == 2) {

                                break;
                            } else if (choose5 == 3) {
                                displayMainMenu();
                                break;
                            } else if (choose5 > 3) {
                                throw new InputMismatchException("Lựa chọn sai rồi bro");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                case 6:
                    System.out.println("Good bye bro");
                    break;
            }
            if (choose > 6) {
                throw new InputMismatchException("Lựa chọn sai rồi bro");
            }

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
}
