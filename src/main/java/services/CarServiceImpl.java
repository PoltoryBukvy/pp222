package services;

import models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Nissan", "Qashqai", 777));
        cars.add(new Car("Renault", "Logan", 333));
        cars.add(new Car("Opel", "Astra", 111));
        cars.add(new Car("Mitsubishi", "Lancer", 222));
        cars.add(new Car("Honda", "CBRf4i", 444));
    }
    @Override
    public List<Car> getCars(int count) {
        return cars.subList(0, count);
    }

}
