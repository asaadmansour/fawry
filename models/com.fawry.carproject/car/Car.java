package models.com.fawry.carproject.car;

import models.com.fawry.carproject.engine.Engine;
import models.com.fawry.carproject.engine.EngineObserver;

import java.util.ArrayList;
import java.util.List;

public class Car implements CarInterface {
    private Engine engine;
    private final Integer MINIMUM_CAR_SPEED = 0;
    private final Integer MAXIMUM_CAR_SPEED = 200;
    private Integer carSpeed = 0;
    private List<EngineObserver> engines = new ArrayList<>();
    public Car(Engine engine) {
        this.engine = engine;
        addEngine(engine);
    }
    @Override
    public void start() {
        Integer INITIAL_SPEED = 0;
        engine.setEngineSpeed(INITIAL_SPEED);
        System.out.println("Car started with initial speed " + INITIAL_SPEED);
    }

    @Override
    public void stop() {
        if (engine.getEngineSpeed() != 0 ) {
            System.out.println("Engine speed must be 0 to be able to stop!");
            return;
        }
        System.out.println("car stopped successfully!");
    }

    @Override
    public void accelerate() {
        if (carSpeed >= MAXIMUM_CAR_SPEED) {
            System.out.println("Cannot accelerate, you have reached the maximum car speed");
            return;
        }
        carSpeed += 20;
        notifyEngines();
        System.out.println("Car speed increased by 20, and the current car speed is " + carSpeed);
    }

    @Override
    public void brake() {
        if (carSpeed <= MINIMUM_CAR_SPEED ) {
            System.out.println("Cannot brake car is already not moving!");
            return;
        }
        carSpeed -= 20;
        notifyEngines();
        System.out.println("Car speed decreased by 20, and the current car speed is " + carSpeed);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        engines.clear();
        engines.add(engine);
    }



    public Engine getEngine() {
        return engine;
    }
    public void addEngine(EngineObserver engine) {
        engines.add(engine);
    }
    private void notifyEngines() {
        for (EngineObserver e : engines) {
            e.onSpeedChange(carSpeed);
        }
    }
}
