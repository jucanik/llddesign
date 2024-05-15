package designSolution;
import java.util.Map;

public class ParkingFloor {

    String name;
    Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots;

    public ParkingFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots){
        this.name = name;
        this.parkingSlots = parkingSlots;
    }

    public ParkingSlot getRelevantSlotForVehiclePark(Vehicle vehicle) {

        ParkingSlot parkingSlot = null;
        ParkingSlotType parkingSlotType = pickCorrectSlotType(vehicle.getVehicleCategory());
        final Map<String, ParkingSlot> parkingSlotAvailableForSpecificedParkingSlotType = parkingSlots.get(parkingSlotType);
        for(Map.Entry<String, ParkingSlot> mp : parkingSlotAvailableForSpecificedParkingSlotType.entrySet()){
            ParkingSlot currentParkingSlot = mp.getValue();
            if(currentParkingSlot.isAvailable()){
                parkingSlot = currentParkingSlot;
                parkingSlot.addVehicle(vehicle);
                break;
            }
        }
        return parkingSlot;
    }

    private ParkingSlotType pickCorrectSlotType(final VehicleCategory vehicleCategory) {
        switch(vehicleCategory){
            case TwoWheeler:
            return ParkingSlotType.TwoWheeler;

            case Hatchback:
            return ParkingSlotType.Medium;

            case SUV:
            return ParkingSlotType.Large;
            
            case Sedan:
            return ParkingSlotType.Compact;

            case BUS:
            return ParkingSlotType.Large;

            default:
            return ParkingSlotType.Medium;
        }
    }
}
