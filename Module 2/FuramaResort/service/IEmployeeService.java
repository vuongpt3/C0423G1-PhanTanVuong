package FuramaResort.service;

import FuramaResort.model.Person.Employee;

import java.util.ArrayList;

public interface IEmployeeService extends Service {
    void display();

    void addEmployee();
    void editEmployee();
}
