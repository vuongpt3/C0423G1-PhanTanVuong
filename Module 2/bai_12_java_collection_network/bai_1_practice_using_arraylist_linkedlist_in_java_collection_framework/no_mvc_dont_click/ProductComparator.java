package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.no_mvc_dont_click;

public class ProductComparator implements java.util.Comparator<Product> {
    @Override
    public int compare(Product a , Product b){
        return (int) (a.getPrice() - b.getPrice());
    }
}
