package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

    }
     public void clone(List<Vehicle> vehicles) {
         List<Vehicle> copyList = new ArrayList<>();
         for (Vehicle vehicle : vehicles) {
             copyList.add(vehicle.clone());
         }
     }
}
