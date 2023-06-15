//package bai_10_dsa_list_demo.bai_2_implement_linkedlist_methods_according_to_java_util_inkedlist_library;
//
//public class MyLinkedList <E>{
//    private Node head;
//    private int numNodes;
//    private MyLinkedList(){
//        numNodes = 0;
//        head = null;
//    }
//    public void add(int index , E element){
//        if (index < 0 || index > numNodes){
//            throw new IndexOutOfBoundsException("Index : " + index + " , Element : " + element);
//        }
//        Node newNode = new Node(element);
//        if (index == 0){
//            newNode.setNext(head);
//            head = newNode;
//        }else {
//            Node prevNode = getNode(index - 1);
//            newNode.setNext(prevNode.getNext());
//            prevNode.setNext(newNode);
//        }
//        numNodes++;
//    }
//    public void addFirst(E element) {
//        add(0, element);
//    }
//
//    public void addLast(E element) {
//        add(numNodes, element);
//    }
//    public E remove(int index){
//        if (index < 0 || index >= numNodes){
//            throw new IndexOutOfBoundsException("Index : " + index);
//        }
//        Node removeNode;
//        if (index == 0){
//            removeNode = head;
//            head = head.getNext();
//        }else {
//            Node prevNode = getNode(index - 1);
//            removeNode = prevNode.getNext();
//            prevNode.setNext(removeNode.getNext());
//        }
//        numNodes--;
//        return removeNode.getData();
//    }
//    public boolean remove(Object o){
//        Node prevNode = null;
//        Node currentNode = head;
//
//        while (currentNode != null){
//            if (currentNode.getData().equals(o)){
//                if (prevNode == null){
//                    head = currentNode.getNext();
//                }else {
//                    prevNode.setNext(currentNode.getNext());
//                }
//                numNodes--;
//                return true;
//            }
//            prevNode = currentNode;
//            currentNode = currentNode.getNext();
//        }
//        return false;
//    }
//    public E get(int index){
//        if (index < 0 || index >= numNodes){
//            throw new IndexOutOfBoundsException();
//        }
//        Node node = getNode(index);
//        return (E) node.getData();
//    }
//    public int size(){
//        return numNodes;
//    }
//    public void printList(){
//        Node curentNode = head;
//
//        while (curentNode != null){
//            System.out.println(curentNode.getData() + " ");
//            curentNode = curentNode.getNext();
//        }
//        System.out.println( );
//    }
//    public MyLinkedList<E> clone() {
//        MyLinkedList<E> cloneList = new MyLinkedList<>();
//        Node<E> currentNode = head;
//
//        while (currentNode != null) {
//            cloneList.addLast(currentNode.getData());
//            currentNode = currentNode.getNext();
//        }
//
//        return cloneList;
//    }
//
//    public boolean contains(E o) {
//        Node currentNode = head;
//
//        while (currentNode != null) {
//            if (currentNode.getData().equals(o)) {
//                return true;
//            }
//
//            currentNode = currentNode.getNext();
//        }
//
//        return false;
//    }
//
////    public int indexOf(E o) {
////        Node<E> currentNode =
//
//}
