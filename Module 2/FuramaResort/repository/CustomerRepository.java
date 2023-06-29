package FuramaResort.repository;

import FuramaResort.model.Person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    static public List<Customer> customerList = new ArrayList<>();
    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public ArrayList<Customer> display() {
        return (ArrayList<Customer>) customerList;
    }

    @Override
    public void addCustomer() {

    }

    @Override
    public void editCustomer() {
//Nhận vào đối tuowngj sửa
        // Update ArrList
        //Ghi đè vào file
    }
}
