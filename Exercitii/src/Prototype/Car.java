package Prototype;

public class Car extends Vehicle {

    private int topSpeed;


    public Car(Car car){
        super(car);
        this.topSpeed = car.topSpeed;
    }
    public Car clone(){
        return new Car(this);
    }


}
