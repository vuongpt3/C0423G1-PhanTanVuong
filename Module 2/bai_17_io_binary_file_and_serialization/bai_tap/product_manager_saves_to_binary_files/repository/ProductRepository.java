package bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.repository;

import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static public List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Máy ảnh", 490000,"Sony","Quá nuột"));
        products.add(new Product(2,"LapTop", 4900000,"DELL","Quá xịn"));
        products.add(new Product(3,"Điện thoại", 490000,"Nokia","Quá mướt"));
        products.add(new Product(4,"MacBook", 490000,"SamSung","Quá ngon"));
        products.add(new Product(5,"Máy lạnh", 490000,"Apple","Quá vip"));
    }
    ReadAndWrite readAndWrite = new ReadAndWrite();


    @Override
    public ArrayList<Product> displayProdcut() {
        readAndWrite.writeBinaryFile(products);
        for (Product product : products){
            System.out.println(product);
        }
        return productArrayList;
    }

    @Override
    public void add(Product product) {
        List<Product> productList = new ArrayList<>();
        productList = (ArrayList<Product>) ReadAndWrite.readBinaryFile(PRODUCT_PATH_BINARY_FILE);
        productList.add(product);
        ReadAndWrite.writeBinaryFile(PRODUCT_PATH_BINARY_FILE , productList);
    }

    @Override
    public void search(String name) {
        List<Product> productList = new ArrayList<>();

    }
}
