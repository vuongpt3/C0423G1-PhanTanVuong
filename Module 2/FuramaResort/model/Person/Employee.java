package FuramaResort.model.Person;

public class Employee extends Person {
    private String qualification;
    private String position;
    private String salary;

    public Employee(String id, String fullName, String dateOfBirth, String gender, String idNumber, String phoneNumber, String email, String qualification, String position, String salary) {
        super(id, fullName, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n, ID = '" + id + '\'' +
                ", Full Name= '" + fullName + '\'' +
                ", Date of Birth ='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", ID Number = '" + idNumber + '\'' +
                ", Phone Number = '" + phoneNumber + '\'' +
                ", Email = '" + email + '\'' +
                ", Qualification = '" + qualification + '\'' +
                ", Position = '" + position + '\'' +
                ", Salary = " + salary +
                '}';
    }

}
