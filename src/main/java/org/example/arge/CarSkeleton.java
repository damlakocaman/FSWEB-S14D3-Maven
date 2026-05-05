package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;


    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Engine started");
        return "Engine started";
    }

    public String drive() {
        System.out.println("Driving");
        runEngine(); 
        return "Driving";
    }

    protected void runEngine() {
        System.out.println("Engine is running");
    }
}