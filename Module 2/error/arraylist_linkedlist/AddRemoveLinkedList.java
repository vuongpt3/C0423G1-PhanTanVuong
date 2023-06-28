package error.arraylist_linkedlist;

import java.util.LinkedList;

public class AddRemoveLinkedList {
        public static void main(String[] args) {
            // Khởi tạo một LinkedList
            LinkedList<String> linkedList = new LinkedList<>();

            // Thêm phần tử vào LinkedList
            linkedList.add("Apple");
            linkedList.add("Banana");
            linkedList.add("Cherry");
            linkedList.add("Durian");

            System.out.println("LinkedList ban đầu: " + linkedList);

            // Thêm phần tử vào vị trí đầu tiên
            linkedList.addFirst("Orange");
            System.out.println("LinkedList sau khi thêm vào vị trí đầu: " + linkedList);

            // Thêm phần tử vào vị trí cuối cùng
            linkedList.addLast("Grapes");
            System.out.println("LinkedList sau khi thêm vào vị trí cuối: " + linkedList);

            // Thêm phần tử vào vị trí bất kỳ
            linkedList.add(2, "Kiwi");
            System.out.println("LinkedList sau khi thêm vào vị trí 2: " + linkedList);

            // Xóa phần tử từ LinkedList
            linkedList.remove("Banana");
            System.out.println("LinkedList sau khi xóa phần tử 'Banana': " + linkedList);

            // Xóa phần tử ở vị trí đầu tiên
            linkedList.removeFirst();
            System.out.println("LinkedList sau khi xóa phần tử đầu tiên : " + linkedList);

            //Xóa phần tử ở vị trí cuối cùng
            linkedList.removeLast();
            System.out.println("LinkedList sau khi xóa phần tử cuối cùng : " + linkedList);
        }
}
