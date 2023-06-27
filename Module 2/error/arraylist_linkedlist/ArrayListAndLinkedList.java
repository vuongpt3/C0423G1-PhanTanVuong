package error.arraylist_linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ArrayListAndLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        arrayList.add("Grapes");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Car");
        linkedList.add("Bus");
        linkedList.add("Train");
        linkedList.add("Bicycle");
        linkedList.add("Motorcycle");

        Random random = new Random();

        // Truy cập ngẫu nhiên trong ArrayList
        int randomIndexArrayList = random.nextInt(arrayList.size());
        String randomElementArrayList = arrayList.get(randomIndexArrayList);
        System.out.println("Random element from ArrayList: " + randomElementArrayList);

        // Truy cập ngẫu nhiên trong LinkedList
        int randomIndexLinkedList = random.nextInt(linkedList.size());
        String randomElementLinkedList = linkedList.get(randomIndexLinkedList);
        System.out.println("Random element from LinkedList: " + randomElementLinkedList);
    }
}
