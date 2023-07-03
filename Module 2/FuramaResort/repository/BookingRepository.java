package FuramaResort.repository;

import FuramaResort.model.Booking;

import java.util.*;

public class BookingRepository implements IBookingRepository{
    static public List<String> bookingList = new ArrayList<>();
    public static TreeSet bookingIntegerMap = new TreeSet<>();
    static {
        bookingIntegerMap.add(new Booking("1","07-03-2023","08-03-2023","20-03-2023","1","1"));
        bookingIntegerMap.add(new Booking("2","08-03-2023","09-03-2023","21-03-2023","2","2"));
        bookingIntegerMap.add(new Booking("3","09-03-2023","10-03-2023","22-03-2023","3","3"));
        bookingIntegerMap.add(new Booking("4","10-03-2023","11-03-2023","23-03-2023","4","4"));
        bookingIntegerMap.add(new Booking("5","11-03-2023","12-03-2023","24-03-2023","5","5"));
    }
    @Override
    public void additionalMethod1() {

    }

    @Override
    public void additionalMethod2() {

    }

    @Override
    public Map<Booking, Integer> display() {
        return null;
    }

    @Override
    public void addBooking() {

    }

    @Override
    public void editBooking() {

    }
}
