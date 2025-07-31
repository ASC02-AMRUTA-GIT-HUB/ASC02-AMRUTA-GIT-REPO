package com.demo.lab2.program1;

public class MeetingRoom {
    protected String roomId;
    protected int capacity;
    protected int floor;

    public MeetingRoom(String roomId, int capacity, int floor) {
        this.roomId = roomId;
        this.capacity = capacity;
        this.floor = floor;
    }

    public String getRoomDetails() {
        return "Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floor;
    }

    public String getRoomId() {
        return roomId;
    }
}

