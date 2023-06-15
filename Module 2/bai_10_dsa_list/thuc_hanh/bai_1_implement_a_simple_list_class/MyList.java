package bai_10_dsa_list.thuc_hanh.bai_1_implement_a_simple_list_class;

import java.util.Arrays;

public class MyList <E> {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements , newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index : " + i + " , Size : " + size);
        }
        return (E) elements[i];
    }
}
