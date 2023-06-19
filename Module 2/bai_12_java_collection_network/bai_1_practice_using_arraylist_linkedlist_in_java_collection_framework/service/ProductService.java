package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.service;

import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.model.Product;
import bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductService implements IProductService {
    private final ProductRepository productRepository = new ProductRepository();
    ArrayList<Product> products = productRepository.displayProducts();

    @Override
    public void displayProducts() {
        for (Product product : products) {
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
        System.out.println("Nhập giá sản phẩm");
        double price = scanner.nextDouble();
        Product product1 = new Product(id, name, price);
        productRepository.add(product1);

    }

    @Override
    public void updateProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id you want to update");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (product.getId() == id) {
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new price: ");
                double newPrice = scanner.nextDouble();

                product.setName(newName);
                product.setPrice(newPrice);

                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found with the given ID.");
    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product id you want to delete");
        int id1 = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (product.getId() == id1) {
                products.remove(product);
                System.out.println("Product has been successfully deleted");
                break;
            }
        }
        System.out.println("Product not found with the given ID.");
    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        boolean found = false;
        System.out.println("Enter the name ,  you want to search");
        String name = scanner.nextLine();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found with the given name.");
        }
    }

    @Override
    public double sortUpProductComparator() {
        Product a = new Product();
        Product b = new Product();

        return a.getPrice() - b.getPrice();
    }

    @Override
    public double sortDownProductComparator() {
        Product a = new Product();
        Product b = new Product();

        return b.getPrice() - a.getPrice();
    }


}
