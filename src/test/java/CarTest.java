import CarParts.Body;
import CarParts.CombustionEngine;
import CarParts.Tyres;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;
    private CombustionEngine engine;
    private Tyres tyres;
    private Body body;

    @Before
    public void before(){
        engine = new CombustionEngine(120);
        tyres = new Tyres("winter","Michellen");
        body = new Body("Carbon Fiber", "Metal grey", "Monster truck");
        car = new Car(45000.99, "Metal grey", engine, tyres, body);
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
