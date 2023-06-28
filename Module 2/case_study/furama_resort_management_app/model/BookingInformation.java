package case_study.furama_resort_management_app.model;

public class BookingInformation {
    private int BookingID;
    private String dateBooking;
    private String rentalStartDate;
    private String rentalEndDate;
    private int clientID;
    private int serviceID;
    public BookingInformation(){

    }

    public BookingInformation(int bookingID, String dateBooking, String rentalStartDate, String rentalEndDate, int clientID, int serviceID) {
        BookingID = bookingID;
        this.dateBooking = dateBooking;
        this.rentalStartDate = rentalStartDate;
        this.rentalEndDate = rentalEndDate;
        this.clientID = clientID;
        this.serviceID = serviceID;
    }

    public int getBookingID() {
        return BookingID;
    }

    public void setBookingID(int bookingID) {
        BookingID = bookingID;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getRentalStartDate() {
        return rentalStartDate;
    }

    public void setRentalStartDate(String rentalStartDate) {
        this.rentalStartDate = rentalStartDate;
    }

    public String getRentalEndDate() {
        return rentalEndDate;
    }

    public void setRentalEndDate(String rentalEndDate) {
        this.rentalEndDate = rentalEndDate;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    @Override
    public String toString() {
        return "BookingInformation{" +
                "BookingID=" + BookingID +
                ", dateBooking='" + dateBooking + '\'' +
                ", rentalStartDate='" + rentalStartDate + '\'' +
                ", rentalEndDate='" + rentalEndDate + '\'' +
                ", clientID=" + clientID +
                ", serviceID=" + serviceID +
                '}';
    }
}
