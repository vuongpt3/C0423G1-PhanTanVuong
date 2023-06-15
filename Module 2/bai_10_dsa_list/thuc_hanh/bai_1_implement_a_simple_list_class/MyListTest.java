package bai_10_dsa_list.thuc_hanh.bai_1_implement_a_simple_list_class;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("oke");
        myList.add("123");
        myList.add("456");
        myList.add("789");
        myList.add("101112");
        System.out.println("Elements 1 :" + myList.get(0));
        System.out.println("Elements 2 :" + myList.get(1));
        System.out.println("Elements 3 :" + myList.get(2));
        System.out.println("Elements 4 :" + myList.get(3));
    }
}
