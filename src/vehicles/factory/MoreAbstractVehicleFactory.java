package vehicles.factory;

import vehicles.Constants;
import vehicles.Vehicle;
import vehicles.VehicleConfig;
import vehicles.bus.BusFactory;
import vehicles.car.CarFactory;

import java.lang.reflect.Field;

/*
    This is a small variation of abstract factory pattern which came in my mind.
    According to other implementation which i did, One will have to first get factory instance and than use that factory instance to get respective vehicle object.
    Using this implementation,A user will just specify vehicle type and it will pick factory accordingly and return specific vehicle object.
 */
public class MoreAbstractVehicleFactory implements VehicleFactory{

    private MoreAbstractVehicleFactory() {}

    private static MoreAbstractVehicleFactory instance;
    public static MoreAbstractVehicleFactory getInstance() {
        if(instance == null) {
            instance = new MoreAbstractVehicleFactory();
        }
        return instance;
    }

    @Override
    public Vehicle createVehicle(String type) {
        return createVehicle(type, null);
    }

    /*
        User will just specify the vehicle type and it will use specific factory accordingly.
     */
    @Override
    public Vehicle createVehicle(String type, VehicleConfig config) {
        try {
            /*
                For e.g. Here, it is checking if the vehicle type which we pass matches any type from the declared car constants.
                if the type is matched, it will use CarFactory to create object.
             */
            for (Field f : Constants.VEHICLE_TYPE.CAR.class.getDeclaredFields()) {
                String value = (String) f.get(null);
                if(value == type) {
                    return CarFactory.getInstance().createVehicle(type, config);
                }
            }
            for (Field f : Constants.VEHICLE_TYPE.BUS.class.getDeclaredFields()) {
                String value = (String) f.get(null);
                if(value == type) {
                    return BusFactory.getInstance().createVehicle(type, config);
                }
            }
        } catch(IllegalAccessException ex) {

        }
        return null;
    }
}
