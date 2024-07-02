package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Toyota", "Camry", 2023),
            new Car("BMW", "M5", 2022),
            new Car("Mercedes-Benz", "S-Class", 2021),
            new Car("Audi", "R8", 2020),
            new Car("Porsche", "911", 2019)
    );

    public List<Car> findAll() {
        return cars;
    }

    public List<Car> findLimited(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
