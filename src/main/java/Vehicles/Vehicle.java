package Vehicles;

import CarParts.Body;
import CarParts.Engine;
import CarParts.Tyres;

public abstract class Vehicle {

    private double price;
    private String color;
    private Engine engine;
    private Tyres tyres;
    private Body body;
    private double damage;

    public Vehicle(double price, String color, Engine engine, Tyres tyres, Body body) {
        this.price = price;
        this.color = color;
        this.engine = engine;
        this.tyres = tyres;
        this.body = body;
        this.damage = 0.00;
    }

    public double getPrice() {
        return price - damage;
    }

    public String getColor() {
        return color;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Body getBody() {
        return body;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
