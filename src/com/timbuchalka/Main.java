package com.timbuchalka;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine() {
        return "Starting the engine";
    }

    public String accelerate() {
        return "Accelerating now";
    }

    public String brake() {
        return "Braking now";
    }
}

class Porshe extends Car {
    public Porshe(String name, boolean engine, int cylinders, int wheels) {
        super(name, engine, cylinders, wheels);
    }

    @Override
    public String startEngine() {
        return "Starting the engine inside " + getName() + "type of Porshe class";
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getName() + "type of Porshe class";
    }

    @Override
    public String brake() {
        return "Braking " + getName() + "type of Porshe class";
    }
}

class Mercedes extends Car {
    public Mercedes(String name, boolean engine, int cylinders, int wheels) {
        super(name, engine, cylinders, wheels);
    }

    @Override
    public String startEngine() {
        return "Starting the engine inside " + getName() + "type of Mercedes class";
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getName() + "type of Mercedes class";
    }

    @Override
    public String brake() {
        return "Braking " + getName() + "type of Mercedes class";
    }
}

class Masserati extends Car {
    public Masserati(String name, boolean engine, int cylinders, int wheels) {
        super(name, engine, cylinders, wheels);
    }

    @Override
    public String startEngine() {
        return "Starting the engine inside " + getName() + "type of Masserati class";
    }

    @Override
    public String accelerate() {
        return "Accelerating " + getName() + "type of Masserati class";
    }

    @Override
    public String brake() {
        return "Braking " + getName() + "type of Masserati class";
    }
}


public class Main {

    public static void main(String[] args) {
        /*
        create a base class called car
        it should have few fields that would be best for a generic car class like engine, cylinders, wheels etc.
        constructor should initialize cylinders(number of) and name, and set wheels to 4 and engine to true
        cylinders and names would be bpassed parameters
        //
        create getters
        //
        create some methods like start engine, accelerate and brake
        //
        show a message for each in the base class
        now create 3 sub classes for your favorite vehicles
        override the appropiate methods to demonstrate polymorphism in use
        //
        put all classes in one java file
         */

    }
}
