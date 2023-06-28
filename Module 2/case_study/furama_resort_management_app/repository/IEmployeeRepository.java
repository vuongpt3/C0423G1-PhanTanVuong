package case_study.furama_resort_management_app.repository;

public interface IEmployeeRepository extends Repository {
    @Override
    void display();
    void addNew();
    void edit();
}
