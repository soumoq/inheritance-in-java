package c;

import java.util.*;

public class Abc {
    public static void main(String[] args) {
        Car c = new Car();
        c.setSpeed(100);
        c.setWseals(4);
        c.setPassenger(4);
        System.out.println("speed: " + c.getSpeed());
        System.out.println("wheals: " + c.getWseals());
        System.out.println("passengers: " + c.getPassenger());


        System.out.println("\n");

        Truck t = new Truck();
        t.setSpeed(40);
        t.setWseals(6);
        t.setLoadLimit(50);
        System.out.println("speed: " + t.getSpeed());
        System.out.println("wheals: " + t.getWseals());
        System.out.println("LoadLimit: " + t.getLoadLimit());

        System.out.println("\n");

        if (c.getSpeed() > t.getSpeed()) {
            System.out.println("Truck : slower");
            System.out.println("Car : Faster");
        }

    }
}

class Vehicle {
    protected int wheals;
    protected float speed;
    protected int loadLimit;
    protected int passengers;
}

class Car extends Vehicle {
    public Car() {
        System.out.println("Car");
    }

    public int getWseals() {
        return wheals;
    }

    public float getSpeed() {
        return speed;
    }

    public int getPassenger() {
        return passengers;
    }

    public void setPassenger(int passengers) {
        super.passengers = passengers;
    }

    public void setWseals(int wseals) {
        super.wheals = wseals;
    }

    public void setSpeed(float speed) {
        super.speed = speed;
    }
}

class Truck extends Vehicle {
    public Truck() {
        System.out.println("Truck");
    }

    public int getWseals() {
        return wheals;
    }

    public float getSpeed() {
        return speed;
    }

    public int getLoadLimit() {
        return loadLimit;
    }

    public void setWseals(int wseals) {
        super.wheals = wseals;
    }

    public void setSpeed(float speed) {
        super.speed = speed;
    }

    public void setLoadLimit(int loadLimit) {
        super.loadLimit = loadLimit;
    }

}
