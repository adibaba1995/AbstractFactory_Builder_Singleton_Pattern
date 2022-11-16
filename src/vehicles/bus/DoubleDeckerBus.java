package vehicles.bus;

import vehicles.Constants;
import vehicles.Vehicle;

public class DoubleDeckerBus extends Vehicle {
    public DoubleDeckerBus(int topSpeed, String brand) {
        super(new Vehicle.VehicleBuilder()
                .setCapacity(100)
                .setType(Constants.VEHICLE_TYPE.BUS.DOUBLE_DECKER)
                .setTopSpeed(topSpeed)
                .setBrand(brand));
    }

    public DoubleDeckerBus() {
        this(100, "unknown");
    }
}
