package Visitor.models;


import Visitor.Visitor;

public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return "";
    }
}