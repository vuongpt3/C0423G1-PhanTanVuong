package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.service;

import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;

import java.util.ArrayList;

public interface IProductService {
    public void displayProducts();

    void add();

    void updateProduct();

    void delete();

    void search();

    double sortUpProductComparator();

    double sortDownProductComparator();
}
