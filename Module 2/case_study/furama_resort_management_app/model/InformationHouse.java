package case_study.furama_resort_management_app.model;

public class InformationHouse {
    private String roomStandardHouse;
    private int numberOfFloorsHouse;

    public InformationHouse(String roomStandardHouse, int numberOfFloorsHouse) {
        this.roomStandardHouse = roomStandardHouse;
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    public String getRoomStandardHouse() {
        return roomStandardHouse;
    }

    public void setRoomStandardHouse(String roomStandardHouse) {
        this.roomStandardHouse = roomStandardHouse;
    }

    public int getNumberOfFloorsHouse() {
        return numberOfFloorsHouse;
    }

    public void setNumberOfFloorsHouse(int numberOfFloorsHouse) {
        this.numberOfFloorsHouse = numberOfFloorsHouse;
    }

    @Override
    public String toString() {
        return "InformationHouse{" +
                "roomStandardHouse='" + roomStandardHouse + '\'' +
                ", numberOfFloorsHouse=" + numberOfFloorsHouse +
                '}';
    }
}
