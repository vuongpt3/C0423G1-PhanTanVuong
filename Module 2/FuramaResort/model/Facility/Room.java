package FuramaResort.model.Facility;

public class Room extends Facility {
    private String freeService;

    public Room(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType, String freeService) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "serviceCode='" + getServiceCode() + '\'' +
                ", serviceName='" + getServiceName() + '\'' +
                ", area=" + getArea() +
                ", rentalCost=" + getRentalCost() +
                ", maxOccupancy=" + getMaxOccupancy() +
                ", rentalType='" + getRentalType() + '\'' +
                "freeService='" + freeService + '\'' +
                '}';
    }

    public String getAdditionalDetails() {
        return "Free Service: " + freeService;
    }
}
