package vehicles.car;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.VehicleConfig;
import vehicles.factory.VehicleFactory;

public class CarFactory implements VehicleFactory {

    private static CarFactory instance;
    private CarFactory(){}

    public static CarFactory getInstance() {
        if(instance == null)
            instance = new CarFactory();
        return instance;
    }

    @Override
    public Vehicle createVehicle(String type) {
        return createVehicle(type, null);
    }

    @Override
    public Vehicle createVehicle(String type, VehicleConfig config) {
        switch (type) {
            case Constants.VEHICLE_TYPE.CAR.SEDAN:
                if(config == null)
                    return new SedanCar();
                else
                    return new SedanCar(config.getTopSpeed(), config.getBrand());
            case Constants.VEHICLE_TYPE.CAR.SPORTS:
                if(config == null)
                    return new SportsCar();
                else
                    return new SportsCar(config.getTopSpeed(), config.getBrand());
            default: return null;
        }
    }
}
