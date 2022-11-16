package vehicles.bus;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.VehicleConfig;
import vehicles.factory.VehicleFactory;
import vehicles.car.SportsCar;

/*
    Factory for creating bus objects
 */
public class BusFactory implements VehicleFactory {
    private static BusFactory instance;
    private BusFactory(){}
    public static BusFactory getInstance() {
        if (instance == null)
            instance = new BusFactory();
        return instance;
    }

    @Override
    public Vehicle createVehicle(String type) {
        return createVehicle(type, null);
    }

    @Override
    public Vehicle createVehicle(String type, VehicleConfig config) {
        switch (type) {
            case Constants.VEHICLE_TYPE.BUS.SINGLE_DECKER:
                if(config == null)
                    return new SingleDeckerBus();
                else
                    return new SingleDeckerBus(config.getTopSpeed(), config.getBrand());
            case Constants.VEHICLE_TYPE.BUS.DOUBLE_DECKER:
                if(config == null)
                    return new SportsCar();
                else
                    return new SportsCar(config.getTopSpeed(), config.getBrand());
            default: return null;
        }
    }
}
