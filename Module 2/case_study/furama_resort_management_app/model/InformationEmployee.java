package case_study.furama_resort_management_app.model;

public class InformationEmployee {
    private int id;
    private String name;
    private String date;
    private String gender;
    private int numberCmnd;
    private String phoneNumber;
    private String email;
    private String level;
    private String location;
    private double wage;
    public InformationEmployee(){

    }

    public InformationEmployee(int id, String name, String date, String gende, int numberCmnd, String phoneNumber, String email, String level, String location, double wage) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gende;
        this.numberCmnd = numberCmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public InformationEmployee(int id, String name, String date, String gender, int numberCmnd, String phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.numberCmnd = numberCmnd;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumberCmnd() {
        return numberCmnd;
    }

    public void setNumberCmnd(int numberCmnd) {
        this.numberCmnd = numberCmnd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "InformationEmployee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gende='" + gender + '\'' +
                ", numberCmnd=" + numberCmnd +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}
