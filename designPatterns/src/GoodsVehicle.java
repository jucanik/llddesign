import strategy.DriveStrategy;
import strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {

  public GoodsVehicle() {
    super(new NormalDriveStrategy());
    //TODO Auto-generated constructor stub
  }
}
