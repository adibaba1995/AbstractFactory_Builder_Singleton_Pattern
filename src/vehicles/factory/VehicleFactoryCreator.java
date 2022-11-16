package vehicles.factory;

import vehicles.Constants;
import vehicles.bus.BusFactory;
import vehicles.car.CarFactory;

/*
    Abstract factory for creating factory objects
 */
public class VehicleFactoryCreator {

    public static VehicleFactory getVehicleFactory(String type) {
        switch (type) {
            case Constants.FACTORY_TYPE.BUS_FACTORY:
                return BusFactory.getInstance();
            case Constants.FACTORY_TYPE.CAR_FACTORY:
                return CarFactory.getInstance();
            default: return null;
        }
    }
}
