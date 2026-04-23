package models.com.fawry.carproject.car;

import models.com.fawry.carproject.engine.Engine;

public interface CarInterface {
    void start();
    void stop();
    void accelerate();
    void brake();
    void setEngine(Engine engine);
    Engine getEngine();
}
