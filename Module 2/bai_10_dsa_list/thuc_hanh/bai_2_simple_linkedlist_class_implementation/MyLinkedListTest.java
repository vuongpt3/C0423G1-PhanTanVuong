package bai_10_dsa_list.thuc_hanh.bai_2_simple_linkedlist_class_implementation;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("==============My Linked List=============");
        MyLinkedList myLinkedList = new MyLinkedList(10);
        myLinkedList.addFirst(15);
        myLinkedList.addFirst(17);
        myLinkedList.addFirst(19);

        myLinkedList.add(4,9);
        myLinkedList.add(5,12);
        myLinkedList.add(6,14);
        myLinkedList.printList();
    }
}
