package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.repository;

import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductRepository implements IProductRepository {
    static public ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "Điện Thoại", 1.999));
        productArrayList.add(new Product(2, "Điện tử", 69.999));
        productArrayList.add(new Product(3, "Trực Thăng", 399.999));
        productArrayList.add(new Product(4, "Máy bay", 599.999));
    }

    @Override
    public ArrayList<Product> displayProducts() {
        return productArrayList;
    }

    @Override
    public void add(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void updateProduct(int id) {

    }

    @Override
    public void delete(Product product) {
        productArrayList.remove(product);
    }

    @Override
    public void search(String name) {

    }

    @Override
    public void arrange(double price) {

    }
}
