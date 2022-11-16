package vehicles.bus;

import vehicles.Constants;
import vehicles.Vehicle;

public class SingleDeckerBus extends Vehicle {
    public SingleDeckerBus(int topSpeed, String brand) {
        super(new Vehicle.VehicleBuilder()
                .setCapacity(50)
                .setType(Constants.VEHICLE_TYPE.BUS.SINGLE_DECKER)
                .setTopSpeed(topSpeed)
                .setBrand(brand));
    }

    public SingleDeckerBus() {
        this(100, "unknown");
    }
}
