package vehicles;

/*
    For defining custom configurations for vehicle
 */
public class VehicleConfig {
    private int topSpeed;
    private String brand;

    public VehicleConfig(int topSpeed, String brand) {
        this.topSpeed = topSpeed;
        this.brand = brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
