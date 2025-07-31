package com.demo.lab2.program1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    private List<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public List<Booking> getBookingsByDate(LocalDate date) {
        List<Booking> result = new ArrayList<>();
        for (Booking b : bookings) {
            if (b.getMeetingDate().equals(date)) {
                result.add(b);
            }
        }
        return result;
    }
}

