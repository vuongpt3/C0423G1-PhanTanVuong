package FuramaResort.model.Facility;

public class House extends Facility {
    private String roomStandard;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
//    public String toString() {
//        return "House{" +
//                "roomStandard='" + roomStandard + '\'' +
//                ", numberOfFloors=" + numberOfFloors +
//                ", serviceCode='" + serviceCode + '\'' +
//                ", serviceName='" + serviceName + '\'' +
//                ", area=" + area +
//                ", rentalCost=" + rentalCost +
//                ", maxOccupancy=" + maxOccupancy +
//                ", rentalType='" + rentalType + '\'' +
//                '}';
//    }

    public String getAdditionalDetails() {
        return "Room Standard: " + roomStandard + ", Number of Floors: " + numberOfFloors;
    }
}
