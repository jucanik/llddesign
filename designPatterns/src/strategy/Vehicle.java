package strategy;
public class Vehicle {

  DriveStrategy driveStrategy;

  public Vehicle(final DriveStrategy driveStrategy) {
    this.driveStrategy = driveStrategy;
  }

  public void drive() {
    driveStrategy.drive();
  }
}
