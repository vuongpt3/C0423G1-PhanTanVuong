package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.controller;

import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;
import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.repository.ProductRepository;
import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.service.ProductService;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductController {

    public static ProductService productService = new ProductService();

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("============Manage the most expensive product in the world============" +
                    "\n1. Thêm sản phẩm" +
                    "\n2. Sửa sản phẩm" +
                    "\n3. Xóa sản phẩm" +
                    "\n4. Hiển thị tất cả sản phẩm" +
                    "\n5. Tìm kiếm sản phẩm" +
                    "\n6. Sắp xếp sản phẩm theo giá");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productService.add();
                    System.out.println("Successfully added product");
                    break;
                case 2:
                    productService.updateProduct();
                    System.out.println("Successfully Uploaded product");
                    break;
                case 3:
                    productService.delete();
                    break;
                case 4:
                    productService.displayProducts();
                    break;
                case 5:
                    productService.search();
                    break;
                case 6:
                    boolean flag1 = true;
                    do {
                        System.out.println("Bạn muốn sắp xếp theo kiểu :" +
                                "\n1. Tăng dần" +
                                "\n2. Giảm dần");
                        int choose1 = Integer.parseInt(scanner.nextLine());
                        if (choose1 == 1) {
                            productService.sortUpProduct();
                            productService.displayProducts();
                            break;
                        } else if (choose1 == 2) {
                            productService.sortDownProduct();
                            productService.displayProducts();
                            break;
                        }
                    } while (flag1);
                    break;
                default:
                    System.out.println("Wrong choice bro");
            }
        } while (flag);
    }
}
