import CarParts.Body;
import CarParts.CombustionEngine;
import CarParts.HybridEngine;
import CarParts.Tyres;
import Vehicles.Car;
import Vehicles.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar car;
    private HybridEngine engine;
    private Tyres tyres;
    private Body body;

    @Before
    public void before(){
        engine = new HybridEngine(120);
        tyres = new Tyres("winter","Michellen");
        body = new Body("Carbon Fiber", "Metal grey", "Monster truck");
        car = new HybridCar(45000.00, "Metal grey", engine, tyres, body);
    }

    @Test
    public void hasAtributes(){
        assertEquals(45000.00, car.getPrice(), 0.0);
        assertEquals("Metal grey", car.getColor());
        assertEquals(engine, car.getEngine());
        assertEquals(tyres, car.getTyres());
        assertEquals(body, car.getBody());

    }

    @Test
    public void carGetDamaged(){
        car.setDamage(1000.00);
        assertEquals(1000.00, car.getDamage(), 0.00);
        assertEquals(44000.00, car.getPrice(), 0.00);
    }
}
