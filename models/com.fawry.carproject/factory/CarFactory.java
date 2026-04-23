package models.com.fawry.carproject.factory;


import models.com.fawry.carproject.car.Car;
import models.com.fawry.carproject.car.CarInterface;
import models.com.fawry.carproject.engine.ElectricEngine;
import models.com.fawry.carproject.engine.EngineType;
import models.com.fawry.carproject.engine.GasEngine;
import models.com.fawry.carproject.engine.HybridEngine;

public class CarFactory {
    public static CarInterface createCar(EngineType engineType) {
        switch (engineType) {
            case GAS:
                return new Car(new GasEngine(0));
            case ELECTRIC:
                return new Car(new ElectricEngine(0));
            case HYBRID:
                return new Car(new HybridEngine());
            default:
                throw new IllegalArgumentException("Car not supported");

        }
    }
    public static void replaceEngine(CarInterface car, EngineType newEngine) {
        switch (newEngine) {
            case GAS:
                car.setEngine(new GasEngine(0));
                break;
            case ELECTRIC:
                car.setEngine(new ElectricEngine(0));
                break;
            case HYBRID:
                car.setEngine(new HybridEngine());
                break;
            default:
                break;

        }
    }
}
