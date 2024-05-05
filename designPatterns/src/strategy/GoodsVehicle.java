package strategy;

public class GoodsVehicle extends Vehicle {

  public GoodsVehicle() {
    super(new NormalDriveStrategy());
    //TODO Auto-generated constructor stub
  }
}
