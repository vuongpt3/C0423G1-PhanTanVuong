package FuramaResort.repository;

import FuramaResort.model.Booking;

import java.util.ArrayList;
import java.util.Map;

public interface IBookingRepository extends Repository{
    Map<Booking,Integer> display();
    void addBooking();
    void editBooking();
}
