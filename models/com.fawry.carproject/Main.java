package models.com.fawry.carproject;

import models.com.fawry.carproject.factory.CarFactory;
import models.com.fawry.carproject.car.CarInterface;
import models.com.fawry.carproject.engine.EngineType;

public class Main {
    public static void main(String[] args) {
    // CAR 1 "GAS CAR"
        System.out.println("GAS CAR");
        CarInterface gasCar =  CarFactory.createCar(EngineType.GAS);
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();
        gasCar.brake();
        gasCar.brake();
        gasCar.brake();
        gasCar.stop();
        System.out.println("ElECTRIC CAR");
        CarInterface electricCar =  CarFactory.createCar(EngineType.ELECTRIC);
        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.brake();
        electricCar.stop();
        electricCar.brake();
        electricCar.brake();
        electricCar.brake();
        electricCar.stop();
        System.out.println("HYBRID CAR");
        CarInterface hybridCar =  CarFactory.createCar(EngineType.HYBRID);
        hybridCar.start();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.brake();
        hybridCar.stop();
        hybridCar.brake();
        hybridCar.brake();
        hybridCar.brake();
        hybridCar.stop();

        System.out.println("ENGINE REPLACEMENT");
        System.out.println("Replacing Hybrid Car's engine with a Gas Engine...");
        CarFactory.replaceEngine(hybridCar, EngineType.GAS);
        hybridCar.start();
        hybridCar.accelerate();
        System.out.println("The engine replacement was successful!");
    }

}
