package FuramaResort.repository;

import FuramaResort.model.Person.Customer;

import java.util.ArrayList;

public interface ICustomerRepository extends Repository {
   ArrayList<Customer> display();
   void addCustomer( Customer customer);
   void editCustomer(String id,Customer editCustomer);
}
