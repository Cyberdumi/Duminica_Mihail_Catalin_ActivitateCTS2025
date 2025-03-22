package Prototype;

public class Bus extends Vehicle{
    private int doors;

    protected Bus(Vehicle vehicle) {
        super(vehicle);
    }


    @Override
    public Vehicle clone() {
        return new Bus(this);
    }
}
