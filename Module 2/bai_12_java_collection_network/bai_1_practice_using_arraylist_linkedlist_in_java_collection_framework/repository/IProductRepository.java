package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.repository;

import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> displayProducts();

    void add(Product product);

    void updateProduct(int id);

    void delete(Product product);

    void search(String name);

    void arrange(double price);

}
