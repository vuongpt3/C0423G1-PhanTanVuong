package bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.service;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.repository.IProductRepository;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.repository.ProductRepository;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.util.ReadAndWrite;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService{
    public final IProductRepository productRepository = new ProductRepository();
    ArrayList<Product> productArrayList = productRepository.displayProdcut();

    @Override
    public void display() {
        for (Product product : productArrayList){
            System.out.println(product);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Nhập giá của sản phẩm");
        double price = scanner.nextDouble();
        System.out.println("Nhập hàng sản xuất");
        String manufacturedGoods = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        String describe = scanner.nextLine();
        Product product = new Product(id , name , price, manufacturedGoods,describe);
        productRepository.add(product);
        File pathFile = new File("C:\\C0423G1-PhanTanVuong\\Module 2\\bai_17_io_binary_file_and_serialization\\bai_tap\\product_manager_saves_to_binary_files\\data\\product.txt");


        display();
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên muốn tìm");
        String name = scanner.nextLine();
        for (Product product : productArrayList){
            if (product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                return;
            }
        }
            System.out.println("Không tìm thấy cái tên này");
    }
}
