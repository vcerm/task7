package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import web.models.Car;

import java.util.Arrays;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarService carService = new CarServiceImpl();

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String CarsListByCount(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.cars(Arrays.asList(
                new Car(1, "Mazda", "Ptichka"),
                new Car(2, "BMW", "Tank"),
                new Car(3, "Tesla", "Batareyka"),
                new Car(4, "Porshe", "Mashinka"),
                new Car(5, "Ferrari", "Richard")
        ), count));
        return "cars";
    }
}
