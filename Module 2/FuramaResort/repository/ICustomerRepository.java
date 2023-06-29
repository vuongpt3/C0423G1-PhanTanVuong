package FuramaResort.repository;

import FuramaResort.model.Person.Customer;

import java.util.ArrayList;

public interface ICustomerRepository extends Repository {
   ArrayList<Customer> display();
   void addCustomer();
   void editCustomer();
}
