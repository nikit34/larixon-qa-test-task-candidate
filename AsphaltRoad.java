import java.util.ArrayList;
import java.util.List;


class AsphaltRoad {
    private List<Vehicle> vehicles;

    public AsphaltRoad() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void fillUp(Vehicle vehicle, int liters) {
        vehicle.fillUp(liters);
    }

    public void drive(Vehicle vehicle, double distance) {
        vehicle.drive(distance);
    }

    public void printVehicleRemainingFuels() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle remaining fuel: " + vehicle.remainingFuel());
        }
    }
}
