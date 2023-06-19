package bai_12_java_collection_network.bai_1_practice_using_arraylist_linkedlist_in_java_collection_framework.no_mvc_dont_click;

import java.util.*;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private final List<Product> productList;
    public ProductManager(){
        productList = new ArrayList<>();
    }
    public void addProduct(Product product){
        productList.add(product);
        System.out.println("Successfully added product");
    }
    public void updateProduct(int id){
        for (Product product : productList){
            if (product.getId() == id){
                System.out.println("Enter new name product");
                String newName = scanner.nextLine();
                System.out.println("Enter new price product");
                int newPrice = scanner.nextInt();

                product.setName(newName);
                product.setPrice(newPrice);

                System.out.println("Updated successfully");
                return;
            }
        }
        System.out.println("This id could not be found");
    }
    public void deleteProduct(int id){
        for (Product product : productList){
            if (product.getId() == id){
                productList.remove(product);
                return;
            }
        }
        System.out.println("This id could not be found");
    }
    public void displayProduct(Product product){
        for (Product product1 : productList){
            System.out.println(product1);
        }
    }
    public void searchProduct(String name){
        boolean flag = false;
        System.out.println("You want to find " + name + " right? ." );
        for (Product product : productList){
            if (product.getName().equalsIgnoreCase(name)){
                System.out.println(product);
                flag = true;
            }
        }
        if (flag){
            System.out.println("No products found with this name");
        }

    }
    public void sortUpProduct(double price){
        System.out.println("The list displays products by price from low to high");
        Collections.sort(productList, new ProductComparator());

    }


}
