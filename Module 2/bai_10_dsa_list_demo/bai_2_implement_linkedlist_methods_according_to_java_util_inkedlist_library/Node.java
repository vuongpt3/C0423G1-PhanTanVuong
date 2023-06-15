package bai_10_dsa_list_demo.bai_2_implement_linkedlist_methods_according_to_java_util_inkedlist_library;

public class Node {
    private Node next;
    private Object data;
    public Node (Object data){
        this.data = data;
        this.next = null;
    }
    public Node getNext(){
        return next;
    }
    public void setNext(Node next){
        this.next = next;
    }
    public Object getData(){
        return data;
    }
}

