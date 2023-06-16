package bai_11_dsa_stack_queue.thuc_hanh.bai_1_stack_implementation_using_linkedList_class_in_java_util_library;

public class GenericStackClient {
    public static void stackOfString(){
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("One");
        myGenericStack.push("Two");
        myGenericStack.push("Three");
        myGenericStack.push("Four");
        myGenericStack.push("Five");
        myGenericStack.push("Six");
        myGenericStack.push("Seven");
        myGenericStack.push("Eight");
        myGenericStack.push("Nine");
        myGenericStack.push("Ten");
        System.out.println("1.1 Size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2. Pop elements from stack : ");
        while (!myGenericStack.isEmpyty()){
            System.out.println(" %s" + myGenericStack.pop());
        }
        System.out.println("Size of stack after push operations: " + myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("Stack of String : ");
        stackOfString();
    }
}
