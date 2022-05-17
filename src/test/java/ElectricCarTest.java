import CarParts.Body;
import CarParts.CombustionEngine;
import CarParts.ElectricEngine;
import CarParts.Tyres;
import Vehicles.Car;
import Vehicles.ElectricCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar car;
    private ElectricEngine engine;
    private Tyres tyres;
    private Body body;

    @Before
    public void before(){
        engine = new ElectricEngine(120);
        tyres = new Tyres("winter","Michellen");
        body = new Body("Carbon Fiber", "Metal grey", "Monster truck");
        car = new ElectricCar(45000.99, "Metal grey", engine, tyres, body);
    }

    @Test
    public void hasAtributes(){
        assertEquals(45000.99, car.getPrice(), 0.0);
        assertEquals("Metal grey", car.getColor());
        assertEquals(engine, car.getEngine());
        assertEquals(tyres, car.getTyres());
        assertEquals(body, car.getBody());

    }
}
