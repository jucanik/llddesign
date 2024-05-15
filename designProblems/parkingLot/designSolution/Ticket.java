package designSolution;

public class Ticket {

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public ParkingSlotType getParkingSlotType() {
        return parkingSlotType;
    }
    public void setParkingSlotType(ParkingSlotType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }
    public long getParkingStartTime() {
        return parkingStartTime;
    }
    public void setParkingStartTime(long parkingStartTime) {
        this.parkingStartTime = parkingStartTime;
    }
    public String getQrCode() {
        return qrCode;
    }
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    private String id;
    private String qrCode;
    private ParkingSlotType parkingSlotType;
    private long parkingStartTime;

    public Ticket(String id, String qrCode, long parkingStartTime, ParkingSlotType parkingSlotType) {
        this.id = id;
        this.qrCode = qrCode;
        this.parkingStartTime = parkingStartTime;
        this.parkingSlotType = parkingSlotType;
    }

    public Ticket createTicket(String id, String qrCode, long startTime, ParkingSlotType parkingSlotType){
        return new Ticket(id, qrCode, startTime, parkingSlotType);
    }
    
}
