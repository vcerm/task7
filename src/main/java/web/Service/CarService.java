package web.Service;

import web.module.Car;

import java.util.List;

public interface CarService {
    List<Car> cars(List<Car> cars, int count);
}
