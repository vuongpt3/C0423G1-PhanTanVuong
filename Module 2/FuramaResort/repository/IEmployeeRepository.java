package FuramaResort.repository;

import FuramaResort.model.Person.Employee;

import java.util.ArrayList;

public interface IEmployeeRepository extends Repository{
    ArrayList<Employee> display();
    void addEmployee(Employee employee);
    void editEmployee(String id,Employee editEmployee);
}
