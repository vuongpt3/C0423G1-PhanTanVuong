package FuramaResort.model.Facility;

public class Villa extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa(String serviceCode, String serviceName, double area, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maxOccupancy, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

//    @Override
//    public String toString() {
//        return "Villa{" +
//                "roomStandard='" + roomStandard + '\'' +
//                ", poolArea=" + poolArea +
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
        return "Room Standard: " + roomStandard + ", Pool Area: " + poolArea + ", Number of Floors: " + numberOfFloors;
    }
}
