import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Vehicle> vehicleList;



    public Customer(double money) {
        this.money = money;
        this.vehicleList = new ArrayList<>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getVehicleList() {
        return vehicleList;
    }

    public int vehicleListSize(){
        return vehicleList.size();
    }

    public void buyVehicle(Vehicle vehicle){
        double price = vehicle.getPrice();
        if(price <= this.money) {
            vehicleList.add(vehicle);
            this.money -= price;
        }
    }
}
