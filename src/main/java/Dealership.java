import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;


    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public double getTill() {
        return till;
    }

    public int stockSize(){
        return stock.size();
    }

    public void buyVehicle(Vehicle vehicle){
        double price = vehicle.getPrice();
        till -= price;
        stock.add(vehicle);
    }

    public void sellVehicle(Customer customer, Vehicle vehicle){
        double price = vehicle.getPrice();
        double customerMoney = customer.getMoney();
        if(stock.contains(vehicle) && price <= customerMoney){
            customer.buyVehicle(vehicle);
            stock.remove(vehicle);
            this.till += price;
        }
    }

    public void repairVehicle(Vehicle vehicle){
        double damage = vehicle.getDamage();
        if(damage <= till){
            till -= damage;
            vehicle.setDamage(0.00);
        }
    }
}
