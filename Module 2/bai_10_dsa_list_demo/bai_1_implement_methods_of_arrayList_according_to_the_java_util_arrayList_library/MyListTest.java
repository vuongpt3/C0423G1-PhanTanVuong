package bai_10_dsa_list_demo.bai_1_implement_methods_of_arrayList_according_to_the_java_util_arrayList_library;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Banana");
        System.out.println("Elements in my list : ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("Removing element at index 1 : ");
        String removeElement = myList.remove(1);
        System.out.println("Remove element : " + removeElement);

        System.out.println("Elements in the list after removal : ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}
