package ua.lviv.lgs.task1;

import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private double engine;
    public int NumberOfDoors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public Car(String name, String model, double engine, int numberOfDoors) {
        this.name = name;
        this.model = model;
        this.engine = engine;
        NumberOfDoors = numberOfDoors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.getEngine(), getEngine()) == 0 &&
                getNumberOfDoors() == car.getNumberOfDoors() &&
                Objects.equals(getName(), car.getName()) &&
                Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getEngine(), getNumberOfDoors());
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                ", NumberOfDoors=" + NumberOfDoors +
                '}';
    }
    public void myMethods(String a, int ... args){
        System.out.println(a+" "+args);
    }
    public void myMethods(String... args){
        System.out.println(args);
    }
}
