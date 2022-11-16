package vehicles.factory;

import vehicles.Vehicle;
import vehicles.VehicleConfig;

/*
    Interface for creating any new vehicle factory
*/
public interface VehicleFactory {

    //For creating a default version of vehicle object
    public Vehicle createVehicle(String type);

    //For creating vehicle object based on some custom config
    public Vehicle createVehicle(String type, VehicleConfig config);
}
