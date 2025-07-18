package co.demo.lab2.program1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create rooms
        MeetingRoom room1 = new MeetingRoom("MR101", 10, 1);
        ZoomMeetingRoom room2 = new ZoomMeetingRoom("MR102", 8, 2, "ZD123", "ZA456");

        // Create BookingManager
        BookingManager manager = new BookingManager();

        // Create and add bookings
        Booking booking1 = new Booking("E001", "MR101", LocalDate.of(2025, 7, 15), LocalTime.of(10, 0), 60);
        Booking booking2 = new Booking("E002", "MR102", LocalDate.of(2025, 7, 15), LocalTime.of(11, 0), 30);

        manager.addBooking(booking1);
        manager.addBooking(booking2);

        // Display room details
        System.out.println(room1.getRoomDetails());
        System.out.println(room2.getZoomDetails());

        // Display bookings for a date
        System.out.println("\nBookings on 2025-07-15:");
        List<Booking> bookings = manager.getBookingsByDate(LocalDate.of(2025, 7, 15));
        for (Booking b : bookings) {
            System.out.println(b.getBookingDetails());
        }
    }
}

