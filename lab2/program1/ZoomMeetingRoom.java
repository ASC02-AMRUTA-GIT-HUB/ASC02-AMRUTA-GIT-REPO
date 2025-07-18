package co.demo.lab2.program1;
public class ZoomMeetingRoom extends MeetingRoom {
    private String zoomDeviceId;
    private String zoomAccountId;

    public ZoomMeetingRoom(String roomId, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
        super(roomId, capacity, floor);
        this.zoomDeviceId = zoomDeviceId;
        this.zoomAccountId = zoomAccountId;
    }

    public String getZoomDetails() {
        return getRoomDetails() + ", Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId;
    }
}

