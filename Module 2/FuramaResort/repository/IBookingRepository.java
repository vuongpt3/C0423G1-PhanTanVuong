package FuramaResort.repository;

import FuramaResort.model.Booking;

import java.util.ArrayList;

public interface IBookingRepository extends Repository{
    ArrayList<Booking> display();
    void addBooking();
    void editBooking();
}
