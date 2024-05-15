package designSolution;
public class ParkingSlot {

    private String name;
    private boolean isAvailable;
    private Vehicle vehicle;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSlotType getParkingSlotType() {
        return parkingSlotType;
    }

    public void setParkingSlotType(ParkingSlotType parkingSlotType) {
        this.parkingSlotType = parkingSlotType;
    }

    private ParkingSlotType parkingSlotType;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType){
        this.isAvailable = true;
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    protected void addVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isAvailable = false;
    }

    protected void removeVehicle(Vehicle vehicle) {
        this.vehicle = null;
        this.isAvailable = true;
    }

}
