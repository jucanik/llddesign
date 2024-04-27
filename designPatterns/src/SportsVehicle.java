import strategy.DriveStrategy;
import strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SportsDriveStrategy());
    //TODO Auto-generated constructor stub
  }
}
