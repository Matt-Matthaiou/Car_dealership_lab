package Vehicles;

import CarParts.Body;
import CarParts.CombustionEngine;
import CarParts.Tyres;

public class Car extends Vehicle{


    public Car(double price, String color, CombustionEngine engine, Tyres tyres, Body body){
        super(price, color, engine, tyres, body);

    }
}
