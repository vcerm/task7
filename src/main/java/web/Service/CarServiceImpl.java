package web.Service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> cars(List<Car> cars, int count) {
        if (count > cars.size()) count = cars.size();
        return cars.subList(0, count--);
    }
}
