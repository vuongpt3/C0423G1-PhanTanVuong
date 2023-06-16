package bai_11_dsa_stack_queue.thuc_hanh.bai_1_stack_implementation_using_linkedList_class_in_java_util_library;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack <T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
        if (stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpyty(){
        if (stack.size() == 0){
            return true;
        }
        return false;
    }
}
