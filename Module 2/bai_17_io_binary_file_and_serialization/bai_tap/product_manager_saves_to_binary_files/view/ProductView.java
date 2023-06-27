package bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.view;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.controller.ProductController;

public class ProductView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenu();
    }
}
