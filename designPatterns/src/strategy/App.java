package strategy;
import java.util.*;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");
    Vehicle vehicle = new SportsVehicle();
    vehicle.drive();
  }
}
