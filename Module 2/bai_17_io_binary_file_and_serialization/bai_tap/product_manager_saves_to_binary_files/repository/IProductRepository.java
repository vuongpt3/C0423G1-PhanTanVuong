package bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.repository;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> displayProdcut();
    void add(Product product);
    void search(String name);
}
