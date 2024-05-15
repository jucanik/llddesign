package designSolution;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private String nameOfParkingLot;
    private Address address;
    private List<ParkingFloor> parkingFloors;
    private static ParkingLot parkingLotInsttance = null;

    public String getNameOfParkingLot() {
        return nameOfParkingLot;
    }

    public void setNameOfParkingLot(String nameOfParkingLot) {
        this.nameOfParkingLot = nameOfParkingLot;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getParkingLotInsttance() {
        return parkingLotInsttance;
    }

    public static void setParkingLotInsttance(ParkingLot parkingLotInsttance) {
        ParkingLot.parkingLotInsttance = parkingLotInsttance;
    }

    public ParkingLot(String name, Address address, List<ParkingFloor> parkingFloors){
        this.nameOfParkingLot = name;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getParkingLot(String name, Address address, List<ParkingFloor> parkingFloors){
        if(parkingLotInsttance == null){
            return new ParkingLot(name, address, parkingFloors);
        }
        return parkingLotInsttance;
    }

    public void addFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots){
        parkingFloors.add(new ParkingFloor(name, parkingSlots));
    }

    public void removeFloor(ParkingFloor parkingFloor){
        parkingFloors.remove(parkingFloor);
    }

    public Ticket assignTicket(Vehicle vehicle){

        ParkingSlot parkingSlot = getParkingSlotForVehicle(vehicle);
        if(parkingSlot == null){
            return null;
        }
        Ticket parkingTicket = createTicketForSlot(parkingSlot);
        // if required persist ticket details in database.
        return parkingTicket;
    }

    public double scanAndPay(Ticket ticket){
        final ParkingSlotType parkingSlotType = ticket.getParkingSlotType();
        final long endTime = System.currentTimeMillis();
        final long duration = endTime - ticket.getParkingStartTime();
        //integrate to payment method in real scenarios.
        return parkingSlotType.getPriceForParking(duration);
    }

    private ParkingSlot getParkingSlotForVehicle(Vehicle vehicle){
        ParkingSlot parkingSlot = null;
        for(ParkingFloor parkingFloor: parkingFloors){
            final ParkingSlot currentParkingSlot = parkingFloor.getRelevantSlotForVehiclePark(vehicle);
            if(currentParkingSlot!=null){
                parkingSlot = currentParkingSlot;
                break;
            }
        }
        return parkingSlot;
    }

    private Ticket createTicketForSlot(ParkingSlot parkingSlot){
        final long startTime = System.currentTimeMillis();
        UUID uuid = UUID. randomUUID();
        String uuidAsString = uuid. toString();
        return new Ticket(uuidAsString, uuidAsString, startTime, parkingSlot.getParkingSlotType());
    }

}
