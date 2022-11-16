package vehicles.car;

import vehicles.Constants;
import vehicles.Vehicle;

public class SportsCar extends Vehicle {
    public SportsCar(int topSpeed, String brand) {
        super(new Vehicle.VehicleBuilder()
                .setCapacity(2)
                .setType(Constants.VEHICLE_TYPE.CAR.SPORTS)
                .setTopSpeed(topSpeed)
                .setBrand(brand));
    }

    public SportsCar() {
        this(300, "unknown");
    }
}
