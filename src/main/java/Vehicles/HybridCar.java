package Vehicles;

import CarParts.Body;
import CarParts.HybridEngine;
import CarParts.Tyres;

public class HybridCar extends Vehicle{

    public HybridCar(double price, String color, HybridEngine engine, Tyres tyres, Body body){
        super(price, color, engine, tyres, body );
    }
}
