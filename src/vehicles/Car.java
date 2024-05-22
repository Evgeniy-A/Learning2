package vehicles;

import details.Engine;
import professions.Driver;

public class Car {
    String model;
    double weight;
    Driver driver;

    Engine engine;

    public Car(String model, double weight, Driver driver, Engine engine) {
        this.model = model;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }
}
