package bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.controller;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public final ProductService productService = new ProductService();
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Vui lòng chọn chức năng" +
                    "\n1. Thêm" +
                    "\n2. Hiển thị" +
                    "\n3. Tìm kiếm");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    productService.add();
                    System.out.println("Thêm thành công");
                    break;
                case 2 :
                    productService.display();
                    break;
                case 3 :
                    productService.search();
                    break;
                default:
                    System.out.println("Nhập sai rồi bro");
                    break;
            }
        }while (flag);
    }
}
