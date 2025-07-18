package co.demo.lab2.program1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {
    private String employeeId;
    private String roomId;
    private LocalDate meetingDate;
    private LocalTime meetingTime;
    private int durationMinutes;

    public Booking(String employeeId, String roomId, LocalDate meetingDate, LocalTime meetingTime, int durationMinutes) {
        this.employeeId = employeeId;
        this.roomId = roomId;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.durationMinutes = durationMinutes;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public String getBookingDetails() {
        return "Employee ID: " + employeeId + ", Room ID: " + roomId +
                ", Date: " + meetingDate + ", Time: " + meetingTime +
                ", Duration: " + durationMinutes + " mins";
    }
}

