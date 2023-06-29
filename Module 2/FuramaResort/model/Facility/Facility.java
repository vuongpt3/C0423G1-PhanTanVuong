package FuramaResort.model.Facility;

public abstract class Facility {
    protected String serviceCode;
    protected String serviceName;
    protected double area;
    protected double rentalCost;
    protected int maxOccupancy;
    protected String rentalType;

    // Constructor
    public Facility(String serviceCode, String serviceName, double area, double rentalCost,
                    int maxOccupancy, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxOccupancy = maxOccupancy;
        this.rentalType = rentalType;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxOccupancy=" + maxOccupancy +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    public abstract String getAdditionalDetails();
}
