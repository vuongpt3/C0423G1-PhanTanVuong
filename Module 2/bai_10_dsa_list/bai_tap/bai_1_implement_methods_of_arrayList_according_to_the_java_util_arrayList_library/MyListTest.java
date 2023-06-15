package bai_10_dsa_list.bai_tap.bai_1_implement_methods_of_arrayList_according_to_the_java_util_arrayList_library;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        System.out.println("Elements in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("Size of Array before removal : " + myList.size());
        System.out.println("Remove 1 element at random position");
        String removedElement = myList.remove(1);
        System.out.println("Removed element: " + removedElement);

        System.out.println("Elements in the list after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("Size of Array after removal : " + myList.size());
    }
}
