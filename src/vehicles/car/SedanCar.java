package vehicles.car;

import vehicles.Constants;
import vehicles.Vehicle;

public class SedanCar extends Vehicle {
    public SedanCar(int topSpeed, String brand) {
        super(new Vehicle.VehicleBuilder()
                .setCapacity(4)
                .setType(Constants.VEHICLE_TYPE.CAR.SEDAN)
                .setTopSpeed(topSpeed)
                .setBrand(brand));
    }

    public SedanCar() {
        this(200, "unknown");
    }
}
