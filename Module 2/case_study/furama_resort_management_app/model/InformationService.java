package case_study.furama_resort_management_app.model;

public class InformationService {
    private int serviceCode;
    private String serviceName;
    private double usablArea;
    private double rentalCosts;
    private int maximumPeople;
    private String rentalType;
    public InformationService(){

    }

    public InformationService(int serviceCode, String serviceName, double usablArea, double rentalCosts, int maximumPeople, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usablArea = usablArea;
        this.rentalCosts = rentalCosts;
        this.maximumPeople = maximumPeople;
        this.rentalType = rentalType;
    }

    public int getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsablArea() {
        return usablArea;
    }

    public void setUsablArea(double usablArea) {
        this.usablArea = usablArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaximumPeople() {
        return maximumPeople;
    }

    public void setMaximumPeople(int maximumPeople) {
        this.maximumPeople = maximumPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "InformationService{" +
                "serviceCode=" + serviceCode +
                ", serviceName='" + serviceName + '\'' +
                ", usablArea=" + usablArea +
                ", rentalCosts=" + rentalCosts +
                ", maximumPeople=" + maximumPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
