package view;

import domain.Car;
import domain.Cars;
import util.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static Cars readRacingCars(String input) {
        List<String> cars = ValidationUtil.getCars(input);
        return mapCars(cars);
    }

    private static Cars mapCars(List<String> cars) {
        List<Car> result = new ArrayList<>();
        for (String car : cars) {
            result.add(new Car(car));
        }
        return new Cars(result);
    }

    public static int readTryCount(String input) {
        return Integer.parseInt(input);
    }
}
