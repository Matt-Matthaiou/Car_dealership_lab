import CarParts.Body;
import CarParts.ElectricEngine;
import CarParts.Tyres;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private ElectricCar car;
    private ElectricEngine engine;
    private Tyres tyres;
    private Body body;
    private Customer customer;
    private Dealership dealership;

    @Before
    public void before(){
        engine = new ElectricEngine(120);
        tyres = new Tyres("winter","Michellen");
        body = new Body("Carbon Fiber", "Metal grey", "Monster truck");
        car = new ElectricCar(45000.00, "Metal grey", engine, tyres, body);
        customer = new Customer(46000.00);
        dealership = new Dealership(90000.00);
    }

    @Test
    public void dealershipCanBuyAndSellCars(){
        dealership.buyVehicle(car);
        dealership.sellVehicle(customer, car);
        assertEquals(90000, dealership.getTill(), 0.00);
        assertEquals(0, dealership.stockSize());
    }

    @Test
    public void canRepairVehicles(){
        dealership.buyVehicle(car);
        car.setDamage(1000.00);
        dealership.repairVehicle(car);
        assertEquals(44000, dealership.getTill(), 0.00);
        assertEquals(0.00, car.getDamage(), 0.00);
    }
}
