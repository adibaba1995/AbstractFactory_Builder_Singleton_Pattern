import vehicles.*;
import vehicles.factory.MoreAbstractVehicleFactory;
import vehicles.factory.VehicleFactory;
import vehicles.factory.VehicleFactoryCreator;

public class Client {
    public static void main(String[] args) {
        /*
            We first get factory object and then using that factory, we get vehicle object.
         */
        VehicleFactory carFactory = VehicleFactoryCreator.getVehicleFactory(Constants.FACTORY_TYPE.CAR_FACTORY);
        Vehicle sedan = carFactory.createVehicle(Constants.VEHICLE_TYPE.CAR.SEDAN, new VehicleConfig(200, "BMW"));
        sedan.accelerate();
        sedan.brake();

        VehicleFactory busFactory = VehicleFactoryCreator.getVehicleFactory(Constants.FACTORY_TYPE.BUS_FACTORY);
        Vehicle singleDecker = busFactory.createVehicle(Constants.VEHICLE_TYPE.BUS.SINGLE_DECKER);
        singleDecker.accelerate();
        singleDecker.brake();


        /*
            In previous implementation, we first have to get factory object and then create vehicle object using that factory.
            In below implementation, we just pass the vehicle type and behind the scenes it will choose respective factory and return a object.
         */
        Vehicle sports = MoreAbstractVehicleFactory.getInstance().createVehicle(Constants.VEHICLE_TYPE.CAR.SPORTS, new VehicleConfig(300, "Ferrari"));
        sports.accelerate();
        sports.brake();
    }
}
