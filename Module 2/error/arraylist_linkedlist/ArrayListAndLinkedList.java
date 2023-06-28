package error.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        // Thêm dữ liệu vào trong List
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        arrayList.add("Grapes");

        List<String> linkedList = new LinkedList<>();
        //Thêm dữ liệu vào trong List
        linkedList.add("Car");
        linkedList.add("Bus");
        linkedList.add("Train");
        linkedList.add("Bicycle");
        linkedList.add("Motorcycle");

        Random random = new Random();

        // Truy cập ngẫu nhiên trong ArrayList
        int randomIndexArraylist = random.nextInt(arrayList.size()); // Tạo biến random với size = độ dài danh sách
        String randomElement = arrayList.get(randomIndexArraylist); // Truy xuất phần tử ngẫu nhiên trong List
        System.out.println("Phần tử ngẫu nhiên truy xuất bằng ArrayList: " + randomElement); // In ra phần tử ngẫu nhiên

        // Truy cập ngẫu nhiên trong LinkedList
        int randomIndexLinkedList = random.nextInt(linkedList.size()); // Tạo biến random với độ dài là danh sách
        String randomElementLinkedList = linkedList.get(randomIndexLinkedList); // Truy xuất biến ngẫu nhiên trong danh sách
        System.out.println("Phần tử ngẫu nhiên truy xuất bằng LinkedList: " + randomElementLinkedList); // In ra biến ngẫu nhiên
    }
}
