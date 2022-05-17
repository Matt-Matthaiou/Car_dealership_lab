import CarParts.Body;
import CarParts.ElectricEngine;
import CarParts.Tyres;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private ElectricCar car;
    private ElectricEngine engine;
    private Tyres tyres;
    private Body body;
    private Customer customer;

    @Before
    public void before(){
        engine = new ElectricEngine(120);
        tyres = new Tyres("winter","Michellen");
        body = new Body("Carbon Fiber", "Metal grey", "Monster truck");
        car = new ElectricCar(45000.00, "Metal grey", engine, tyres, body);
        customer = new Customer(46000.00);
    }

    @Test
    public void customerCanBuy(){
        customer.buyVehicle(car);
        assertEquals(1000.00, customer.getMoney(), 0.00);
        assertEquals(1, customer.vehicleListSize());
    }
}
