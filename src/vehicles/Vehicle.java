package vehicles;

/*
    Base class for all vehicle objects
 */
public class Vehicle {
    private String type;
    private int capacity;
    private String brand;
    private int topSpeed;

    protected Vehicle(VehicleBuilder builder) {
        this.type = builder.type;
        this.brand = builder.brand;
        this.capacity = builder.capacity;
        this.topSpeed = builder.topSpeed;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void accelerate(){
        System.out.println(String.format("%d seated %s %s is accelerating",capacity, type, brand));
    }
    public void brake(){
        System.out.println(String.format("%s is turning",brand));
    }
    public void turn(){
        System.out.println(String.format("%s is braking",brand));
    }

    /*
        Builder pattern is used here for creating a vehicle object
     */
    public static class VehicleBuilder {
        private String type;
        private int capacity;
        private String brand;
        private int topSpeed;

        public VehicleBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public VehicleBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public VehicleBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public VehicleBuilder setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
            return this;
        }

        public Vehicle build() {
            Vehicle vehicle = new Vehicle(this);
            return vehicle;
        }
    }
}
