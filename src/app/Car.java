package app;

import static java.lang.IO.println;

public class Car {
    private final String _model;
    private final int _year;
    private final int _horsePower;

    public Car(String model, int year, int horsePower) {
        this._model = model;
        this._year = year;
        this._horsePower = horsePower;
    }

    public void start() {
        println("Starting the Car...");

        startElectricity();
        startCommand();
        startFuelSystem();

        println("The car started");
    }

    public void getCarInfo() {
        println("Model: " + this._model);
        println("Year: " + this._year);
        println("Horse Power: " + this._horsePower);
    }

    private void startElectricity(){
        println("Starting the Electricity");
    }

    private void startCommand(){
        println("Starting the Command");
    }

    private void startFuelSystem(){
        println("Starting the Fuel System");
    }

}
