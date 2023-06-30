package FuramaResort.repository;

import FuramaResort.model.Person.Customer;
import FuramaResort.utils.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    public static final String PATH_FILE_CUSTOMER = "C:\\C0423G1-PhanTanVuong\\Module 2\\FuramaResort\\data\\customer.csv";
    static public List<Customer> customerList = new ArrayList<>();
    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public ArrayList<Customer> display() {
        List<String> stringList = ReadAndWrite.readBinaryFile(PATH_FILE_CUSTOMER);
        customerList.clear();
        String[] data = null;
        for (String s : stringList){
            data = s.split(",");
            Customer customer = new Customer(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8]);
            customerList.add(customer);
        }
        return (ArrayList<Customer>) customerList;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getId() + ","+customer.getFullName()+","+customer.getDateOfBirth()+","+customer.getGender()+","+customer.getIdNumber()+","+customer.getPhoneNumber()+","+customer.getCustomerType()+","+customer.getAddress());
        ReadAndWrite.writeBinaryFile(PATH_FILE_CUSTOMER,stringList,true);
    }

    public Customer findCustomerByID(String id){
        customerList = display();
        for (Customer customer : customerList){
            if (customer.getId().equals(id)){
                return customer;
            }
        }
        return null;
    }
    @Override
    public void editCustomer(String id , Customer editCustomer) {
//Nhận vào đối tuowngj sửa
        // Update ArrList
        //Ghi đè vào file
        customerList = display();
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList){
            if (customer.getId().equals(id)){
                customer = editCustomer;
            }
            stringList.add(customer.getId() + ","+customer.getFullName()+","+customer.getDateOfBirth()+","+customer.getGender()+","+customer.getIdNumber()+","+customer.getPhoneNumber()+","+customer.getCustomerType()+","+customer.getAddress());
        }
        ReadAndWrite.writeBinaryFile(PATH_FILE_CUSTOMER,stringList,false);
    }
}
