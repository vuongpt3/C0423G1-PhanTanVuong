package case_study.furama_resort_management_app.model;

public class CustomerInfomation extends InformationEmployee {
    private String type;
    private String address;

    public CustomerInfomation(String type) {
        this.type = type;
    }

    public CustomerInfomation(int id, String name, String date, String gender, int numberCmnd, String phoneNumber, String email,String type, String address) {
        super(id, name, date, gender, numberCmnd, phoneNumber, email);
        this.type = type;
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerInfomation{" +
                "type='" + type + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
