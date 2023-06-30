package FuramaResort.repository;

import FuramaResort.model.Person.Employee;
import FuramaResort.model.Person.Person;
import FuramaResort.utils.ReadAndWrite;
import bai_17_io_binary_file_and_serialization.bai_tap.product_manager_saves_to_binary_files.model.Product;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private final String FILE_PATH = "C:\\C0423G1-PhanTanVuong\\Module 2\\FuramaResort\\data\\employee.csv";
    static public List<Employee> employeeList = new ArrayList<>();
//    static {
//        // employeeList.add(new Employee(1,"Phan Tấn Vương","24/05/2001","Nam","684937429380","098746349384","oeotiglj@gmail.com","Cao đẳng","Phục vụ",5000000));
//        List<String> employeeListString = ReadAndWrite.writeBinaryFile();
//    }
    @Override
    public ArrayList<Employee> display() {
        List<String> stringList =ReadAndWrite.readBinaryFile(FILE_PATH);
        employeeList.clear();
        String[] data = null;
        for (String s : stringList){
            data = s.split(",");
            Employee employee = new Employee(data[0],data[1],data[2],data[3],data[4],data[5],data[6],data[7],data[8],Integer.parseInt(data[9]));
            employeeList.add(employee);
        }
        return (ArrayList<Employee>) employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
       List<String> stringList1 = new ArrayList<>();
       stringList1.add(employee.getId()+ "," + employee.getFullName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getIdNumber() + "," + employee.getPhoneNumber() + "," + employee.getEmail()+ "," + employee.getQualification() + "," + employee.getPosition()+ "," + employee.getSalary());
       ReadAndWrite.writeBinaryFile(FILE_PATH,stringList1,true);
    }

    public Employee findEmployeeById(String id) {
        employeeList=display();
        for (Employee employee : employeeList) {
            if (employee.getId().equals(id)){
                return employee;
            }
        }
        return null;
    }
    @Override
    public void editEmployee(String id ,Employee editEmployee) {
    employeeList=display();
    List<String> stringList = new ArrayList<>();
        for (Employee employee: employeeList) {
            if (employee.getId().equals(id)){
                employee=editEmployee;
            }
            stringList.add(employee.getId()+ "," + employee.getFullName() + "," + employee.getDateOfBirth() + "," + employee.getGender() + "," + employee.getIdNumber() + "," + employee.getPhoneNumber() + "," + employee.getEmail()+ "," + employee.getQualification() + "," + employee.getPosition()+ "," + employee.getSalary());
        }
        ReadAndWrite.writeBinaryFile(FILE_PATH,stringList,false);
    }

    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }
}
