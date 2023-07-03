package FuramaResort.service;

import FuramaResort.common.Regex;
import FuramaResort.model.Facility.Facility;
import FuramaResort.model.Facility.House;
import FuramaResort.model.Facility.Room;
import FuramaResort.model.Facility.Villa;
import FuramaResort.repository.FacilityRepository;
import FuramaResort.utils.FormatException;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    FacilityRepository facilityRepository = new FacilityRepository();
    Regex regex = new Regex();

    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public void display() {
        Map<Facility, Integer> facilities = facilityRepository.getFacilities();
        for (Facility facility : facilities.keySet()) {
            System.out.println(facility);
        }
    }

    @Override
    public void addFacility() {
        String id;
        String id1;
        String id2;
        String name;
        String name1;
        String name2;
        double area;
        double area1;
        double area2;
        double rentalCost;
        double rentalCost1;
        double rentalCost2;
        int maxOccupancy;
        int maxOccupancy1;
        int maxOccupancy2;
        String rentalType;
        String rentalType1;
        String rentalType2;
        String roomStandard;
        String roomStandard1;
        double poolArea;
        int numberOfFloors;
        int numberOfFloors1;
        String freeService;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Muốn thêm mới cái gì ?" +
                "\n1. Villa" +
                "\n2. House" +
                "\n3. Room" +
                "\n4. Back to Menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                while (true) {
                    System.out.println("Nhập mã dịch vụ");
                    try {
                        id = scanner.nextLine();
                        if (Regex.idVilla(id)) {
                            break;
                        }
                        throw new FormatException("ID không đúng định dạng , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (true) {
                    System.out.println("Nhập tên dịch vụ (Chữ cái đầu In Hoa)");
                    try {
                        name = scanner.nextLine();
                        if (Regex.serviceName(name)) {
                            break;
                        }
                        throw new FormatException("Lỗi tên sai định dạng , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (true) {
                    System.out.println("Nhập diện tích sử dụng");
                    try {
                        area = Double.parseDouble(scanner.nextLine());
                        if (area > 30) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập chi phí thuê");
                rentalCost = scanner.nextDouble();
                while (true) {
                    System.out.println("Nhập số người tối đa ( Nhỏ hơn 20 và lớn hơn 0 người )");
                    try {
                        maxOccupancy = Integer.parseInt(scanner.nextLine());
                        if (maxOccupancy > 0 && maxOccupancy < 20) {
                            break;
                        }
                        throw new FormatException("Số người quá nhiều , hoặc 0 người , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập kiểu thuê");
                rentalType = scanner.nextLine();
                System.out.println("Nhập tiêu chuẩn phòng");
                roomStandard = scanner.nextLine();
                while (true) {
                    System.out.println("Nhập diện tích hồ bơi");
                    try {
                        poolArea = scanner.nextDouble();
                        if (poolArea > 30) {
                            break;
                        }
                        throw new FormatException("Diện tích hồ bơi phải lớn hơn 30 , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (true) {
                    System.out.println("Nhập số tầng");
                    try {
                        numberOfFloors = Integer.parseInt(scanner.nextLine());
                        if (numberOfFloors > 0) {
                            break;
                        }
                        throw new FormatException("Số tầng phải lớn hơn 0, Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                Villa villa = new Villa(id, name, area, rentalCost, maxOccupancy, rentalType, roomStandard, poolArea, numberOfFloors);
                facilityRepository.addFacility(villa);
                break;
            case 2:
                while (true) {
                    System.out.println("Nhập mã dịch vụ ( SVHO-XXXX)");
                    try {
                        id1 = scanner.nextLine();
                        if (Regex.idHouse(id1)) {
                            break;
                        }
                        throw new FormatException("Lỗi định dạng , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (true) {
                    System.out.println("Nhập tên dịch vụ");
                    try {
                        name1 = scanner.nextLine();
                        if (Regex.serviceName(name1)) {
                            break;
                        }
                        throw new FormatException("Chữ cái đầu viết hoa còn lại viết thường , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                while (true) {
                    System.out.println("Nhập diện tích sử dụng");
                    try {
                        area1 = scanner.nextDouble();
                        if (area1 > 30) {
                            break;
                        }
                        throw new FormatException("Diện tích phải lớn hơn 30 , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập chi phí thuê");
                rentalCost1 = scanner.nextDouble();
                while (true) {
                    System.out.println("Nhập số người tối đa ( Nhỏ hơn 20 và lớn hơn 0 người )");
                    try {
                        maxOccupancy1 = Integer.parseInt(scanner.nextLine());
                        if (maxOccupancy1 > 0 && maxOccupancy1 < 20) {
                            break;
                        }
                        throw new FormatException("Số người quá nhiều , hoặc 0 người , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập kiểu thuê");
                rentalType1 = scanner.nextLine();
                System.out.println("Nhập tiêu chuẩn phòng");
                roomStandard1 = scanner.nextLine();
                while (true) {
                    System.out.println("Nhập số tầng");
                    try {
                        numberOfFloors1 = Integer.parseInt(scanner.nextLine());
                        if (numberOfFloors1 > 0) {
                            break;
                        }
                        throw new FormatException("Số tầng phải lớn hơn 0, Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    }
                }
                House house = new House(id1, name1, area1, rentalCost1, maxOccupancy1, rentalType1, roomStandard1, numberOfFloors1);
                facilityRepository.addFacility(house);
                break;
            case 3:
                System.out.println("Nhập mã dịch vụ");
                id2 = scanner.nextLine();
                System.out.println("Nhập tên dịch vụ");
                name2 = scanner.nextLine();
                while (true) {
                    System.out.println("Nhập diện tích sử dụng");
                    try {
                        area2 = Double.parseDouble(scanner.nextLine());
                        if (area2 > 30) {
                            break;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập chi phí thuê");
                rentalCost2 = scanner.nextDouble();
                while (true) {
                    System.out.println("Nhập số người tối đa ( Nhỏ hơn 20 và lớn hơn 0 người )");
                    try {
                        maxOccupancy2 = Integer.parseInt(scanner.nextLine());
                        if (maxOccupancy2 > 0 && maxOccupancy2 < 20) {
                            break;
                        }
                        throw new FormatException("Số người quá nhiều , hoặc 0 người , Nhập lại");
                    } catch (FormatException e) {
                        System.out.println(e.getMessage());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println("Nhập kiểu thuê");
                rentalType2 = scanner.nextLine();
                System.out.println("Nhập dịch vụ miễn phí");
                freeService = scanner.nextLine();
                Room room = new Room(id2, name2, area2, rentalCost2, maxOccupancy2, rentalType2, freeService);
                facilityRepository.addFacility(room);
                break;

        }


    }

    @Override
    public void editFacility() {

    }
}
