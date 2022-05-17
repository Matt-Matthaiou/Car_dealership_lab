package Vehicles;

import CarParts.Body;
import CarParts.ElectricEngine;
import CarParts.Tyres;

public class ElectricCar extends Vehicle{

    public ElectricCar(double price, String color, ElectricEngine engine, Tyres tyres, Body body){
        super(price,color, engine, tyres, body);
    }
}
